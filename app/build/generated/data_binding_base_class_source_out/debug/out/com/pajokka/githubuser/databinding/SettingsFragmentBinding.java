// Generated by view binder compiler. Do not edit!
package com.pajokka.githubuser.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.pajokka.githubuser.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SettingsFragmentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView ivDarkmode;

  @NonNull
  public final TextView tvDarkmode;

  private SettingsFragmentBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView ivDarkmode,
      @NonNull TextView tvDarkmode) {
    this.rootView = rootView;
    this.ivDarkmode = ivDarkmode;
    this.tvDarkmode = tvDarkmode;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SettingsFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SettingsFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.settings_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SettingsFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.iv_darkmode;
      ImageView ivDarkmode = ViewBindings.findChildViewById(rootView, id);
      if (ivDarkmode == null) {
        break missingId;
      }

      id = R.id.tv_darkmode;
      TextView tvDarkmode = ViewBindings.findChildViewById(rootView, id);
      if (tvDarkmode == null) {
        break missingId;
      }

      return new SettingsFragmentBinding((ConstraintLayout) rootView, ivDarkmode, tvDarkmode);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
