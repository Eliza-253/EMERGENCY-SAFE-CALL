package com.example.emergency_response_hub;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import com.google.android.gms.location.*;

public class HomeActivity extends AppCompatActivity {

    Button emergencyBtn;
    FusedLocationProviderClient fusedLocationClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        emergencyBtn = findViewById(R.id.emergencyBtn);
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);

        emergencyBtn.setOnClickListener(v -> makeCall());
    }

    public void makeCall() {
        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.CALL_PHONE}, 1);
            return;
        }

        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:911")); // Change to 999 if in Kenya
        startActivity(intent);
    }
}