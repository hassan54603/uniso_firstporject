package com.example.firsttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_app);
        //
        EditText txtusers=findViewById(R.id.txtuser);
        EditText txtpassword=findViewById(R.id.txtpass);
        Button btnLogin=findViewById(R.id.button);
        
        //eventListener
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                //
                
                String userName= txtusers.getText().toString();
                String pass= txtpassword.getText().toString();
                
                //checking if username or password correct
                if(userName.equals("admin") && pass.equals("123")){
                    Intent goTo = new Intent(LoginApp.this, MainActivity.class);
                    startActivity(goTo);
                }else {
                    Toast.makeText(LoginApp.this, "user or password are in correct", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}