package com.example.animalsbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.util.Date;
import java.util.GregorianCalendar;

public class Mielec extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mielec);
    }

    public void open1(View view) {

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.animalsbox.pl"));
            startActivity(intent);

        }

    public void aparat(View view) {
        switch (view.getId()){
        case R.id.toaparat:
        Intent intent = new Intent(Mielec.this, Camera.class);
        startActivity(intent);
        break;
    }

}


}
