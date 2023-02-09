package com.example.firsttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SocialMedia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_media);
        ImageView face = findViewById(R.id.facebook);
        ImageView whats_ap = findViewById(R.id.whatsapp);
        ImageView Instagram = findViewById(R.id.instagram);
        ImageView world = findViewById(R.id.world);
        ImageView phone = findViewById(R.id.phone);

        face.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewpage = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/UnisoUniversity"));
                startActivity(viewpage);
            }
        });
        // in
        Instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewpage = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/master_x242/"));
                startActivity(viewpage);
            }
        });
        //world wide web
        world.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewpage = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uniso.edu.so/"));
                startActivity(viewpage);
            }
        });
        //phone
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewpage = new Intent(Intent.ACTION_CALL, Uri.parse("tell:0615443322"));
                startActivity(viewpage);
            }
        });
        //whatsapp
        whats_ap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //initialize mobile with country code
                String Sumber = "+252617507678";
                //initialize url
                Uri uri= Uri.parse(String.format("https://api.whatsapp.com/send?phone=%s",Sumber));
                //initialize intent
             Intent intent = new Intent(Intent.ACTION_VIEW);
             //set data
                intent.setData(uri);
                //set flag
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                //Start Activiity
                startActivity(intent);
            }
        });

    }
}