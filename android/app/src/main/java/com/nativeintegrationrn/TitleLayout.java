package com.nativeintegrationrn;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class TitleLayout extends LinearLayout implements View.OnClickListener {
    public TitleLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title, this);
        Button button = (Button) findViewById(R.id.back_button);
        button.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.edit_button);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back_button:
                Toast.makeText(getContext(), "back button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.edit_button:
                Toast.makeText(getContext(), "edit button", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
