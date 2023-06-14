package sk.uniza.fri.autoskola.data;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001c"}, d2 = {"Lsk/uniza/fri/autoskola/data/TestResult;", "", "points", "", "outOf", "date", "", "successful", "", "(IILjava/lang/String;Z)V", "_date", "_outOf", "_points", "_successful", "getDate", "()Ljava/lang/String;", "id", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getOutOf", "()I", "getPoints", "getSuccessful", "()Z", "Companion", "app_debug"})
@androidx.room.Entity
public final class TestResult {
    @androidx.room.PrimaryKey(autoGenerate = true)
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer id;
    private int _points;
    private int _outOf;
    @org.jetbrains.annotations.NotNull
    private java.lang.String _date;
    private boolean _successful;
    @org.jetbrains.annotations.NotNull
    public static final sk.uniza.fri.autoskola.data.TestResult.Companion Companion = null;
    
    public TestResult(int points, int outOf, @org.jetbrains.annotations.NotNull
    java.lang.String date, boolean successful) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    public final int getPoints() {
        return 0;
    }
    
    public final int getOutOf() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDate() {
        return null;
    }
    
    public final boolean getSuccessful() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004\u00a8\u0006\t"}, d2 = {"Lsk/uniza/fri/autoskola/data/TestResult$Companion;", "", "()V", "fromDate", "", "date", "Ljava/time/LocalDateTime;", "toDate", "dateString", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.time.LocalDateTime toDate(@org.jetbrains.annotations.NotNull
        java.lang.String dateString) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String fromDate(@org.jetbrains.annotations.NotNull
        java.time.LocalDateTime date) {
            return null;
        }
    }
}