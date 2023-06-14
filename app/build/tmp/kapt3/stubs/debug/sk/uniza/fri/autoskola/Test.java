package sk.uniza.fri.autoskola;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001eJ\b\u0010 \u001a\u00020\u0004H\u0002J\u0006\u0010!\u001a\u00020\"J\b\u0010#\u001a\u00020\u001eH\u0002J$\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020\u001eH\u0016J\b\u0010-\u001a\u00020\u001eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00168F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006."}, d2 = {"Lsk/uniza/fri/autoskola/Test;", "Landroidx/fragment/app/Fragment;", "()V", "_answered", "", "_answeredCorrectly", "_binding", "Lsk/uniza/fri/autoskola/databinding/TestBinding;", "_callback", "Landroidx/activity/OnBackPressedCallback;", "_minimumPoints", "_points", "_questions", "", "Lsk/uniza/fri/autoskola/data/Questions$Question;", "answered", "getAnswered", "()I", "binding", "getBinding", "()Lsk/uniza/fri/autoskola/databinding/TestBinding;", "isSuccessful", "", "()Z", "points", "getPoints", "questions", "getQuestions", "()Ljava/util/List;", "addPoints", "", "finish", "getMaxPoints", "getScoreText", "", "handleHackButton", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "testInit", "app_debug"})
public final class Test extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<sk.uniza.fri.autoskola.data.Questions.Question> _questions = null;
    @org.jetbrains.annotations.Nullable
    private sk.uniza.fri.autoskola.databinding.TestBinding _binding;
    private int _answered = 0;
    private int _answeredCorrectly = 0;
    private int _points = 0;
    private int _minimumPoints = 90;
    private androidx.activity.OnBackPressedCallback _callback;
    
    public Test() {
        super();
    }
    
    private final sk.uniza.fri.autoskola.databinding.TestBinding getBinding() {
        return null;
    }
    
    public final int getAnswered() {
        return 0;
    }
    
    public final int getPoints() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<sk.uniza.fri.autoskola.data.Questions.Question> getQuestions() {
        return null;
    }
    
    /**
     * Adds points to the score
     * @param points The amount of points to be added
     */
    public final void addPoints(int points) {
    }
    
    /**
     * Called when an answer was answered
     */
    public final void answered() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void handleHackButton() {
    }
    
    /**
     * Initializes the test
     */
    private final void testInit() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    /**
     * Gets a formatted test result string
     * @return Formatted string
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getScoreText() {
        return null;
    }
    
    /**
     * Returns the maximum amount of points possible
     * @return Max points
     */
    private final int getMaxPoints() {
        return 0;
    }
    
    /**
     * Finishes the test
     */
    public final void finish() {
    }
    
    public final boolean isSuccessful() {
        return false;
    }
}