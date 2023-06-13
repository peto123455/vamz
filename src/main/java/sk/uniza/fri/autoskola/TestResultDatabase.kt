package sk.uniza.fri.autoskola

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [TestResult::class],
    version = 1
)
abstract class TestResultDatabase: RoomDatabase() {

    abstract val dao: TestResultDao

    companion object {
        @Volatile
        private var INSTANCE : TestResultDatabase? = null

        fun getDB(context: Context): TestResultDatabase {
            val tmp = INSTANCE
            if (INSTANCE != null) {
                return tmp!!
            }
            synchronized(this) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    TestResultDatabase::class.java,
                    "testResults.db"
                ).build()

                return INSTANCE!!
            }
        }
    }
}