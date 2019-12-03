package com.example.productsinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    ImageView prodImg;
    Spinner spproducts;
    public static  int customerid;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prodImg = findViewById(R.id.ivprod);

        spproducts=findViewById(R.id.productspinner);



        List<String> products = new  ArrayList<String>();

        products.add("Mouse");
        products.add("Keyboard");
        products.add("Laptop");
        products.add("Printer");
        products.add("Scanner");

        ArrayAdapter<String> proAdapter = new ArrayAdapter<String>( this,R.layout.support_simple_spinner_dropdown_item,products);


        proAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);


        spproducts.setAdapter(proAdapter);

spproducts.setOnItemSelectedListener(this);



    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {


        String imgname = "laptop";
        int imgid = getResources().getIdentifier(imgname,"drawable",getPackageName());
        prodImg.setImageResource(imgid);



    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}
