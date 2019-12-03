package com.example.productsinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnlogin= findViewById(R.id.login);

        btnlogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent act = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(act);
    }
}
