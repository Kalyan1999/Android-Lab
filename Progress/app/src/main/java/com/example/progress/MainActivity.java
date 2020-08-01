package com.example.progress;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    private ProgressDialog progress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progress=new ProgressDialog(view.getContext());
                progress.setMessage("Downloading Music");
                progress.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                progress.setIndeterminate(true);
                progress.setProgress(0);
                progress.show();
                final int totalProgressTime = 100;
                final Thread t = new Thread() {
                    @Override
                    public void run() {
                        int jumpTime = 0;

                        while(jumpTime < totalProgressTime) {
                            try {
                                sleep(200);
                                jumpTime += 5;
                                progress.setProgress(jumpTime);
                            } catch (InterruptedException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                        }
                    }
                };
                t.start();


            }
        });
    }
}
