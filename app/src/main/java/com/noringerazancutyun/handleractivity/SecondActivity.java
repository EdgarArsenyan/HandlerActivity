package com.noringerazancutyun.handleractivity;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private Button toastButton;
    private Handler handler;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        init();
        sendToast();
    }

    private void init() {
        toastButton = findViewById(R.id.button);
        handler = new Handler();
    }

    private void sendToast() {
        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.post(run);
            }
        });
    }

    Runnable run = new Runnable() {
        @Override
        public void run() {
            Toast.makeText(SecondActivity.this, "Click button", Toast.LENGTH_SHORT).show();
        }
    };
}
