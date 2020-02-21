package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToBasketball(View view) {
        Intent intent = new Intent(this, BasketballActivity.class);
        startActivity(intent);
    }

    public void goToFootball(View view) {
        Intent intent = new Intent(this, FootballActivity.class);
        startActivity(intent);
    }
}
