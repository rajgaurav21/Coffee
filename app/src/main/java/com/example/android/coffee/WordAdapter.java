package com.example.android.coffee;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.attr.resource;
import static android.R.attr.value;

/**
 * Created by Gaurav on 28-06-2017.
 */



public class WordAdapter extends ArrayAdapter<Word> {
    OrderCoffee oc ;
    public static int price=0 ;
    public WordAdapter( Activity context , int resource ,ArrayList<Word> coffee ){

        super(context , resource , coffee) ;
    }

    @NonNull
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View listItemView = convertView ;
        if (listItemView==null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_item_list, parent, false);
            final ViewHolder viewHolder = new ViewHolder() ;
            viewHolder.b1 = (Button)listItemView.findViewById(R.id.add) ;
            viewHolder.b2 = (Button)listItemView.findViewById(R.id.minus) ;
            viewHolder.t1 = (TextView)listItemView.findViewById(R.id.quantity) ;
            viewHolder.b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch ( position ){
                        case 0 : {
                            int value = Integer.parseInt(viewHolder.t1.getText().toString());
                            value = value + 1;
                            price = price + 50 ;
                            viewHolder.t1.setText(Integer.toString(value));
                            oc.txtView.setText("Rs. " + price);
                            break ;
                        }
                        case 1 : {
                            int value = Integer.parseInt(viewHolder.t1.getText().toString());
                            value = value + 1;
                            price = price + 70 ;
                            viewHolder.t1.setText(Integer.toString(value));
                            oc.txtView.setText("Rs. " + price);
                            break ;
                        }
                        case 2 : {
                            int value = Integer.parseInt(viewHolder.t1.getText().toString());
                            value = value + 1;
                            price = price + 100 ;
                            viewHolder.t1.setText(Integer.toString(value));
                            oc.txtView.setText("Rs. " + price);
                            break ;
                        }
                        case 3 : {
                            int value = Integer.parseInt(viewHolder.t1.getText().toString());
                            value = value + 1;
                            price = price + 150 ;
                            viewHolder.t1.setText(Integer.toString(value));
                            oc.txtView.setText("Rs. " + price);
                            break ;
                        }
                        case 4 : {
                            int value = Integer.parseInt(viewHolder.t1.getText().toString());
                            value = value + 1;
                            price = price + 200 ;
                            viewHolder.t1.setText(Integer.toString(value));
                            oc.txtView.setText("Rs. " + price);
                            break ;
                        }
                        case 5 : {
                            int value = Integer.parseInt(viewHolder.t1.getText().toString());
                            value = value + 1;
                            price = price + 250 ;
                            viewHolder.t1.setText(Integer.toString(value));
                            oc.txtView.setText("Rs. " + price);
                            break ;
                        }
                    }
                }
            });
            viewHolder.b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch ( position ){
                        case 0 : {
                            int value = Integer.parseInt(viewHolder.t1.getText().toString());
                            if ( value == 0 )
                                viewHolder.b2.setSaveEnabled(false) ;
                            else {
                                value = value - 1;
                                price = price - 50;
                                viewHolder.t1.setText(Integer.toString(value));
                                oc.txtView.setText("Rs. " + price);
                                break;
                            }
                        }
                        case 1 : {
                            int value = Integer.parseInt(viewHolder.t1.getText().toString());
                            if ( value == 0 )
                                viewHolder.b2.setSaveEnabled(false) ;
                            else {
                                value = value - 1;
                                price = price - 70;
                                viewHolder.t1.setText(Integer.toString(value));
                                oc.txtView.setText("Rs. " + price);
                                break;
                            }
                        }
                        case 2 : {
                            int value = Integer.parseInt(viewHolder.t1.getText().toString());
                            if ( value == 0 )
                                viewHolder.b2.setSaveEnabled(false) ;
                            else {
                                value = value - 1;
                                price = price - 100;
                                viewHolder.t1.setText(Integer.toString(value));
                                oc.txtView.setText("Rs. " + price);
                                break;
                            }
                        }
                        case 3 : {
                            int value = Integer.parseInt(viewHolder.t1.getText().toString());
                            if ( value == 0 )
                                viewHolder.b2.setSaveEnabled(false) ;
                            else {
                                value = value - 1;
                                price = price - 150;
                                viewHolder.t1.setText(Integer.toString(value));
                                oc.txtView.setText("Rs. " + price);
                                break;
                            }
                        }
                        case 4 : {
                            int value = Integer.parseInt(viewHolder.t1.getText().toString());
                            if ( value == 0 )
                                viewHolder.b2.setSaveEnabled(false) ;
                            else {
                                value = value - 1;
                                price = price - 200;
                                viewHolder.t1.setText(Integer.toString(value));
                                oc.txtView.setText("Rs. " + price);
                                break;
                            }
                        }
                        case 5 : {
                            int value = Integer.parseInt(viewHolder.t1.getText().toString());
                            if ( value == 0 )
                                viewHolder.b2.setSaveEnabled(false);
                            else {
                                value = value - 1;
                                price = price - 250;
                                viewHolder.t1.setText(Integer.toString(value));
                                oc.txtView.setText("Rs. " + price);
                                break;
                            }
                        }

                    }

                }

            });
            listItemView.setTag(viewHolder) ;
        }
        Word currentWord = getItem(position) ;
        TextView coffeeName1 = (TextView)listItemView.findViewById(R.id.coffeeName) ;
        coffeeName1.setText(currentWord.getmCoffeeName()) ;

        TextView coffeeIngredients1 = (TextView)listItemView.findViewById(R.id.coffeeIngredients) ;
        coffeeIngredients1.setText(currentWord.getmCoffeeIngredients()) ;

        ImageView imageView =(ImageView)listItemView.findViewById(R.id.image) ;
        if ( currentWord.hasImage() ){
            imageView.setImageResource(currentWord.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            imageView.setVisibility(View.GONE);
        }

        return  listItemView ;
    }

    public class ViewHolder {
        Button b1 ;
        Button b2 ;
        TextView t1 ;
        TextView price1 ;
        ImageView i1 ;
    }
}
