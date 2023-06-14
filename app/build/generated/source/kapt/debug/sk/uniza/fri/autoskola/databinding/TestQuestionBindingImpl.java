package sk.uniza.fri.autoskola.databinding;
import sk.uniza.fri.autoskola.R;
import sk.uniza.fri.autoskola.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TestQuestionBindingImpl extends TestQuestionBinding implements sk.uniza.fri.autoskola.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearLayoutTop, 7);
        sViewsWithIds.put(R.id.question_timer, 8);
        sViewsWithIds.put(R.id.questionImage, 9);
        sViewsWithIds.put(R.id.linearLayout, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TestQuestionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private TestQuestionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[4]
            , (android.widget.Button) bindings[5]
            , (android.widget.Button) bindings[6]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.RelativeLayout) bindings[7]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[2]
            );
        this.buttonA.setTag(null);
        this.buttonB.setTag(null);
        this.buttonC.setTag(null);
        this.buttonNext.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.questionNumber.setTag(null);
        this.questionTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new sk.uniza.fri.autoskola.generated.callback.OnClickListener(this, 3);
        mCallback4 = new sk.uniza.fri.autoskola.generated.callback.OnClickListener(this, 4);
        mCallback1 = new sk.uniza.fri.autoskola.generated.callback.OnClickListener(this, 1);
        mCallback2 = new sk.uniza.fri.autoskola.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.question == variableId) {
            setQuestion((sk.uniza.fri.autoskola.TestQuestion) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setQuestion(@Nullable sk.uniza.fri.autoskola.TestQuestion Question) {
        this.mQuestion = Question;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.question);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String questionNumberString = null;
        java.lang.String questionCurrentQuestionAnswer1 = null;
        java.lang.String questionCurrentQuestionQuestion = null;
        sk.uniza.fri.autoskola.TestQuestion question = mQuestion;
        java.lang.String questionCurrentQuestionAnswer2 = null;
        sk.uniza.fri.autoskola.data.Questions.Question questionCurrentQuestion = null;
        java.lang.String questionCurrentQuestionAnswer3 = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (question != null) {
                    // read question.numberString
                    questionNumberString = question.getNumberString();
                    // read question.currentQuestion
                    questionCurrentQuestion = question.getCurrentQuestion();
                }


                if (questionCurrentQuestion != null) {
                    // read question.currentQuestion.answer1
                    questionCurrentQuestionAnswer1 = questionCurrentQuestion.getAnswer1();
                    // read question.currentQuestion.question
                    questionCurrentQuestionQuestion = questionCurrentQuestion.getQuestion();
                    // read question.currentQuestion.answer2
                    questionCurrentQuestionAnswer2 = questionCurrentQuestion.getAnswer2();
                    // read question.currentQuestion.answer3
                    questionCurrentQuestionAnswer3 = questionCurrentQuestion.getAnswer3();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.buttonA.setOnClickListener(mCallback1);
            this.buttonB.setOnClickListener(mCallback2);
            this.buttonC.setOnClickListener(mCallback3);
            this.buttonNext.setOnClickListener(mCallback4);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.buttonA, questionCurrentQuestionAnswer1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.buttonB, questionCurrentQuestionAnswer2);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.buttonC, questionCurrentQuestionAnswer3);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.questionNumber, questionNumberString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.questionTitle, questionCurrentQuestionQuestion);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // question != null
                boolean questionJavaLangObjectNull = false;
                // question
                sk.uniza.fri.autoskola.TestQuestion question = mQuestion;



                questionJavaLangObjectNull = (question) != (null);
                if (questionJavaLangObjectNull) {



                    question.selectAnswer(3);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // question != null
                boolean questionJavaLangObjectNull = false;
                // question
                sk.uniza.fri.autoskola.TestQuestion question = mQuestion;



                questionJavaLangObjectNull = (question) != (null);
                if (questionJavaLangObjectNull) {


                    question.nextQuestion();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // question != null
                boolean questionJavaLangObjectNull = false;
                // question
                sk.uniza.fri.autoskola.TestQuestion question = mQuestion;



                questionJavaLangObjectNull = (question) != (null);
                if (questionJavaLangObjectNull) {



                    question.selectAnswer(1);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // question != null
                boolean questionJavaLangObjectNull = false;
                // question
                sk.uniza.fri.autoskola.TestQuestion question = mQuestion;



                questionJavaLangObjectNull = (question) != (null);
                if (questionJavaLangObjectNull) {



                    question.selectAnswer(2);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): question
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}