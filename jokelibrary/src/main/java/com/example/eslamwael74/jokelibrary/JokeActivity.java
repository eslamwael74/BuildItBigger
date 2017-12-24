package com.example.eslamwael74.jokelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    TextView tvJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        tvJoke = (TextView) findViewById(R.id.tv_joke);

        String joke = getIntent().getStringExtra("joke");

        tvJoke.setText(joke);
    }
}
