package sk.uniza.fri.autoskola;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001bH\u0016J\u000e\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012\u00a8\u0006$"}, d2 = {"Lsk/uniza/fri/autoskola/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "_appBarConfiguration", "Landroidx/navigation/ui/AppBarConfiguration;", "_binding", "Lsk/uniza/fri/autoskola/databinding/ActivityMainBinding;", "_currentCategory", "", "_questions", "Lsk/uniza/fri/autoskola/data/Questions;", "currentCategory", "getCurrentCategory", "()I", "generateQuestions", "", "Lsk/uniza/fri/autoskola/data/Questions$Question;", "getGenerateQuestions", "()Ljava/util/List;", "getCategories", "Lsk/uniza/fri/autoskola/data/Questions$Category;", "getGetCategories", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onSupportNavigateUp", "setCategory", "value", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private androidx.navigation.ui.AppBarConfiguration _appBarConfiguration;
    private sk.uniza.fri.autoskola.databinding.ActivityMainBinding _binding;
    @org.jetbrains.annotations.NotNull
    private final sk.uniza.fri.autoskola.data.Questions _questions = null;
    private int _currentCategory = -1;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<sk.uniza.fri.autoskola.data.Questions.Question> getGenerateQuestions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<sk.uniza.fri.autoskola.data.Questions.Category> getGetCategories() {
        return null;
    }
    
    public final int getCurrentCategory() {
        return 0;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    public final void setCategory(int value) {
    }
}