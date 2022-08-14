package com.droiduino.bluetoothconn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnLucesDetalles;
    private Button btnHumedadDetalles;
    private Button btnHumoDetalles;
    private Button btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLucesDetalles= (Button) findViewById(R.id.btnLucesDetalles);
        btnHumedadDetalles= (Button) findViewById(R.id.btnHumedadDetalles);
        btnHumoDetalles= (Button) findViewById(R.id.btnHumoDetalles);
        btnSalir = (Button) findViewById(R.id.btnSalir);

        btnLucesDetalles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LucesActivity.class);
                startActivity(intent);
            }
        });

        btnHumedadDetalles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HumedadActivity.class);
                startActivity(intent);
            }
        });

        btnHumoDetalles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HumoActivity.class);
                startActivity(intent);
            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}