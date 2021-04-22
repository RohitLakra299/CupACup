package com.example.cupacup;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class infoActivity extends AppCompatActivity {
String msg = "";String name = ""; String pername="";
int Price = 0;
int FinalPrice;
int numberOfCup=0;
    EditText Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Bundle bundle = getIntent().getExtras();
         msg = bundle.getString("message");
         name = bundle.getString("name");
         displayMessage(msg);
        Intent i = getIntent();
         Price = i.getIntExtra("int", 0);
    }
    private void displayMessage(String message) {
        TextView disc = (TextView) findViewById(R.id.disc);
        disc.setText(message);
    }
    private void displayPrice(int a) {
        String str1 = Integer.toString(a);
        TextView price = (TextView) findViewById(R.id.finalPrice);
        price.setText(str1);
    }
    public void incr(View view){
        numberOfCup++;
        FinalPrice = numberOfCup * Price;
        displayCup(numberOfCup);
        displayPrice(FinalPrice);
    }
    public void decr(View view){
        if(numberOfCup==0){
            displayCup(numberOfCup);
        }else{
        numberOfCup--;
            FinalPrice = numberOfCup * Price;
        displayCup(numberOfCup);
            displayPrice(FinalPrice);}
    }
    private void displayCup(int a){
        TextView quan = (TextView) findViewById(R.id.numberofcup);
        quan.setText(""+a);
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        overridePendingTransition(R.anim.slideileft,R.anim.slideoright);
    }
    protected void email(){
        String[] TO = {"rohitlakra299@gmail.com"};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Order From " + pername);
        emailIntent.putExtra(Intent.EXTRA_TEXT, numberOfCup + " "+ name+"\nPrice = ₹" +FinalPrice+" for "+pername);
        startActivity(Intent.createChooser(emailIntent, "Send mail..."));


    }
    public void order(View view) {
        Name = (EditText) findViewById(R.id.pername);
        pername = Name.getText().toString();
        if(pername.equals("")){
            Toast.makeText(infoActivity.this, "Enter your name :)",
                    Toast.LENGTH_SHORT).show();
        }else{
        if (numberOfCup == 0) {
            Toast.makeText(infoActivity.this, "You can't order zero cups :v",
                    Toast.LENGTH_SHORT).show();
        } else {
            new AlertDialog.Builder(this)
                    .setTitle("Confirmation")
                    .setMessage(numberOfCup + " " + name + "\nPrice = ₹" + FinalPrice + " for " + pername+"\n!!SELECT ONLY MAIL OPTION AFTER SELECTING OK!!")
                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            email();

                        }
                    })


                    .setNegativeButton(android.R.string.no, null)
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .show();
        }
    }
}
}