package com.example.hairbychioce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity_Home extends AppCompatActivity {
    ImageView logo;
    ImageButton straight ;
    ImageButton wavy;
    ImageButton curly;
    ImageButton kinky;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__home);

        logo = findViewById(R.id.logo);
        straight = findViewById(R.id.straight);
        wavy = findViewById(R.id.wavy);
        curly = findViewById(R.id.curly);
        kinky = findViewById(R.id.kinky);

         logo.setImageResource(R.drawable.logo);
       wavy.setImageResource(R.drawable.wavy);
       straight.setImageResource(R.drawable.straight);
       curly.setImageResource(R.drawable.curly);
      kinky.setImageResource(R.drawable.kinky);

    }
}
