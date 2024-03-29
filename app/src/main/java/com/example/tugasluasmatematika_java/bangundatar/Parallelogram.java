package com.example.tugasluasmatematika_java.bangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tugasluasmatematika_java.R;

public class Parallelogram extends AppCompatActivity {

    EditText alasPar;
    EditText tinggiPar;
    TextView hasilPar;
    Button parCalculate;
    ImageView back;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parallelogram);

        alasPar = findViewById(R.id.par_alas);
        tinggiPar = findViewById(R.id.par_tinggi);
        hasilPar = findViewById(R.id.par_hasil);
        parCalculate = findViewById(R.id.par_calculate);
        back = findViewById(R.id.arrowBack);
        reset = findViewById(R.id.reset);

        parCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String alasStr = alasPar.getText().toString();
                String tinggiStr = tinggiPar.getText().toString();

                if (!alasStr.isEmpty() && !tinggiStr.isEmpty()) {
                    double alas = Double.parseDouble(alasStr);
                    double tinggi = Double.parseDouble(tinggiStr);
                    double hasil = 0;
                    hasil = alas * tinggi;
                    hasilPar.setText("Hasil : " + hasil);
                } else {
                    Toast.makeText(Parallelogram.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alasPar.setText("");
                tinggiPar.setText("");
                hasilPar.setText("Hasil");
            }
        });
    }
}