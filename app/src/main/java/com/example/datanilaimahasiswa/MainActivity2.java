package com.example.datanilaimahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView nama, nim, ntugas, nuts, nuas, nakhir, predikat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nama = findViewById(R.id.text_name);
        nim = findViewById(R.id.text_nim);
        ntugas = findViewById(R.id.text_tugas);
        nuts = findViewById(R.id.text_uts);
        nuas = findViewById(R.id.text_uas);
        nakhir = findViewById(R.id.text_akhir);
        predikat = findViewById(R.id.text_predikat);

        String username = getIntent().getStringExtra("keyname");
        String usernim = getIntent().getStringExtra("keynim");
        String usertugas = getIntent().getStringExtra("keytugas");
        String useruts = getIntent().getStringExtra("keyuts");
        String useruas = getIntent().getStringExtra("keyuas");
        String userakhir = getIntent().getStringExtra("keyakhir");
        String userpredikat = getIntent().getStringExtra("keypredikat");

        nama.setText(username);
        nim.setText(usernim);
        ntugas.setText(usertugas);
        nuts.setText(useruts);
        nuas.setText(useruas);
        nakhir.setText(userakhir);
        predikat.setText(userpredikat);

    }
}