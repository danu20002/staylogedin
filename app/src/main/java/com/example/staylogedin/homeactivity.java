package com.example.staylogedin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homeactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeactivity);
        Button logout=findViewById(R.id.logoutbutton);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences pref=getSharedPreferences("login",MODE_PRIVATE);
                SharedPreferences.Editor editor= pref.edit();
                editor.putBoolean("flag",false);
                editor.apply();
                Intent intent=new Intent(homeactivity.this,login.class);
                startActivity(intent);
              finish();
            }
        });
    }
}