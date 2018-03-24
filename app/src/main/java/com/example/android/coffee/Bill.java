package com.example.android.coffee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static com.example.android.coffee.OrderCoffee.txtView;

public class Bill extends AppCompatActivity {
    TextView t1 ;
    WordAdapter wa ;
    private static EditText e1 , e2 , e3 , e4 , e5 ;
    TextView t2 , t3 , t4 , t5  ;
    RadioGroup rg ;
    RadioButton rb1 , rb2 , rb3 , rb4 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);
        int total = wa.price ;
        t1 = (TextView)findViewById(R.id.bill_amount) ;
        t1.setText("Rs. " + total);
        addListenerOnRadioButton() ;
    }

    public void addListenerOnRadioButton(){
        t2 = (TextView) findViewById(R.id.card_text) ;
        t3 = (TextView)findViewById(R.id.holder_text) ;
        t4 = (TextView)findViewById(R.id.expiry_text) ;
        t5 = (TextView)findViewById(R.id.cvv) ;
        e1 = (EditText)findViewById(R.id.card_number) ;
        e2 = (EditText)findViewById(R.id.holder_name) ;
        e3 = (EditText)findViewById(R.id.expiry_month) ;
        e4 = (EditText)findViewById(R.id.expiry_year) ;
        e5 = (EditText)findViewById(R.id.cvv_number) ;
        rg  = (RadioGroup)findViewById(R.id.payment_group) ;
        rb1 = (RadioButton)findViewById(R.id.cod) ;
        rb2 = (RadioButton)findViewById(R.id.creditCard) ;
        rb3 = (RadioButton)findViewById(R.id.debitCard) ;
        rb4 = (RadioButton)findViewById(R.id.wallet) ;
        e2.setVisibility(View.INVISIBLE);
        e1.setVisibility(View.INVISIBLE);
        e3.setVisibility(View.INVISIBLE);
        e4.setVisibility(View.INVISIBLE);
        e5.setVisibility(View.INVISIBLE);
        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                e2.setVisibility(View.INVISIBLE);
                e1.setVisibility(View.INVISIBLE);
                e3.setVisibility(View.INVISIBLE);
                e4.setVisibility(View.INVISIBLE);
                e5.setVisibility(View.INVISIBLE);
            }
        });


        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText("Card Number: ");
                t3.setText("CardHolder's Name: ");
                t4.setText("Expiry: ");
                t5.setText("CVV");
                String cardNumber = e1.getText().toString() ;
                e1.setVisibility(View.VISIBLE);
                String holderName = e2.getText().toString() ;
                e2.setVisibility(View.VISIBLE);
                String expiryMonth = e3.getText().toString() ;
                e3.setVisibility(View.VISIBLE);
                String expiryYear = e4.getText().toString() ;
                e4.setVisibility(View.VISIBLE);
                String cvvNumber = e5.getText().toString() ;
                e5.setVisibility(View.VISIBLE);
            }
        });

        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText("Card Number: ");
                t3.setText("CardHolder's Name: ");
                t4.setText("Expiry: ");
                t5.setText("CVV");
                String cardNumber = e1.getText().toString() ;
                e1.setVisibility(View.VISIBLE);
                String holderName = e2.getText().toString() ;
                e2.setVisibility(View.VISIBLE);
                String expiryMonth = e3.getText().toString() ;
                e3.setVisibility(View.VISIBLE);
                String expiryYear = e4.getText().toString() ;
                e4.setVisibility(View.VISIBLE);
                String cvvNumber = e5.getText().toString() ;
                e5.setVisibility(View.VISIBLE);
            }
        });

        rb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                e1.setVisibility(View.INVISIBLE);
                e2.setVisibility(View.INVISIBLE);
                e3.setVisibility(View.INVISIBLE);
                e4.setVisibility(View.INVISIBLE);
                e5.setVisibility(View.INVISIBLE);
            }
        });
    }
}
