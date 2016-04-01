package com.codekul.statusbarnotifications;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.NotificationBuilderWithBuilderAccessor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnNotify).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this);
                builder.setTicker("Ticker");
                builder.setContentText("Content Text");
                builder.setContentTitle("Content Title");
                //builder.setAutoCancel(false);
                //builder.setOnlyAlertOnce(true);
                builder.setShowWhen(true);
                builder.setSmallIcon(R.mipmap.ic_launcher);

                Intent intent = new Intent(MainActivity.this,NotificationActivity.class);
                PendingIntent pendingIntent = PendingIntent.getActivity(MainActivity.this,1235,intent,0);
                builder.setContentIntent(pendingIntent);

                builder.addAction(R.mipmap.ic_launcher, "Temp", pendingIntent);

                Notification notification = builder.build();

                ((NotificationManager)getSystemService(NOTIFICATION_SERVICE)).notify(1333,notification);
            }
        });
    }
}
