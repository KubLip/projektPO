package com.example.animalsbox;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class Rzeszów extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rzeszow);

    }

    public void open(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.animalsbox.pl"));
        startActivity(intent);
    }
        public void aparat(View view) {

            switch (view.getId()) {
                case R.id.toaparat:
                    Intent intent = new Intent(Rzeszów.this, Camera.class);
                    startActivity(intent);
                    break;
            }

    }
}




