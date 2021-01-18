package com.example.proiectandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MusicActivity extends AppCompatActivity {
    Button raspA, raspB, raspC, raspD;
    TextView tvScor, tvIntrebare;
    private IntrebariMuzica vectIntrebari = new IntrebariMuzica();
    private String rasp;
    private int scor = 0;
    private int nrIntrebari = vectIntrebari.vectIntreb.length;
    static int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        raspA = findViewById(R.id.btnRaspA);
        raspB = findViewById(R.id.btnRaspB);
        raspC = findViewById(R.id.btnRaspC);
        raspD = findViewById(R.id.btnRaspD);
        tvIntrebare = findViewById(R.id.tvIntrebare);
        tvScor = findViewById(R.id.tvScor);
        index = 0;
        actIntrebare(index);
        raspA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (raspA.getText() == rasp) {
                    scor++;
                    tvScor.setText("Scor: " + scor);
                }
                if(index < vectIntrebari.vectIntreb.length - 1) {
                    index++;
                    actIntrebare(index);
                } else {
                    Intent i = new Intent(MusicActivity.this, ScorActivity.class);
                    i.putExtra("scor_final", String.valueOf(scor));
                    startActivity(i);
                }
            }
        });
        raspB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (raspB.getText() == rasp) {
                    scor++;
                    tvScor.setText("Scor: " + scor);
                }
                if(index < vectIntrebari.vectIntreb.length - 1) {
                    index++;
                    actIntrebare(index);
                } else {
                    Intent i = new Intent(MusicActivity.this, ScorActivity.class);
                    i.putExtra("scor_final", String.valueOf(scor));
                    startActivity(i);
                }

            }
        });
        raspC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (raspC.getText() == rasp) {
                    scor++;
                    tvScor.setText("Scor: " + scor);
                }
                if(index < vectIntrebari.vectIntreb.length - 1) {
                    index++;
                    actIntrebare(index);
                } else {
                    Intent i = new Intent(MusicActivity.this, ScorActivity.class);
                    i.putExtra("scor_final", String.valueOf(scor));
                    startActivity(i);
                }
            }
        });
        raspD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (raspD.getText() == rasp) {
                    scor++;
                    tvScor.setText("Scor: " + scor);
                }
                if(index < vectIntrebari.vectIntreb.length - 1) {
                    index++;
                    actIntrebare(index);
                } else {
                    Intent i = new Intent(MusicActivity.this, ScorActivity.class);
                    i.putExtra("scor_final", String.valueOf(scor));
                    startActivity(i);
                }
            }
        });
    }
    private void actIntrebare(int i) {
        tvIntrebare.setText(vectIntrebari.getIntrebare(i));
        raspA.setText(vectIntrebari.getRaspA(i));
        raspB.setText(vectIntrebari.getRaspB(i));
        raspC.setText(vectIntrebari.getRaspC(i));
        raspD.setText(vectIntrebari.getRaspD(i));
        rasp = vectIntrebari.getRaspCorect(i);
    }
}
