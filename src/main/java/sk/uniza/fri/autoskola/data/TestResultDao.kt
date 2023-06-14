package sk.uniza.fri.autoskola.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert

@Dao
interface TestResultDao {

    /**
     * Inserts/Updates a test result.
     */
    @Upsert
    suspend fun upsertResult(testResult: TestResult)

    /**
     * Deletes a test result.
     */
    @Delete
    suspend fun deleteResult(testResult: TestResult)

    /**
     * Gets the results.
     * @return List of all results orderd by id descending in LiveData
     */
    @Query("SELECT * FROM TestResult ORDER BY id DESC")
    fun getResults(): LiveData<List<TestResult>>
}