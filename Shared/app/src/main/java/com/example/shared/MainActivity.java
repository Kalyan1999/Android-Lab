package com.example.shared;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tv;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.button);
        tv=(TextView)findViewById(R.id.textView);
        et=(EditText)findViewById(R.id.editText);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg=et.getText().toString();
                SharedPreferences shrd=getSharedPreferences("demo",MODE_PRIVATE);
                SharedPreferences.Editor editor=shrd.edit();

                editor.putString("str",msg);
                editor.apply();

                SharedPreferences getshared=getSharedPreferences("demo",MODE_PRIVATE);
                String value=getshared.getString("str","save a note");
                tv.setText(value);

            }
        });

    }
}
