package com.example.datanilaimahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nama, nim, ntugas, nuts, nuas, nakhir, predikat;
    Button hitung;
    private Button add;
    Double vntugas, vnuts, vnuas, vnakhir;
    String vnama, vpredikat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nama = (EditText)findViewById(R.id.nama);
        nim = (EditText)findViewById(R.id.nim);
        ntugas = (EditText)findViewById(R.id.ntugas);
        nuts = (EditText)findViewById(R.id.nuts);
        nuas = (EditText)findViewById(R.id.nuas);
        nakhir = (EditText)findViewById(R.id.nakhir);
        predikat = (EditText)findViewById(R.id.predikat);
        hitung = (Button)findViewById(R.id.hitung);
        add = findViewById(R.id.ADD);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = nama.getText().toString();
                String usernim = nim.getText().toString();
                String usertugas = ntugas.getText().toString();
                String useruts = nuts.getText().toString();
                String useruas = nuas.getText().toString();
                String userakhir = nakhir.getText().toString();
                String userpredikat = predikat.getText().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                intent.putExtra("keyname", username);
                intent.putExtra("keynim", usernim);
                intent.putExtra("keytugas", usertugas);
                intent.putExtra("keyuts", useruts);
                intent.putExtra("keyuas", useruas);
                intent.putExtra("keyakhir", userakhir);
                intent.putExtra("keypredikat", userpredikat);

                startActivity(intent);
            }
        });


    }


    public void hitung(View view) {
        vntugas = Double.parseDouble(ntugas.getText().toString());
        vnuts = Double.parseDouble(nuts.getText().toString());
        vnuas = Double.parseDouble(nuas.getText().toString());

        vnakhir = (0.35 * vntugas) + (0.30 * vnuts) + (0.35 * vnuas);

        if(vnakhir >= 85 && vnakhir <=100){
            vpredikat = "A";
        }
        else if(vnakhir >= 75 && vnakhir <=85){
            vpredikat = "B";
        }
        else if(vnakhir >= 65 && vnakhir <=75){
            vpredikat = "C";
        }
        else if(vnakhir >= 55 && vnakhir <=65){
            vpredikat = "D";
        }
        else{
            vpredikat = "E";
        }
        nakhir.setText(""+vnakhir);
        predikat.setText(""+vpredikat);
    }

}