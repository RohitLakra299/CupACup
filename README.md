# androidapp
https://drive.google.com/file/d/13IF3zEc8Di-5J2UXIlUF8MuqErpVxdaS/view?usp=sharing link to video.


My appication name is cupAcup and it is simple coffee ordering application. Which can be used in coffee shops or restaurants. 
Application will show menu and after selecting anything from menu we will be send to another activity where a small discription about our order will be present we have to enter our name and quantity. After clicking on order button a small confirmation will pop up telling us about our order and wether we want to proceed with it.
After clicking ok we have to select Gmail option and from there we can send our order.

![Screenshot_2021-04-19-16-51-17-17_6d4688477cdb44869ecf5ecfa42348c2](https://user-images.githubusercontent.com/78154259/115229193-5d416100-a130-11eb-840c-5511e3ca5b73.jpg)


![Screenshot_2021-04-19-16-51-20-79_6d4688477cdb44869ecf5ecfa42348c2](https://user-images.githubusercontent.com/78154259/115229215-629eab80-a130-11eb-9921-79b09f96a8b9.jpg)


![Screenshot_2021-04-19-16-51-24-63_6d4688477cdb44869ecf5ecfa42348c2](https://user-images.githubusercontent.com/78154259/115229227-65999c00-a130-11eb-8ce1-b5d7abea4cbd.jpg)


![Screenshot_2021-04-19-16-51-28-80_6d4688477cdb44869ecf5ecfa42348c2](https://user-images.githubusercontent.com/78154259/115229233-67635f80-a130-11eb-8cc6-9de831da4c19.jpg)


![Screenshot_2021-04-19-16-53-22-84_6d4688477cdb44869ecf5ecfa42348c2](https://user-images.githubusercontent.com/78154259/115229239-69c5b980-a130-11eb-9ea8-2a7097ccd5ac.jpg)


![Screenshot_2021-04-19-16-53-26-48_6d4688477cdb44869ecf5ecfa42348c2](https://user-images.githubusercontent.com/78154259/115229255-6cc0aa00-a130-11eb-8dc0-0647655f2ad3.jpg)


![Screenshot_2021-04-19-16-53-29-81](https://user-images.githubusercontent.com/78154259/115229268-721df480-a130-11eb-9cdf-a60ff0513ec6.jpg)




CODE:-


!!!XML ACTIVITY FIRST!!!
<?xml version="1.0" encoding="utf-8"?>

<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/black"
    tools:context=".MainActivity">

    <ScrollView
        android:layout_width="match_parent"
        android:layout_height="match_parent">
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="vertical"

            >
            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="MENU"
                android:textSize="30dp"
                android:textColor="@color/white"
                android:padding="10dp"
                android:background="#0981b0"/>
            <ImageView
                android:id="@+id/bcb"
                android:layout_width="match_parent"
                android:layout_height="250dp"
                android:scaleType="fitXY"
                android:onClick = "startSecondActivity"
                android:src="@drawable/blackcoffee"
                />

            <TextView
                android:id="@+id/bc"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:background="@color/black"
                android:text="Black Coffee"
                android:textColor="@color/white"
                android:textSize="30dp" />

            <ImageView
                android:id="@+id/lb"
                android:layout_width="match_parent"
                android:layout_height="250dp"
                android:scaleType="fitXY"
                android:onClick = "startSecondActivity"
                android:src="@drawable/latte"
                />
            <TextView
                android:id="@+id/l"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:background="@color/black"
                android:text="Latte"
                android:textColor="@color/white"
                android:textSize="30dp" />
            <ImageView
                android:id="@+id/cb"
                android:layout_width="match_parent"
                android:layout_height="250dp"
                android:scaleType="fitXY"
                android:onClick = "startSecondActivity"
                android:src="@drawable/cappuccino"
                />
            <TextView
                android:id="@+id/cp"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:background="@color/black"
                android:text="Cappuccino"
                android:textColor="@color/white"
                android:textSize="30dp" />
            <ImageView
                android:id="@+id/mb"
                android:layout_width="match_parent"
                android:layout_height="250dp"
                android:scaleType="fitXY"
                android:onClick = "startSecondActivity"
                android:src="@drawable/mocha"
                />
            <TextView
                android:id="@+id/m"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:background="@color/black"
                android:text="Mocha"
                android:textColor="@color/white"
                android:textSize="30dp" />
            <ImageView
                android:id="@+id/icb"
                android:layout_width="match_parent"
                android:layout_height="250dp"
                android:scaleType="fitXY"
                android:onClick = "startSecondActivity"
                android:src="@drawable/icecream"
                />
            <TextView
                android:id="@+id/ic"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:background="@color/black"
                android:text="Ice Cream"
                android:textColor="@color/white"
                android:textSize="30dp" />

        </LinearLayout>
    </ScrollView>
</androidx.constraintlayout.widget.ConstraintLayout>



!!!XML INFO ACTIVITY!!!



<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/black"
    tools:context=".infoActivity">



    <ScrollView
        android:id="@+id/scrollView2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical">

            <TextView
                android:id="@+id/textView"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Discription"
                android:textColor="@color/white"
                android:textSize="40dp" />

            <TextView
                android:id="@+id/disc"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="--"
                android:textColor="@color/white"
                android:textSize="20dp" />
            <EditText
                android:id="@+id/pername"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:hint="Please Enter your name"
                android:textColor="@color/black"
                android:textSize="20dp"
                android:background="@color/white"
                android:layout_marginTop="10dp"
                android:layout_marginBottom="10dp"
                android:inputType="textCapWords"/>
           <TextView
              android:layout_width="wrap_content"
               android:layout_height="wrap_content"
               android:text="Quantity"
              android:textSize="30dp"
              android:textColor="@color/white"/>
            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:orientation="horizontal">
                <TextView
                    android:id="@+id/dec"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="-"
                    android:padding="10dp"
                    android:textColor="@color/white"
                    android:onClick="decr"
                    android:textSize="30dp"/>
                <TextView
                    android:id="@+id/numberofcup"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="0"
                    android:padding="10dp"
                    android:textColor="@color/white"
                    android:textSize="30dp"/>
                <TextView
                    android:id="@+id/inc"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="+"
                    android:padding="10dp"
                    android:onClick="incr"
                    android:textColor="@color/white"
                    android:textSize="20dp"/>
            </LinearLayout>
            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:orientation="horizontal">
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="₹"
                android:textColor="@color/white"
                android:textSize="30dp"
                android:layout_marginBottom="10dp"
                android:layout_marginLeft="10dp"/>
                <TextView
                    android:id="@+id/finalPrice"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="0"
                    android:textColor="@color/white"
                    android:textSize="30dp"
                    android:layout_marginBottom="10dp"
                    />
            </LinearLayout>
            <Button
                android:id="@+id/order"
                android:layout_width="wrap_content"
                android:layout_height="match_parent"
                android:background="#0981b0"
                android:text="ORDER"
                android:onClick="order"
                android:textColor="@color/white"
                android:textSize="20dp" />
        </LinearLayout>
    </ScrollView>


</androidx.constraintlayout.widget.ConstraintLayout>

!!!!JAVA FOR ACTIVITY 1!!!!

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



!!!JAVA FOR INFO ACTIVITY!!!!





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

