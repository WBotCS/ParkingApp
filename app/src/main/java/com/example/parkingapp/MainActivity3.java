package com.example.parkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button nextbutton3 = findViewById(R.id.button3);
        nextbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(intent3);
            }
        });
    }

    public boolean createDatabse()
    {
        DatabaseHelper dbHelper = new DatabaseHelper(this);
        boolean result = dbHelper.addUser("aditya@gmail.com", "password", 1);
        if(result == true)
            return true;
        else
            return false;
    }
}