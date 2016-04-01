package com.codekul.statusbarnotifications;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class NotificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        findViewById(R.id.btnToast).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                View view = ((LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE)).inflate(R.layout.toast_view,null,false);                Toast toast = Toast.makeText(NotificationActivity.this,"My Toast",Toast.LENGTH_SHORT);
                toast.setView(view);
                toast.show();
            }
        });
    }
}
