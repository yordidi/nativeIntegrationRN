package com.nativeintegrationrn;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("BaseActivity", "current activity is" + getClass().getSimpleName());
        super.onCreate(savedInstanceState);
        ActivityCollection.addActivity(this);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollection.removeActivity(this);
    }
}
