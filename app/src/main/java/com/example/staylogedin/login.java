package com.example.staylogedin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button loginbtn=findViewById(R.id.loginbutton);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences pref=getSharedPreferences("login",MODE_PRIVATE);
                SharedPreferences.Editor editor=pref.edit();


                editor.putBoolean("flag",true);
                editor.apply();
                Intent ihome=new Intent(login.this,homeactivity.class);
                startActivity(ihome);
            }
        });
    }
}