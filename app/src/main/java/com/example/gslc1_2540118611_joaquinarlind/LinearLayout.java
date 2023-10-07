package com.example.gslc1_2540118611_joaquinarlind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class LinearLayout extends AppCompatActivity {
    TextView title, tripAsk, driverName;
    ImageView driverImg;
    RatingBar driverRating;
    EditText tripDate, tripTime, experienceText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        title = findViewById(R.id.titleActivity);
        title.setText("Linear Layout of Online Driver Rating");
        tripAsk = findViewById(R.id.tripAsk);
        driverImg = findViewById(R.id.imageView);
        driverImg.setImageResource(R.drawable.avatar);

        driverName = findViewById(R.id.driverName);
        driverRating = findViewById(R.id.ratingBar);
        tripDate = findViewById(R.id.editTextDate2);
        tripTime = findViewById(R.id.editTextTime2);
        experienceText = findViewById(R.id.experienceText);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LinearLayout.this, RelativeLayout.class);
                startActivity(intent);
            }
        });
    }
}