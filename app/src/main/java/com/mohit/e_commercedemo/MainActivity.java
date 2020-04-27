package com.mohit.e_commercedemo;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ListView;
import android.widget.ArrayAdapter;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    public static final String MSG = "çom.mohitchourasia.E_CommerceDemo.ORDER";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_cart, R.id.nav_myOrders,
                R.id.nav_tools, R.id.nav_share)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        //------------------------------------------------------------------------------------------





//        ListView listView = findViewById(R.id.listView);
//        ArrayList<String> arrayList = new ArrayList<String>();
//
//
//        arrayList.add(R.id.Item1.toString());

//-----------------------------------------------------------------------------------------------------------






    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }


    public void Item1(View view){
        Intent intent = new Intent(this, Item1Activity.class);

       // TextView textView = findViewById(R.id.textView1);

      //  intent.putExtra(MSG,textView.getText());

        startActivity(intent);
    }




    public void Item2(View view){
        Intent intent = new Intent(this, Item1Activity.class);

//        TextView textView = findViewById(R.id.textView2);

        //  intent.putExtra(MSG,textView.getText());

        startActivity(intent);
    }




    public void Item3(View view){
        Intent intent = new Intent(this, Item1Activity.class);

       // TextView textView = findViewById(R.id.textView3);

        //  intent.putExtra(MSG,textView.getText());

        startActivity(intent);
    }




}
