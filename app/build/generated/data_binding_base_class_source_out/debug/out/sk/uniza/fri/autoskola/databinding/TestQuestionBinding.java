// Generated by data binding compiler. Do not edit!
package sk.uniza.fri.autoskola.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import sk.uniza.fri.autoskola.R;
import sk.uniza.fri.autoskola.TestQuestion;

public abstract class TestQuestionBinding extends ViewDataBinding {
  @NonNull
  public final Button buttonA;

  @NonNull
  public final Button buttonB;

  @NonNull
  public final Button buttonC;

  @NonNull
  public final Button buttonNext;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final RelativeLayout linearLayoutTop;

  @NonNull
  public final ImageView questionImage;

  @NonNull
  public final TextView questionNumber;

  @NonNull
  public final TextView questionTimer;

  @NonNull
  public final TextView questionTitle;

  @Bindable
  protected TestQuestion mQuestion;

  protected TestQuestionBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button buttonA, Button buttonB, Button buttonC, Button buttonNext, LinearLayout linearLayout,
      RelativeLayout linearLayoutTop, ImageView questionImage, TextView questionNumber,
      TextView questionTimer, TextView questionTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.buttonA = buttonA;
    this.buttonB = buttonB;
    this.buttonC = buttonC;
    this.buttonNext = buttonNext;
    this.linearLayout = linearLayout;
    this.linearLayoutTop = linearLayoutTop;
    this.questionImage = questionImage;
    this.questionNumber = questionNumber;
    this.questionTimer = questionTimer;
    this.questionTitle = questionTitle;
  }

  public abstract void setQuestion(@Nullable TestQuestion question);

  @Nullable
  public TestQuestion getQuestion() {
    return mQuestion;
  }

  @NonNull
  public static TestQuestionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.test_question, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static TestQuestionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<TestQuestionBinding>inflateInternal(inflater, R.layout.test_question, root, attachToRoot, component);
  }

  @NonNull
  public static TestQuestionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.test_question, null, false, component)
   */
  @NonNull
  @Deprecated
  public static TestQuestionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<TestQuestionBinding>inflateInternal(inflater, R.layout.test_question, null, false, component);
  }

  public static TestQuestionBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static TestQuestionBinding bind(@NonNull View view, @Nullable Object component) {
    return (TestQuestionBinding)bind(component, view, R.layout.test_question);
  }
}
