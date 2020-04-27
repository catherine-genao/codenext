package com.example.hairbychioce;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity_Welcome_Page extends AppCompatActivity {

    ConstraintLayout background;
    TextView welcome;
    TextView nameDisplay;
    TextView ageDisplay;
    ImageView view2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainwelcomepage);
        nameDisplay = findViewById(R.id.nameDisplay);
        ageDisplay = findViewById(R.id.ageDisplay);


        Intent data = getIntent();

      ageDisplay.setText(data.getStringExtra("Userage"));
      nameDisplay.setText(data.getStringExtra("Username"));

        background = findViewById(R.id.background);
    welcome = findViewById(R.id.welcome);
    view2 = findViewById(R.id.view2);
    view2.setImageResource(R.drawable.hands);

    background.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        goToHome();



        }
    });

    }

    public void goToHome() {
        Intent i = new Intent(this, MainActivity_Home.class);
        startActivity(i);

    }

}
