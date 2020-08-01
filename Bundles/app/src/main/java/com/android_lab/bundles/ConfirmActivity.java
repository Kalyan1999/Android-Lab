package com.android_lab.bundles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmActivity extends AppCompatActivity  {

    private TextView name, age, gender;
    private Button confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        name = findViewById(R.id.cname);
        age = findViewById(R.id.cage);
        gender = findViewById(R.id.cgender);

        confirm = findViewById(R.id.confirm);

        Bundle bundle = getIntent().getBundleExtra("bundle");
        name.setText("Name: " + bundle.getString("name"));
        age.setText("Age: " + bundle.getString("age"));
        gender.setText("Gender: " + bundle.getString("gender"));

    }

}
