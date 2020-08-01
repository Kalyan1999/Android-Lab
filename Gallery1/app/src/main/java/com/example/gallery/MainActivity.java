package com.example.gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private int dataset[] = {R.drawable.elon_musk, R.drawable.bill_gates, R.drawable.rdj,
            R.drawable.roadster,R.drawable.starship};
    static int i=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageView = (ImageView) findViewById(R.id.iv);
        Button imagebtn = (Button) findViewById(R.id.btn);

            imagebtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (i == 5)
                        i = 0;
                    imageView.setImageResource(dataset[i + 2]);
                    i++;
                }
            });
        }

}
