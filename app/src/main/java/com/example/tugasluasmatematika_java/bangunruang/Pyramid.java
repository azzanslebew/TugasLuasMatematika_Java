package com.example.tugasluasmatematika_java.bangunruang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tugasluasmatematika_java.R;

public class Pyramid extends AppCompatActivity {

    EditText sisiPyramid;
    EditText tinggiPyramid;
    TextView hasilPyramid;
    Button pyramidCalculate;
    Button reset;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyramid);

        sisiPyramid = findViewById(R.id.pyramid_sisi);
        tinggiPyramid = findViewById(R.id.pyramid_tinggi);
        hasilPyramid = findViewById(R.id.pyramid_hasil);
        pyramidCalculate = findViewById(R.id.pyramid_calculate);
        reset = findViewById(R.id.reset);
        back = findViewById(R.id.arrowBack);

        pyramidCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sisiStr = sisiPyramid.getText().toString();
                String tinggiStr = tinggiPyramid.getText().toString();

                if (!sisiStr.isEmpty() && !tinggiStr.isEmpty()) {
                    double sisi = Double.parseDouble(sisiStr);
                    double tinggi = Double.parseDouble(tinggiStr);
                    double hasil = 0;
                    hasil = 0.33 * sisi * sisi * tinggi;
                    hasilPyramid.setText("Hasil : " + String.format("%.3f", hasil));
                } else {
                    Toast.makeText(Pyramid.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sisiPyramid.setText("");
                tinggiPyramid.setText("");
                hasilPyramid.setText("Hasil");
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}