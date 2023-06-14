package sk.uniza.fri.autoskola;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lsk/uniza/fri/autoskola/RecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lsk/uniza/fri/autoskola/RecyclerAdapter$ViewHolder;", "context", "Landroid/content/Context;", "list", "Landroidx/lifecycle/LiveData;", "", "Lsk/uniza/fri/autoskola/data/TestResult;", "(Landroid/content/Context;Landroidx/lifecycle/LiveData;)V", "_context", "_tests", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class RecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<sk.uniza.fri.autoskola.RecyclerAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.LiveData<java.util.List<sk.uniza.fri.autoskola.data.TestResult>> _tests;
    @org.jetbrains.annotations.NotNull
    private android.content.Context _context;
    
    public RecyclerAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<java.util.List<sk.uniza.fri.autoskola.data.TestResult>> list) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public sk.uniza.fri.autoskola.RecyclerAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    sk.uniza.fri.autoskola.RecyclerAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lsk/uniza/fri/autoskola/RecyclerAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "_date", "Landroid/widget/TextView;", "_image", "Landroid/widget/ImageView;", "_removeButton", "Landroid/widget/ImageButton;", "_title", "date", "getDate", "()Landroid/widget/TextView;", "image", "getImage", "()Landroid/widget/ImageView;", "removeButton", "getRemoveButton", "()Landroid/widget/ImageButton;", "title", "getTitle", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView _title;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView _date;
        @org.jetbrains.annotations.NotNull
        private android.widget.ImageView _image;
        @org.jetbrains.annotations.NotNull
        private android.widget.ImageButton _removeButton;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getDate() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getImage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageButton getRemoveButton() {
            return null;
        }
    }
}