package com.example.cupacup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String msg=""; String name = "";
    int price = 0;
    TextView bc ;
    TextView l ;
    TextView cp ;
    TextView m ;
    TextView ic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bc = (TextView) findViewById(R.id.bc);
        l = (TextView) findViewById(R.id.l);
        cp = (TextView) findViewById(R.id.cp);
        m = (TextView) findViewById(R.id.m);
        ic = (TextView) findViewById(R.id.ic);
        bc.setText("Black Coffee"); l.setText("Latte"); cp.setText("Cappuccino");m.setText("Mocha");ic.setText("Ice Cream");
    }
    public void startSecondActivity(View view){
        discr(view);
        Intent i = new Intent(this, infoActivity.class);
        i.putExtra("message", msg);
        i.putExtra("int", price);
        i.putExtra("name" , name);
        startActivity(i);
        overridePendingTransition(R.anim.slide_right , R.anim.slide_left);

    }


    public void discr(View v){


        switch (v.getId()){
            case(R.id.bcb):
                msg += "Normal coffee with no additives\nPrice = 10 rupee per cup";
                price = 10;
                name = bc.getText().toString();
                break;
            case(R.id.lb):
                msg += "latte is a coffee-based drink made primarily from espresso and steamed milk.\nPrice = 20 rupee per cup";
                price = 20;
                name = l.getText().toString();
                break;
            case(R.id.cb):
                msg += "Cappuccino is a coffee drink that today is typically composed of a single espresso shot and hot milk,with the surface topped with foamed milk.\nPrice = 50 rupee per cup";
                price = 50;
                name = cp.getText().toString();
                break;
            case(R.id.mb):
                msg +="Mocha is based on espresso and hot milk but with added chocolate flavouring and sweetener.\nPrice = 100 rupee per cup";
                price = 100;
                name = m.getText().toString();
                break;
            case(R.id.icb):
                msg += "Price = 50 rupee per cup";
                price = 50;
                name = ic.getText().toString();
                break;
        }

    }




}