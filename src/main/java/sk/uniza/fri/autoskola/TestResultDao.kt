package sk.uniza.fri.autoskola

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface TestResultDao {

    @Upsert
    suspend fun upsertResult(testResult: TestResult)

    @Delete
    suspend fun deleteResult(testResult: TestResult)

    @Query("SELECT * FROM TestResult ORDER BY id DESC")
    fun getResults(): LiveData<List<TestResult>>
}