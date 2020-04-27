package com.example.hairbychioce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button nxtBtn;
    EditText name;
    EditText age;
    ImageView logo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nxtBtn = findViewById(R.id.nxtBtn);
        name = findViewById(R.id.nameET);
        age = findViewById(R.id.ageET);
        logo2 = findViewById(R.id.logo2);

        logo2.setImageResource(R.drawable.logo);




        nxtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                goToWelcomePage();

            }
        });

    }

    public void goToWelcomePage(){
        Intent i = new Intent(this,MainActivity_Welcome_Page.class);
        i.putExtra("Username",name.getText().toString());
        i.putExtra("Userage",age.getText().toString());
        startActivity(i);

    }

}

