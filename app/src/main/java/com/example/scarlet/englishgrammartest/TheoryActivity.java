package com.example.scarlet.englishgrammartest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.scarlet.englishgrammartest.PastTime.PastContinuous;
import com.example.scarlet.englishgrammartest.PastTime.PastPerfect;
import com.example.scarlet.englishgrammartest.PastTime.PastSimple;

public class TheoryActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout llPastGroup, llPresentGroup, llFutureGroup;
    TextView tvPast, tvPresent, tvFuture;
    TextView tvPastSimple, tvPastContinuous, tvPastPerfect;
    int cntForLlPastGroup = 0, cntForLlPresentGroup = 0, cntForLlFutureGroup = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theory);

        tvPast = (TextView) findViewById(R.id.tvPast);
        tvPresent = (TextView) findViewById(R.id.tvPresent);
        tvFuture = (TextView) findViewById(R.id.tvFuture);

        tvPastSimple=(TextView) findViewById(R.id.pastSimple);
        tvPastContinuous=(TextView) findViewById(R.id.pastContinuous);
        tvPastPerfect=(TextView) findViewById(R.id.pastPerfect);

        llPastGroup = (LinearLayout) findViewById(R.id.llPastGroup);
        llPresentGroup = (LinearLayout) findViewById(R.id.llPresentGroup);
        llFutureGroup = (LinearLayout) findViewById(R.id.llFutureGroup);

        tvPast.setOnClickListener(this);
        tvPresent.setOnClickListener(this);
        tvFuture.setOnClickListener(this);

        tvPastSimple.setOnClickListener(this);
        tvPastContinuous.setOnClickListener(this);
        tvPastPerfect.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tvPast:
                if (cntForLlPastGroup == 1) {
                    llPastGroup.setVisibility(View.GONE);
                    cntForLlPastGroup--;
                    break;
                }
                if (cntForLlPastGroup == 0) {
                    llPastGroup.setVisibility(View.VISIBLE);
                    cntForLlPastGroup++;
                    break;
                }
                break;
            case R.id.tvPresent:
                if (cntForLlPresentGroup == 0) {
                    llPresentGroup.setVisibility(View.VISIBLE);
                    cntForLlPresentGroup++;
                    break;
                }
                if (cntForLlPresentGroup == 1) {
                    llPresentGroup.setVisibility(View.GONE);
                    cntForLlPresentGroup--;
                    break;
                }
                break;
            case R.id.tvFuture:
                if (cntForLlFutureGroup == 0) {
                    llFutureGroup.setVisibility(View.VISIBLE);
                    cntForLlFutureGroup++;
                    break;
                }
                if (cntForLlFutureGroup == 1) {
                    llFutureGroup.setVisibility(View.GONE);
                    cntForLlFutureGroup--;
                    break;
                }
                break;
            case R.id.pastSimple:
                Intent intentPastSimple = new Intent(this, PastSimple.class);
                startActivity(intentPastSimple);
                break;
            case R.id.pastContinuous:
                Intent intentPastContinuous = new Intent(this, PastContinuous.class);
                startActivity(intentPastContinuous);
                break;
            case R.id.pastPerfect:
                Intent intentPastPerfect = new Intent(this, PastPerfect.class);
                startActivity(intentPastPerfect);
                break;

            default:
                break;
        }

    }
}

