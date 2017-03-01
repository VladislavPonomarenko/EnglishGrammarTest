package com.example.scarlet.englishgrammartest.PastTime;
import com.example.scarlet.englishgrammartest.R;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PastSimple extends AppCompatActivity implements View.OnClickListener{

    Button btnGoPastSimpleTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_simple);

        btnGoPastSimpleTest=(Button) findViewById(R.id.btnGoPastSimpleTest);
        btnGoPastSimpleTest.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnGoPastSimpleTest:
                Intent intent = new Intent(this,PastSimpleTest.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
