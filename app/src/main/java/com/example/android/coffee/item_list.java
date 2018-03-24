package com.example.android.coffee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class item_list extends AppCompatActivity {

    Button b1 , b2 ;
    TextView t1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);
    }

    public void addListenerOnButton(){
        b1 = (Button)findViewById(R.id.add) ;
        b2 = (Button)findViewById(R.id.minus) ;
        t1 = (TextView)findViewById(R.id.quantity) ;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value ;
                value = Integer.parseInt(t1.getText().toString()) ;
                value = value+ 1 ;
                t1.setText(""+ value );
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value ;
                value = Integer.parseInt(t1.getText().toString()) ;
                value = value- 1 ;
                t1.setText(Integer.toString(value));
            }
        });

    }
}
