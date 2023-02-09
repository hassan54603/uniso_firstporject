package com.example.firsttest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_items, menu);
        return true;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.settings:
                Toast.makeText(this, "You have clicked on setting", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.share:
                Intent intent = new Intent(MainActivity.this,SocialMedia.class);
                startActivity(intent);
                return true;
            case R.id.about:
                Intent obj = new Intent(MainActivity.this,Home.class);
                startActivity(obj);
                return true;
            case R.id.logout:
                Intent goTo = new Intent(MainActivity.this,LoginApp.class);
                startActivity(goTo);
                return true;
            default:
            return super.onOptionsItemSelected(item);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}