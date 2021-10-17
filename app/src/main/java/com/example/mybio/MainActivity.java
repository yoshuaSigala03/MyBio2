package com.example.mybio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonTelp;
    Button buttonEmail;
    Button buttonAlamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonTelp = findViewById(R.id.btnTelp);
        buttonEmail = findViewById(R.id.btnEmail);
        buttonAlamat = findViewById(R.id.btnAlamat);

        buttonTelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:081344767195"));
                startActivity(intent);
            }
        });

        buttonEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW);
                Uri data = Uri.parse("mailto:yoshuasigala03@gmail.com");
                intent.setData(data);
                startActivity(intent);
            }
        });

        buttonAlamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Uri gmmIntentUri = Uri.parse("geo:-2.563851, 140.498102");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
    }
}