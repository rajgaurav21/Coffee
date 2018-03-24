package com.example.android.coffee;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    private static Button b1 ;
    private static EditText e1 , e2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        addListenerOnButton() ;
        TextView t1 = (TextView)findViewById(R.id.name) ;
        Typeface type = Typeface.createFromAsset(getAssets(), "BRLNSDB.TTF") ;
        t1.setTypeface(type) ;
        TextView t2 = (TextView)findViewById(R.id.user) ;
        Typeface type1 = Typeface.createFromAsset(getAssets(), "BRLNSDB.TTF") ;
        t2.setTypeface(type1) ;
        TextView t3 = (TextView)findViewById(R.id.email) ;
        Typeface type2 = Typeface.createFromAsset(getAssets(), "BRLNSDB.TTF") ;
        t3.setTypeface(type2) ;
        TextView t4 = (TextView)findViewById(R.id.pass) ;
        Typeface type3 = Typeface.createFromAsset(getAssets(), "BRLNSDB.TTF") ;
        t4.setTypeface(type3) ;
        TextView t5 = (TextView)findViewById(R.id.passconfirm) ;
        Typeface type4 = Typeface.createFromAsset(getAssets(), "BRLNSDB.TTF") ;
        t5.setTypeface(type4) ;
        EditText e1, e2, e3, e4, e5 ;
        e1 = (EditText)findViewById(R.id.nameedit) ;
        Typeface face = Typeface.createFromAsset(getAssets(), "BRLNSR.TTF") ;
        e1.setTypeface(face) ;
        e2 = (EditText)findViewById(R.id.useredit) ;
        Typeface face1 = Typeface.createFromAsset(getAssets(), "BRLNSR.TTF") ;
        e2.setTypeface(face1) ;
        e3 = (EditText)findViewById(R.id.emailedit) ;
        Typeface face2 = Typeface.createFromAsset(getAssets(), "BRLNSR.TTF") ;
        e3.setTypeface(face2) ;
        e4 = (EditText)findViewById(R.id.passedit) ;
        Typeface face3 = Typeface.createFromAsset(getAssets(), "BRLNSR.TTF") ;
        e4.setTypeface(face3) ;
        e5 = (EditText)findViewById(R.id.passconfirmedit) ;
        Typeface face4 = Typeface.createFromAsset(getAssets(), "BRLNSR.TTF") ;
        e5.setTypeface(face4) ;
    }

    public void addListenerOnButton(){
        b1 = (Button)findViewById(R.id.submit) ;
        e1 = (EditText)findViewById(R.id.passedit) ;
        e2 = (EditText)findViewById(R.id.passconfirmedit) ;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = e1.getText().toString() ;
                String s2 = e2.getText().toString() ;
                if ( !(s1.equals(s2)) ){
                    Toast.makeText( SignUp.this , "Password doesn't match !! Try Again" , Toast.LENGTH_LONG ).show() ;
                }
                else {
                    Intent in = new Intent(SignUp.this, MainActivity.class);
                    startActivity(in);
                }
            }
        });
    }
}
