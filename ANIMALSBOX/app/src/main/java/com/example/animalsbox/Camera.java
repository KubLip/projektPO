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

public class Camera extends AppCompatActivity {

    private ImageView imageView;
    private Button takePhoto, takeGalLery;
    private static int REQUEST_Camera= 1;
    private static int REQUEST_GALlERY= 2;
    private Bitmap bitmap;
    private Object InputStream;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera2);

        imageView = (ImageView) findViewById(R.id.imageFilterView2);
        takePhoto = (Button) findViewById(R.id.Photo);
        takeGalLery = (Button) findViewById(R.id.gallery);

        takePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, REQUEST_Camera);
            }

            ;

        });

        takeGalLery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                intent.addCategory(Intent.CATEGORY_OPENABLE);
                startActivityForResult(intent, REQUEST_GALlERY);
            }
        });

    }




    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode ==REQUEST_Camera && resultCode == Activity.RESULT_OK);
        {
            bitmap =(Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(bitmap);
        }

        {
            java.io.InputStream inputStream = null;
            try {
                if (bitmap != null)
                    bitmap.recycle();
                inputStream = getContentResolver().openInputStream(data.getData());
                bitmap = BitmapFactory.decodeStream((java.io.InputStream) InputStream);


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally
            {Exception e = null;

                {
                    e.printStackTrace();
                }

            }
            ;

        }
    }

    public void reklama(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.animalsbox.pl/pl/c/KARMY-I-AKCESORIA/51/1/default/1/f_producer_69/1"));
        startActivity(intent);
    }
}