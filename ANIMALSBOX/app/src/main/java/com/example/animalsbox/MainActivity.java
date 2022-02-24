package com.example.animalsbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        switch (view.getId())
        {
            case R.id.Rzeszów:
                Intent intent = new Intent(MainActivity.this, Rzeszów.class);
                startActivity(intent);
                break;
            case R.id.Mielec:
                intent = new Intent(MainActivity.this, Mielec.class);
                startActivity(intent);
                break;
            case R.id.Konin:
                intent = new Intent(MainActivity.this, Konin.class);
                startActivity(intent);
                break;
        }
    }
}