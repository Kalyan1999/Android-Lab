package com.android_lab.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv=findViewById(R.id.textView4);
        Intent intent =getIntent();
        String value=intent.getStringExtra("str");
        tv.setText(value);
    }
}
