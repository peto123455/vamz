package sk.uniza.fri.autoskola.data;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0019\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lsk/uniza/fri/autoskola/data/TestResultDao;", "", "deleteResult", "", "testResult", "Lsk/uniza/fri/autoskola/data/TestResult;", "(Lsk/uniza/fri/autoskola/data/TestResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getResults", "Landroidx/lifecycle/LiveData;", "", "upsertResult", "app_debug"})
@androidx.room.Dao
public abstract interface TestResultDao {
    
    /**
     * Inserts/Updates a test result.
     */
    @androidx.room.Upsert
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object upsertResult(@org.jetbrains.annotations.NotNull
    sk.uniza.fri.autoskola.data.TestResult testResult, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    /**
     * Deletes a test result.
     */
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteResult(@org.jetbrains.annotations.NotNull
    sk.uniza.fri.autoskola.data.TestResult testResult, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    /**
     * Gets the results.
     * @return List of all results orderd by id descending in LiveData
     */
    @androidx.room.Query(value = "SELECT * FROM TestResult ORDER BY id DESC")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<sk.uniza.fri.autoskola.data.TestResult>> getResults();
}