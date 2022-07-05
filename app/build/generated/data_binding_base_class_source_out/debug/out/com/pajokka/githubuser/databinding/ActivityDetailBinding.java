// Generated by view binder compiler. Do not edit!
package com.pajokka.githubuser.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.pajokka.githubuser.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDetailBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final AppCompatButton btnFav;

  @NonNull
  public final ImageView ivArrowBack;

  @NonNull
  public final CircleImageView ivProfile;

  @NonNull
  public final ImageView ivSetting;

  @NonNull
  public final ImageView ivShare;

  @NonNull
  public final TabLayout tabs;

  @NonNull
  public final TextView tvCompany;

  @NonNull
  public final TextView tvFollowers;

  @NonNull
  public final TextView tvFollowing;

  @NonNull
  public final TextView tvLocation;

  @NonNull
  public final TextView tvName;

  @NonNull
  public final TextView tvRepository;

  @NonNull
  public final TextView tvUsername;

  @NonNull
  public final ViewPager2 viewPager;

  private ActivityDetailBinding(@NonNull NestedScrollView rootView, @NonNull AppCompatButton btnFav,
      @NonNull ImageView ivArrowBack, @NonNull CircleImageView ivProfile,
      @NonNull ImageView ivSetting, @NonNull ImageView ivShare, @NonNull TabLayout tabs,
      @NonNull TextView tvCompany, @NonNull TextView tvFollowers, @NonNull TextView tvFollowing,
      @NonNull TextView tvLocation, @NonNull TextView tvName, @NonNull TextView tvRepository,
      @NonNull TextView tvUsername, @NonNull ViewPager2 viewPager) {
    this.rootView = rootView;
    this.btnFav = btnFav;
    this.ivArrowBack = ivArrowBack;
    this.ivProfile = ivProfile;
    this.ivSetting = ivSetting;
    this.ivShare = ivShare;
    this.tabs = tabs;
    this.tvCompany = tvCompany;
    this.tvFollowers = tvFollowers;
    this.tvFollowing = tvFollowing;
    this.tvLocation = tvLocation;
    this.tvName = tvName;
    this.tvRepository = tvRepository;
    this.tvUsername = tvUsername;
    this.viewPager = viewPager;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_fav;
      AppCompatButton btnFav = ViewBindings.findChildViewById(rootView, id);
      if (btnFav == null) {
        break missingId;
      }

      id = R.id.iv_arrow_back;
      ImageView ivArrowBack = ViewBindings.findChildViewById(rootView, id);
      if (ivArrowBack == null) {
        break missingId;
      }

      id = R.id.iv_profile;
      CircleImageView ivProfile = ViewBindings.findChildViewById(rootView, id);
      if (ivProfile == null) {
        break missingId;
      }

      id = R.id.iv_setting;
      ImageView ivSetting = ViewBindings.findChildViewById(rootView, id);
      if (ivSetting == null) {
        break missingId;
      }

      id = R.id.iv_share;
      ImageView ivShare = ViewBindings.findChildViewById(rootView, id);
      if (ivShare == null) {
        break missingId;
      }

      id = R.id.tabs;
      TabLayout tabs = ViewBindings.findChildViewById(rootView, id);
      if (tabs == null) {
        break missingId;
      }

      id = R.id.tv_company;
      TextView tvCompany = ViewBindings.findChildViewById(rootView, id);
      if (tvCompany == null) {
        break missingId;
      }

      id = R.id.tv_followers;
      TextView tvFollowers = ViewBindings.findChildViewById(rootView, id);
      if (tvFollowers == null) {
        break missingId;
      }

      id = R.id.tv_following;
      TextView tvFollowing = ViewBindings.findChildViewById(rootView, id);
      if (tvFollowing == null) {
        break missingId;
      }

      id = R.id.tv_location;
      TextView tvLocation = ViewBindings.findChildViewById(rootView, id);
      if (tvLocation == null) {
        break missingId;
      }

      id = R.id.tv_name;
      TextView tvName = ViewBindings.findChildViewById(rootView, id);
      if (tvName == null) {
        break missingId;
      }

      id = R.id.tv_repository;
      TextView tvRepository = ViewBindings.findChildViewById(rootView, id);
      if (tvRepository == null) {
        break missingId;
      }

      id = R.id.tv_username;
      TextView tvUsername = ViewBindings.findChildViewById(rootView, id);
      if (tvUsername == null) {
        break missingId;
      }

      id = R.id.view_pager;
      ViewPager2 viewPager = ViewBindings.findChildViewById(rootView, id);
      if (viewPager == null) {
        break missingId;
      }

      return new ActivityDetailBinding((NestedScrollView) rootView, btnFav, ivArrowBack, ivProfile,
          ivSetting, ivShare, tabs, tvCompany, tvFollowers, tvFollowing, tvLocation, tvName,
          tvRepository, tvUsername, viewPager);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
