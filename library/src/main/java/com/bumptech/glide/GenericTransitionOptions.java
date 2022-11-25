package com.bumptech.glide;

import android.support.annotation.NonNull;
import com.bumptech.glide.request.transition.TransitionFactory;
import com.bumptech.glide.request.transition.ViewPropertyTransition;

/**
 * Implementation of {@link TransitionOptions} that exposes only generic methods that can be applied
 * to any resource type.
 *
 * @param <TranscodeType> The type of the resource that will be displayed.
 */
// Public API.
@SuppressWarnings({"PMD.UseUtilityClass", "unused"})
public final class GenericTransitionOptions<TranscodeType>
    extends TransitionOptions<GenericTransitionOptions<TranscodeType>, TranscodeType> {
  /**
   * Removes any existing animation put on the builder.
   *
   * @see GenericTransitionOptions#dontTransition()
   */
  @NonNull
  public static <TranscodeType> GenericTransitionOptions<TranscodeType> withNoTransition() {
    return new GenericTransitionOptions<TranscodeType>().dontTransition();
  }

  /**
   * Returns a typed {@link GenericTransitionOptions} object that uses the given view animation.
   *
   * @see GenericTransitionOptions#transition(int)
   */
  @NonNull
  public static <TranscodeType> GenericTransitionOptions<TranscodeType> with(int viewAnimationId) {
    return new GenericTransitionOptions<TranscodeType>().transition(viewAnimationId);
  }

  /**
   * Returns a typed {@link GenericTransitionOptions} object that uses the given animator.
   *
   * @see GenericTransitionOptions#transition(ViewPropertyTransition.Animator)
   */
  @NonNull
  public static <TranscodeType> GenericTransitionOptions<TranscodeType> with(
      @NonNull ViewPropertyTransition.Animator animator) {
    return new GenericTransitionOptions<TranscodeType>().transition(animator);
  }

  /**
   * Returns a typed {@link GenericTransitionOptions} object that uses the given transition factory.
   *
   * @see GenericTransitionOptions#transition(TransitionFactory)
   */
  @NonNull
  public static <TranscodeType> GenericTransitionOptions<TranscodeType> with(
      @NonNull TransitionFactory<? super TranscodeType> transitionFactory) {
    return new GenericTransitionOptions<TranscodeType>().transition(transitionFactory);
  }

  // Make sure that we're not equal to any other concrete implementation of TransitionOptions.
  @Override
  public boolean equals(Object o) {
    return o instanceof GenericTransitionOptions && super.equals(o);
  }

  // Our class doesn't include any additional properties, so we don't need to modify hashcode, but
  // keep it here as a reminder in case we add properties.
  @SuppressWarnings("PMD.UselessOverridingMethod")
  @Override
  public int hashCode() {
    return super.hashCode();
  }
}
