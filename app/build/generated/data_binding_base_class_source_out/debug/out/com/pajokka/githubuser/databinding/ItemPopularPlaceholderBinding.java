// Generated by view binder compiler. Do not edit!
package com.pajokka.githubuser.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.pajokka.githubuser.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemPopularPlaceholderBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView cardParent;

  @NonNull
  public final CircleImageView ivProfile;

  @NonNull
  public final ImageView ivRepo;

  @NonNull
  public final TextView tvItemName;

  @NonNull
  public final TextView tvLocation;

  @NonNull
  public final TextView tvRepo;

  @NonNull
  public final View view;

  private ItemPopularPlaceholderBinding(@NonNull CardView rootView, @NonNull CardView cardParent,
      @NonNull CircleImageView ivProfile, @NonNull ImageView ivRepo, @NonNull TextView tvItemName,
      @NonNull TextView tvLocation, @NonNull TextView tvRepo, @NonNull View view) {
    this.rootView = rootView;
    this.cardParent = cardParent;
    this.ivProfile = ivProfile;
    this.ivRepo = ivRepo;
    this.tvItemName = tvItemName;
    this.tvLocation = tvLocation;
    this.tvRepo = tvRepo;
    this.view = view;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemPopularPlaceholderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemPopularPlaceholderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_popular_placeholder, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemPopularPlaceholderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView cardParent = (CardView) rootView;

      id = R.id.iv_profile;
      CircleImageView ivProfile = ViewBindings.findChildViewById(rootView, id);
      if (ivProfile == null) {
        break missingId;
      }

      id = R.id.iv_repo;
      ImageView ivRepo = ViewBindings.findChildViewById(rootView, id);
      if (ivRepo == null) {
        break missingId;
      }

      id = R.id.tv_item_name;
      TextView tvItemName = ViewBindings.findChildViewById(rootView, id);
      if (tvItemName == null) {
        break missingId;
      }

      id = R.id.tv_location;
      TextView tvLocation = ViewBindings.findChildViewById(rootView, id);
      if (tvLocation == null) {
        break missingId;
      }

      id = R.id.tv_repo;
      TextView tvRepo = ViewBindings.findChildViewById(rootView, id);
      if (tvRepo == null) {
        break missingId;
      }

      id = R.id.view;
      View view = ViewBindings.findChildViewById(rootView, id);
      if (view == null) {
        break missingId;
      }

      return new ItemPopularPlaceholderBinding((CardView) rootView, cardParent, ivProfile, ivRepo,
          tvItemName, tvLocation, tvRepo, view);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
