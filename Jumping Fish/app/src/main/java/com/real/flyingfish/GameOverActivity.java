package com.real.flyingfish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameOverActivity extends AppCompatActivity {
    private Button play_again_btn;
    TextView score1;
    String display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        display =getIntent().getExtras().get("score").toString();

        play_again_btn =findViewById(R.id.play_again_btn);
        score1=findViewById(R.id.score1);
        score1.setText("Your Score: "+ display);

        play_again_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GameOverActivity.this,MainActivity.class));
            }
        });
    }
}
