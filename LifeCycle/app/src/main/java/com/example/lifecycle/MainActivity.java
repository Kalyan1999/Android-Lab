package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private final String TAG=MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"in method onCreate()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"in method onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"in method onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"in method onDestroy()");
    }
}
