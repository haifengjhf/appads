package com.jhf.test.reactnative;

import com.jhf.reactnative.MyReactNativeActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void navigateReactNative(View view){
        Intent intent = new Intent(this, MyReactNativeActivity.class);
        startActivity(intent);
    }
}
