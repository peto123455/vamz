package sk.uniza.fri.autoskola.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDateTime

@Entity
class TestResult(points: Int, outOf: Int, date: String, successful: Boolean = true) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null

    private var _points: Int = points
    private var _outOf: Int = outOf
    private var _date: String = date
    private var _successful: Boolean = successful

    val points get() = _points
    val outOf get() = _outOf
    val date get() = _date
    val successful get() = _successful

    companion object {
        fun toDate(dateString: String): LocalDateTime {
            return LocalDateTime.parse(dateString)
        }

        fun fromDate(date: LocalDateTime): String {
            return date.toString()
        }
    }
}