package com.example.scarlet.englishgrammartest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnTheory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTheory=(Button) findViewById(R.id.btnTheory);
        btnTheory.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnTheory:
                Intent intent = new Intent(this, TheoryActivity.class);
                startActivity(intent);
                break;
        }
    }
}
