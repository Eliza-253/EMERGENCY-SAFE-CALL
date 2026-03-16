package com.example.emergency_response_hub;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    Button signupBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        signupBtn = findViewById(R.id.signupBtn);

        signupBtn.setOnClickListener(v -> {
            startActivity(new Intent(SignupActivity.this, HomeActivity.class));
        });
    }
}