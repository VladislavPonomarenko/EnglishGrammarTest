package com.example.scarlet.englishgrammartest.PastTime;
import com.example.scarlet.englishgrammartest.R;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PastSimpleTest extends AppCompatActivity {

    EditText pastSimpleWent, pastSimpleWas, pastSimpleWasOne, pastSimpleGot, pastSimpleMet;
    Button btnPastSimpleResult;
    TextView result, resultPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_simple_test);

        pastSimpleWent = (EditText) findViewById(R.id.pastSimpleWent);
        pastSimpleWas = (EditText) findViewById(R.id.pastSimpleWas);
        pastSimpleWasOne = (EditText) findViewById(R.id.pastSimpleWasOne);
        pastSimpleGot = (EditText) findViewById(R.id.pastSimpleGot);
        pastSimpleMet = (EditText) findViewById(R.id.pastSimpleMet);

        btnPastSimpleResult = (Button) findViewById(R.id.btnPastSimpleResult);

        result = (TextView) findViewById(R.id.result);
        resultPrice = (TextView) findViewById(R.id.resultPrice);

        btnPastSimpleResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cntResult=0;

                if(pastSimpleWent.getText().toString().trim().compareToIgnoreCase("went")==0){
                    cntResult++;
                }
                if(pastSimpleWas.getText().toString().trim().compareToIgnoreCase("was")==0){
                    cntResult++;
                }
                if(pastSimpleWasOne.getText().toString().trim().compareToIgnoreCase("was")==0){
                    cntResult++;
                }
                if(pastSimpleGot.getText().toString().trim().compareToIgnoreCase("got")==0){
                    cntResult++;
                }
                if(pastSimpleMet.getText().toString().trim().compareToIgnoreCase("met")==0){
                    cntResult++;
                }

                result.setText("Hабрано "+cntResult+" з 5");

                if(cntResult==5){
                    resultPrice.setText("Молодець");
                    resultPrice.setTextColor(Color.GREEN);
                    resultPrice.setTextSize(25);
                    resultPrice.setPadding(10,10,10,10);
                } else if(cntResult==4 || cntResult==3){
                    resultPrice.setText("Непогано");
                    resultPrice.setTextColor(Color.YELLOW);
                    resultPrice.setTextSize(25);
                    resultPrice.setPadding(10,10,10,10);
                }else {
                    resultPrice.setText("Погано");
                    resultPrice.setTextColor(Color.RED);
                    resultPrice.setTextSize(25);
                    resultPrice.setPadding(10,10,10,10);
                }
            }
        });


    }
}
