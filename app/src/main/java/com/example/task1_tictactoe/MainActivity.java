package com.example.task1_tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button playbtn = findViewById(R.id.main_playBtn);
        playbtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, Game.class);
            startActivity(intent);
        });
    }
}