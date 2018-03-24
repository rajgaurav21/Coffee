package com.example.android.coffee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.coffee.R.drawable.coffee;
import static com.example.android.coffee.WordAdapter.price;

public class OrderCoffee extends AppCompatActivity {
    public static TextView txtView ;
    WordAdapter db ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_coffee);
        ArrayList<Word> coffee = new ArrayList<Word>() ;
        coffee.add( new Word("Black Coffee" , "• Boiled Water, Coffee, Sugar/Sugarless" , R.drawable.coffee_14)) ;
        coffee.add( new Word("Espresso (Short Black)" , "• 1 Shot of espresso in an espresso cup" , R.drawable.espresso)) ;
        coffee.add( new Word("Short Macchiato" , "• 1 Shot of espresso espresso cup\n" +
                "• A dollop of steamed milk and foam placed on top of the espresso" , R.drawable.coffee_13)) ;
        coffee.add( new Word("Café Latte" , "• 1 shot of espresso\n" +
                "• Add steamed milk\n" +
                "• 1cm of micro-foam" , R.drawable.latte)) ;
        coffee.add( new Word("Cappuccino" , "• 1 shot of espresso\n" +
                "• Steamed milk\n" +
                "• 2-3cm of micro-foam\n" +
                "• Sprinkle chocolate on top of the coffee" , R.drawable.cappuccino)) ;
        coffee.add( new Word("Mocha" , "• 1 shot of espresso\n" +
                "• One spoon of chocolate powder\n" +
                "• Steamed milk\n" +
                "• 2-3cm of micro-foam\n" +
                "• Sprinkle chocolate powder on top" , R.drawable.mocha)) ;
        WordAdapter adapter = new WordAdapter( this , 0 , coffee ) ;
        ListView listView =(ListView)findViewById(R.id.activity_order_coffee) ;
        Button btnLoadMore = new Button(this);
        btnLoadMore.setText("Submit Order");
        listView.addFooterView(btnLoadMore);
        int total = db.price ;
        txtView = (TextView)findViewById(R.id.total_amount) ;
        txtView.setText(Integer.toString(total));

        btnLoadMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent( OrderCoffee.this , Bill.class ) ;
                startActivity(in) ;
            }
        });
        listView.setAdapter(adapter) ;
    }
}
