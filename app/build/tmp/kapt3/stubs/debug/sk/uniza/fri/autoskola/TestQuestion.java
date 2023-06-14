package sk.uniza.fri.autoskola;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u001cH\u0016J\b\u0010&\u001a\u00020\u001cH\u0002J\u0010\u0010\'\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u000e\u0010(\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020+J\b\u0010,\u001a\u00020\u001cH\u0002J\b\u0010-\u001a\u00020\u001cH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006."}, d2 = {"Lsk/uniza/fri/autoskola/TestQuestion;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lsk/uniza/fri/autoskola/databinding/TestQuestionBinding;", "_currentQuestion", "Lsk/uniza/fri/autoskola/data/Questions$Question;", "_parent", "Lsk/uniza/fri/autoskola/Test;", "get_parent", "()Lsk/uniza/fri/autoskola/Test;", "_timer", "Landroid/os/CountDownTimer;", "answered", "", "binding", "getBinding", "()Lsk/uniza/fri/autoskola/databinding/TestQuestionBinding;", "currentQuestion", "getCurrentQuestion", "()Lsk/uniza/fri/autoskola/data/Questions$Question;", "getButtonByIndex", "Landroid/widget/Button;", "index", "", "getNumberString", "", "nextQuestion", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "resetButtonColors", "revealAnswer", "selectAnswer", "setTimerText", "time", "", "startTest", "updateQuestion", "app_debug"})
public final class TestQuestion extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable
    private sk.uniza.fri.autoskola.databinding.TestQuestionBinding _binding;
    @org.jetbrains.annotations.Nullable
    private sk.uniza.fri.autoskola.data.Questions.Question _currentQuestion;
    @org.jetbrains.annotations.Nullable
    private android.os.CountDownTimer _timer;
    private boolean answered = false;
    
    public TestQuestion() {
        super();
    }
    
    private final sk.uniza.fri.autoskola.databinding.TestQuestionBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.uniza.fri.autoskola.data.Questions.Question getCurrentQuestion() {
        return null;
    }
    
    private final sk.uniza.fri.autoskola.Test get_parent() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    /**
     * Starts the test
     */
    private final void startTest() {
    }
    
    /**
     * Updates the UI of the question
     */
    private final void updateQuestion() {
    }
    
    /**
     * Called when user selects an answer
     * @param index Index of the selected answer
     */
    public final void selectAnswer(int index) {
    }
    
    /**
     * Reveals the correct answer
     */
    private final void revealAnswer(int index) {
    }
    
    /**
     * Resets the button color. (After an answer was revealed)
     */
    private final void resetButtonColors() {
    }
    
    /**
     * Gets a button by its index
     * @param index Index of the Button
     * @return Button with the index
     */
    private final android.widget.Button getButtonByIndex(int index) {
        return null;
    }
    
    /**
     * Handles transition to the next question / end of the test.
     */
    public final void nextQuestion() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    /**
     * Returns formatted question number.
     * @return Formatted string
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNumberString() {
        return null;
    }
    
    /**
     * Returns formatted timer.
     * @return Formatted string
     */
    public final void setTimerText(long time) {
    }
}