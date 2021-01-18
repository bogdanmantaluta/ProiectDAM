package com.example.proiectandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScorActivity extends AppCompatActivity {
    String scorFinal;
    TextView textView;
    Button BtnRestart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scor);
        Intent i = getIntent();
        scorFinal = getIntent().getStringExtra("scor_final");
        textView = (TextView) findViewById(R.id.textView);
        BtnRestart = (Button) findViewById(R.id.button);
        textView.setText("Scor final : " + scorFinal);

        BtnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ScorActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}