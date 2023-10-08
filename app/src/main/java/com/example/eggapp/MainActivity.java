package com.example.eggapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private int counter;
private TextView txtCounter;
private ImageView imgZaman;
private void reset (){
    counter = 10;
    txtCounter= findViewById(R.id.txt_counter);
    imgZaman=findViewById(R.id.img_zaman);
    txtCounter.setText(Integer.toString(counter));
    imgZaman.setImageResource(R.drawable.sad);
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reset();
    }

    public void imgOnClick(View view) {
       if (counter>0){
           counter--;
       }
       if (counter==0){
           imgZaman.setImageResource(R.drawable.happy);
       }
        txtCounter.setText(Integer.toString(counter));
    }

    public void resetOnClick(View view) {
        reset();
    }
}