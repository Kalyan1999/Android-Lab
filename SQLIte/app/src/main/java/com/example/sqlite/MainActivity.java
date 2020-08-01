package com.example.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_enter,btn_get;
    EditText enter_id,enter_name,enter_marks,get_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_enter=findViewById(R.id.button2);
        btn_get=findViewById(R.id.button3);
        enter_id=findViewById(R.id.editText2);
        enter_name=findViewById(R.id.editText4);
        enter_marks=findViewById(R.id.editText5);
        get_id=findViewById(R.id.editText6);

        StudentDbHelper dbHelper=new StudentDbHelper(this);
        final SQLiteDatabase db=dbHelper.getWritableDatabase();

        btn_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i=Integer.parseInt(enter_id.getText().toString());
                String n=enter_name.getText().toString();
                int m=Integer.parseInt(enter_marks.getText().toString());

                ContentValues values=new ContentValues();
                values.put("sid",i);
                values.put("sname",n);
                values.put("marks",m);
                long row=db.insert("student",null,values);
                Toast.makeText(getApplicationContext(),"row number is "+row,Toast.LENGTH_LONG).show();




            }
        });


        final SQLiteDatabase read_db=dbHelper.getReadableDatabase();
        final String projection[]={"sid","sname","marks"};

        btn_get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor c=read_db.query("student",projection,null,null,null,null,null);
                int p=Integer.parseInt(get_id.getText().toString());
                c.moveToPosition(p);
                String data="details of 2nd row are: \n id:"+c.getString(0)+"\n name is:"+c.getString(1)+"\nmarks are:"+c.getString(2);
                Toast.makeText(getApplicationContext(),data,Toast.LENGTH_LONG).show();
            }
        });


    }
}
