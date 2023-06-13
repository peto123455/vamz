package sk.uniza.fri.autoskola

import android.content.Context
import androidx.room.Room
import com.google.gson.Gson
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import com.google.gson.stream.JsonReader
import java.io.InputStreamReader
import kotlin.random.Random


class Questions() {

    data class Category(val name: String, val min: Int, val max: Int, val points: Int) {
        private val _questions: MutableList<Question> = ArrayList()

        val questions get() = _questions
    }

    data class Question(val question: String, val answer: Int, val image: String, val answer1: String, val answer2: String, val answer3: String, var category: Category)

    private val _categories: MutableList<Category> = ArrayList()

    val categories get() = _categories

    fun loadJson(context: Context) {

        try {
            val inputStreamReader = InputStreamReader(context.assets.open("data.json"))

            var root = JsonParser().parse(inputStreamReader).asJsonObject

            for (category in root.entrySet()) {
                val categoryTmp = category.value.asJsonObject
                val categoryObj = Category(categoryTmp.get("title").asString, categoryTmp.get("min").asInt, categoryTmp.get("max").asInt, categoryTmp.get("points").asInt)

                _categories.add(categoryObj)

                for (question in categoryTmp.get("questions").asJsonObject.entrySet()) {
                    val questionTmp = question.value.asJsonObject

                    categoryObj.questions.add(Question(questionTmp.get("question").asString, questionTmp.get("right_answer").asInt, questionTmp.get("image").asString, questionTmp.get("answer1").asString, questionTmp.get("answer2").asString, questionTmp.get("answer3").asString, categoryObj))
                }
            }

            inputStreamReader.close()

        } catch (e: Exception) {
            println(e)
        }
    }

    fun generateQuestions(): MutableList<Question> {
        val list: MutableList<Question> = ArrayList()

        for (category in _categories) {
            for (i in 0..(category.max-category.min)) {
                while (true) {
                    val question = category.questions[Random.nextInt(category.questions.size)]
                    if (list.contains(question)) continue

                    list.add(question)
                    break
                }
            }
        }

        return list
    }
}