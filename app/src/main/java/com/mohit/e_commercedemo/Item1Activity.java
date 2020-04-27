package com.mohit.e_commercedemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


import com.mohit.e_commercedemo.ui.myOrders.myOrders;

public class Item1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item1);
    }

    public void cart(View view){
        Toast.makeText(this, "Item added to cart", Toast.LENGTH_SHORT).show();



    }


    public void buy(View view){

//       Button BuyNow = findViewById(R.id.button2);
//
//       BuyNow.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View v) {
//               Intent i = new Intent(getApplicationContext(), myOrders.class);
//               i.putExtra("demo","IT's a demo be aur kya Chahiye tereko" );
//               startActivity(i);
//           }
//       });
    }
}
