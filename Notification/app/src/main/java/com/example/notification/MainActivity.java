package com.example.notification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void displayNotification(View view) {
        NotificationCompat.Builder builder=new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.ic_android_black_24dp)
                .setContentTitle("title")
                .setContentText("Hello");

        Intent not=new Intent(this,MainActivity.class);
        PendingIntent cont=PendingIntent.getActivity(this,0,not,PendingIntent.FLAG_UPDATE_CURRENT);

        builder.setContentIntent(cont);

        NotificationManager notman=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        notman.notify(0,builder.build());

    }
}
