package com.example.android.coffee;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static Button b1 , b2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t1 = (TextView)findViewById(R.id.username) ;
        Typeface type = Typeface.createFromAsset(getAssets(), "BRLNSDB.TTF") ;
        t1.setTypeface(type) ;
        TextView t2 = (TextView)findViewById(R.id.password) ;
        Typeface type1 = Typeface.createFromAsset(getAssets(), "BRLNSDB.TTF") ;
        t2.setTypeface(type1) ;
        EditText e1 = (EditText) findViewById(R.id.username_edit) ;
        Typeface type3 = Typeface.createFromAsset(getAssets(), "BRLNSR.TTF") ;
        e1.setTypeface(type3) ;
        EditText e2 = (EditText) findViewById(R.id.password_edit) ;
        Typeface type4 = Typeface.createFromAsset(getAssets(), "BRLNSR.TTF") ;
        e2.setTypeface(type4) ;
        Button b1 = (Button) findViewById(R.id.signup) ;
        Typeface type5 = Typeface.createFromAsset(getAssets(), "BRLNSR.TTF") ;
        b1.setTypeface(type5) ;
        Button b2 = (Button) findViewById(R.id.signin) ;
        Typeface type6 = Typeface.createFromAsset(getAssets(), "BRLNSR.TTF") ;
        b2.setTypeface(type6) ;
        addListenerOnButton1() ;
    }

    public void addListenerOnButton1(){
        b1 = (Button)findViewById(R.id.signup) ;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this , SignUp.class) ;
                startActivity(i) ;
            }
        });
        b2 = (Button)findViewById(R.id.signin) ;
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this , OrderCoffee.class ) ;
                startActivity(in) ;
            }
        });
    }
}
