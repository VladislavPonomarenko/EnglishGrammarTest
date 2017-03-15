package com.example.scarlet.englishgrammartest.PastTime;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.scarlet.englishgrammartest.R;

public class PastContinuousTest extends AppCompatActivity {

    EditText pastContinuousWasWatching,pastContinuousWasPreparing, pastContinuousWasPlaying;
    EditText pastContinuousWasPractising, pastContinuousWasNotCycling;

    Button btnPastContinuousResult;

    TextView ContinuousResult,ContinuousResultPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_continuous_test);

        pastContinuousWasWatching= (EditText) findViewById(R.id.pastContinuousWasWatching);
        pastContinuousWasPreparing= (EditText) findViewById(R.id.pastContinuousWasPreparing);
        pastContinuousWasPlaying= (EditText) findViewById(R.id.pastContinuousWasPlaying);
        pastContinuousWasPractising= (EditText) findViewById(R.id.pastContinuousWasPractising);
        pastContinuousWasNotCycling= (EditText) findViewById(R.id.pastContinuousWasNotCycling);

        btnPastContinuousResult = (Button) findViewById(R.id.btnPastContinuousResult);

        ContinuousResult = (TextView) findViewById(R.id.ContinuousResult);
        ContinuousResultPrice = (TextView) findViewById(R.id.ContinuousResultPrice);

        btnPastContinuousResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cntResult=0;

                if(pastContinuousWasWatching.getText().toString().trim().compareToIgnoreCase("was watching") == 0){
                    cntResult++;
                }
                if(pastContinuousWasPreparing.getText().toString().trim().compareToIgnoreCase("was preparing") == 0){
                    cntResult++;
                }
                if(pastContinuousWasPlaying.getText().toString().trim().compareToIgnoreCase("was playing") == 0){
                    cntResult++;
                }
                if(pastContinuousWasPractising.getText().toString().trim().compareToIgnoreCase("was practising") == 0){
                    cntResult++;
                }
                if(pastContinuousWasNotCycling.getText().toString().trim().compareToIgnoreCase("was not cycling") == 0 ||
                        pastContinuousWasNotCycling.getText().toString().trim().compareToIgnoreCase("wasn't cycling") == 0){
                    cntResult++;
                }
                ContinuousResult.setText("Hабрано "+cntResult+" з 5");

                if(cntResult==5){
                    ContinuousResultPrice.setText("Молодець");
                    ContinuousResultPrice.setTextColor(Color.GREEN);
                    ContinuousResultPrice.setTextSize(25);
                    ContinuousResultPrice.setPadding(10,10,10,10);
                } else if(cntResult==4 || cntResult==3){
                    ContinuousResultPrice.setText("Непогано");
                    ContinuousResultPrice.setTextColor(Color.YELLOW);
                    ContinuousResultPrice.setTextSize(25);
                    ContinuousResultPrice.setPadding(10,10,10,10);
                }else {
                    ContinuousResultPrice.setText("Погано");
                    ContinuousResultPrice.setTextColor(Color.RED);
                    ContinuousResultPrice.setTextSize(25);
                    ContinuousResultPrice.setPadding(10,10,10,10);
                }
            }
        });
    }
}
