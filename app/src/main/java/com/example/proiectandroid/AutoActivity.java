package com.example.proiectandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class AutoActivity extends AppCompatActivity {
    Button raspA, raspB, raspC, raspD;
    TextView tvScor, tvIntrebare;
    private IntrebariAuto vectIntrebari = new IntrebariAuto();
    private String rasp;
    private int scor = 0;
    private int nrIntrebari = vectIntrebari.vectIntreb.length;
    static int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto);
        raspA = findViewById(R.id.btnRaspA);
        raspB = findViewById(R.id.btnRaspB);
        raspC = findViewById(R.id.btnRaspC);
        raspD = findViewById(R.id.btnRaspD);
        tvIntrebare = findViewById(R.id.tvIntrebare);
        tvScor = findViewById(R.id.tvScor);
        index = 0;
        actIntrebare(index);
    }
    public void radioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked(); // This check which radio button was clicked
        switch (view.getId()) {
            case R.id.btnRaspA: if (checked)
                if (raspA.getText() == rasp) {
                    scor++;
                    tvScor.setText("Scor: " + scor);
                }
                if(index < vectIntrebari.vectIntreb.length - 1) {
                    index++;
                    uncheck();
                    actIntrebare(index);
                } else {
                    Intent i = new Intent(AutoActivity.this, ScorActivity.class);
                    i.putExtra("scor_final", String.valueOf(scor));
                    startActivity(i);
                }
                break;
            case R.id.btnRaspB: if (checked)
                if (raspB.getText() == rasp) {
                    scor++;
                    tvScor.setText("Scor: " + scor);
                }
                if(index < vectIntrebari.vectIntreb.length - 1) {
                    index++;
                    uncheck();
                    actIntrebare(index);
                } else {
                    Intent i = new Intent(AutoActivity.this, ScorActivity.class);
                    i.putExtra("scor_final", String.valueOf(scor));
                    startActivity(i);
                }
                break;
            case R.id.btnRaspC: if (checked)
                if (raspC.getText() == rasp) {
                    scor++;
                    tvScor.setText("Scor: " + scor);
                }
                if(index < vectIntrebari.vectIntreb.length - 1) {
                    index++;
                    uncheck();
                    actIntrebare(index);
                } else {
                    Intent i = new Intent(AutoActivity.this, ScorActivity.class);
                    i.putExtra("scor_final", String.valueOf(scor));
                    startActivity(i);
                }
                break;
            case R.id.btnRaspD: if (checked)
                if (raspD.getText() == rasp) {
                    scor++;
                    tvScor.setText("Scor: " + scor);
                }
                if(index < vectIntrebari.vectIntreb.length - 1) {
                    index++;
                    uncheck();
                    actIntrebare(index);
                } else {
                    Intent i = new Intent(AutoActivity.this, ScorActivity.class);
                    i.putExtra("scor_final", String.valueOf(scor));
                    startActivity(i);
                }
                break;
        }
    }

    public void uncheck() {
        RadioGroup answers = findViewById(R.id.radioGroup);
        answers.clearCheck();
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
