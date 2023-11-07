package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter=10;
        TextView countertextview= findViewById(R.id.textView_counter);
        countertextview.setText(""+counter);
    }

    public void knock(View view) {
        if(counter>0) {
            counter--;
            TextView countertextview = findViewById(R.id.textView_counter);
            countertextview.setText("" + counter);
            if (counter==0){
                ImageView oceanimageview = findViewById(R.id.imageView_ocean);
                oceanimageview.setImageResource(R.drawable.teva);
            }
        }
    }

    public void reset(View view) {
        counter=10;
        TextView countertextview = findViewById(R.id.textView_counter);
        countertextview.setText("" + counter);
        ImageView oceanimageview = findViewById(R.id.imageView_ocean);
        oceanimageview.setImageResource(R.drawable.ocean);
    }
}