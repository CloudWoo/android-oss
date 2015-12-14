package com.kickstarter.viewmodels.inputs;

import android.content.Intent;

import com.kickstarter.ui.activities.LoginToutActivity;

import java.util.List;

public interface LoginToutViewModelInputs {
  void activityResult(int requestCode, int resultCode, Intent intent);
  void facebookLoginClick(LoginToutActivity activity, List<String> facebookPermissions);
  void reason(String __);
}