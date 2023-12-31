package com.example.gslc1_2540118611_joaquinarlind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.TextView;

public class RelativeLayout extends AppCompatActivity {
    TextView titleViewProfile, createProfileText, nameText, passwordText, enablePVP, termsCondition, gmailText;
    ImageView profileView;
    Switch switch1;
    CheckBox checkBox;
    EditText nameEdit, passwordEdit, emailEdit;
    Button submitProfileBtn, nameButton, passwordButton, cancelBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);

        titleViewProfile = findViewById(R.id.titleViewProfile);
        nameText = findViewById(R.id.nameText);
        passwordText = findViewById(R.id.passwordText);
        enablePVP = findViewById(R.id.enablePVP);
        termsCondition = findViewById(R.id.termsCondition);
        gmailText = findViewById(R.id.gmailText);
        profileView = findViewById(R.id.profileView);
        switch1 = findViewById(R.id.switch1);
        checkBox = findViewById(R.id.checkBox);
        nameEdit = findViewById(R.id.nameEdit);
        passwordEdit = findViewById(R.id.passwordEdit);
        emailEdit = findViewById(R.id.emailEdit);
        submitProfileBtn = findViewById(R.id.submitProfileBtn);
        nameButton = findViewById(R.id.nameButton);
        passwordButton = findViewById(R.id.passwordButton);
        cancelBtn = findViewById(R.id.cancelBtn);

        profileView.setImageResource(R.drawable.avatar);

        submitProfileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RelativeLayout.this, LinearLayout.class);
                startActivity(intent);
            }
        });

        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RelativeLayout.this, LinearLayout.class);
                startActivity(intent);
            }
        });
    }
}