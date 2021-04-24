package com.binodcoder.notificationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class NotificationActivity extends AppCompatActivity {
  //  TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
//
//        message=(TextView)findViewById(R.id.btn_notify);
//
//        String msg=getIntent().getStringExtra("message");
//        message.setText(msg);
    }
}