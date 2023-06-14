package sk.uniza.fri.autoskola.data;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\fH\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lsk/uniza/fri/autoskola/data/Questions;", "", "()V", "_categories", "", "Lsk/uniza/fri/autoskola/data/Questions$Category;", "categories", "getCategories", "()Ljava/util/List;", "generateQuestions", "Lsk/uniza/fri/autoskola/data/Questions$Question;", "categoryId", "", "handleGenerateCategoryQuestions", "category", "size", "loadJson", "", "context", "Landroid/content/Context;", "Category", "Question", "app_debug"})
public final class Questions {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<sk.uniza.fri.autoskola.data.Questions.Category> _categories = null;
    
    public Questions() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<sk.uniza.fri.autoskola.data.Questions.Category> getCategories() {
        return null;
    }
    
    /**
     * Loads all the questions from json "data.json"
     * @param context Context
     */
    public final void loadJson(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    /**
     * Returns generated questions
     * @return Generated questions
     */
    @org.jetbrains.annotations.NotNull
    public final java.util.List<sk.uniza.fri.autoskola.data.Questions.Question> generateQuestions(int categoryId) {
        return null;
    }
    
    private final java.util.List<sk.uniza.fri.autoskola.data.Questions.Question> handleGenerateCategoryQuestions(sk.uniza.fri.autoskola.data.Questions.Category category, int size) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001f"}, d2 = {"Lsk/uniza/fri/autoskola/data/Questions$Category;", "", "name", "", "min", "", "max", "points", "(Ljava/lang/String;III)V", "_questions", "", "Lsk/uniza/fri/autoskola/data/Questions$Question;", "getMax", "()I", "getMin", "getName", "()Ljava/lang/String;", "getPoints", "questions", "getQuestions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
    public static final class Category {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String name = null;
        private final int min = 0;
        private final int max = 0;
        private final int points = 0;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<sk.uniza.fri.autoskola.data.Questions.Question> _questions = null;
        
        public Category(@org.jetbrains.annotations.NotNull
        java.lang.String name, int min, int max, int points) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getName() {
            return null;
        }
        
        public final int getMin() {
            return 0;
        }
        
        public final int getMax() {
            return 0;
        }
        
        public final int getPoints() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<sk.uniza.fri.autoskola.data.Questions.Question> getQuestions() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int component4() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.uniza.fri.autoskola.data.Questions.Category copy(@org.jetbrains.annotations.NotNull
        java.lang.String name, int min, int max, int points) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u000bH\u00c6\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\u0005H\u00d6\u0001J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010\u00a8\u0006&"}, d2 = {"Lsk/uniza/fri/autoskola/data/Questions$Question;", "", "question", "", "answer", "", "image", "answer1", "answer2", "answer3", "category", "Lsk/uniza/fri/autoskola/data/Questions$Category;", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsk/uniza/fri/autoskola/data/Questions$Category;)V", "getAnswer", "()I", "getAnswer1", "()Ljava/lang/String;", "getAnswer2", "getAnswer3", "getCategory", "()Lsk/uniza/fri/autoskola/data/Questions$Category;", "setCategory", "(Lsk/uniza/fri/autoskola/data/Questions$Category;)V", "getImage", "getQuestion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
    public static final class Question {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String question = null;
        private final int answer = 0;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String image = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String answer1 = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String answer2 = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String answer3 = null;
        @org.jetbrains.annotations.NotNull
        private sk.uniza.fri.autoskola.data.Questions.Category category;
        
        public Question(@org.jetbrains.annotations.NotNull
        java.lang.String question, int answer, @org.jetbrains.annotations.NotNull
        java.lang.String image, @org.jetbrains.annotations.NotNull
        java.lang.String answer1, @org.jetbrains.annotations.NotNull
        java.lang.String answer2, @org.jetbrains.annotations.NotNull
        java.lang.String answer3, @org.jetbrains.annotations.NotNull
        sk.uniza.fri.autoskola.data.Questions.Category category) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getQuestion() {
            return null;
        }
        
        public final int getAnswer() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getImage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getAnswer1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getAnswer2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getAnswer3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.uniza.fri.autoskola.data.Questions.Category getCategory() {
            return null;
        }
        
        public final void setCategory(@org.jetbrains.annotations.NotNull
        sk.uniza.fri.autoskola.data.Questions.Category p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.uniza.fri.autoskola.data.Questions.Category component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final sk.uniza.fri.autoskola.data.Questions.Question copy(@org.jetbrains.annotations.NotNull
        java.lang.String question, int answer, @org.jetbrains.annotations.NotNull
        java.lang.String image, @org.jetbrains.annotations.NotNull
        java.lang.String answer1, @org.jetbrains.annotations.NotNull
        java.lang.String answer2, @org.jetbrains.annotations.NotNull
        java.lang.String answer3, @org.jetbrains.annotations.NotNull
        sk.uniza.fri.autoskola.data.Questions.Category category) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
}