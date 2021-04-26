package com.example.practise2007game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonStartGameActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonStartGameActivity = findViewById(R.id.btnStartGameActivity);
        buttonStartGameActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GameStart.class);
                MainActivity.this.startActivity(intent);
            }
        });
    }
}
