package com.example.scarlet.englishgrammartest.PastTime;
import com.example.scarlet.englishgrammartest.R;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PastSimpleTest extends AppCompatActivity {

    EditText pastSimpleWent, pastSimpleWas, pastSimpleWasOne, pastSimpleGot, pastSimpleMet;
    Button btnPastSimpleResult;
    TextView result;

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
            }
        });


    }
}
