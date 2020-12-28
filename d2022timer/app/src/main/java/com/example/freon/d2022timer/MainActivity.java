package com.example.freon.d2022timer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    TextView textView1;
    Timer timer1;
    int k = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView)findViewById(R.id.textView1);

        timer1 = new Timer();
        timer1.schedule(new TimerTask() {

            @Override
            public void run() {
                k += 1;
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        String s1 = "";
                        textView1.setText(s1 + " " + k);
                    }
                });
            }
        },500, 1000);
    }
}