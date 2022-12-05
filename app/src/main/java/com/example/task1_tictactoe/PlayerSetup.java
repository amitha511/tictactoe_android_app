package com.example.task1_tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class PlayerSetup extends AppCompatActivity {

    private EditText player1;
    private EditText player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_setup);

        player1 = findViewById(R.id.PlayerSetup_name1);
        player2 = findViewById(R.id.PlayerSetup_name2);

        Button submitBtn = findViewById(R.id.PlayerSetup_submit_btn);

        submitBtn.setOnClickListener(view -> {
            String playerNames[] = new String[2];
            playerNames[0]= player1.getText().toString();
            playerNames[1] = player2.getText().toString();

            Intent intent = new Intent(this,Game.class);
           // intent.putExtra("PLAYER_NAMES", playerNames);
            startActivity(intent);
        });
    }
}