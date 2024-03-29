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

public class Cylinder extends AppCompatActivity {

    EditText jarijariCylinder;
    EditText tinggiCylinder;
    TextView hasilCylinder;
    Button cylinderCalculate;
    Button reset;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        jarijariCylinder = findViewById(R.id.cylinder_jarijari);
        tinggiCylinder = findViewById(R.id.cylinder_tinggi);
        hasilCylinder = findViewById(R.id.cylinder_hasil);
        cylinderCalculate = findViewById(R.id.cylinder_calculate);
        reset = findViewById(R.id.reset);
        back = findViewById(R.id.arrowBack);

        cylinderCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jarijariStr = jarijariCylinder.getText().toString();
                String tinggiStr = tinggiCylinder.getText().toString();

                if (!jarijariStr.isEmpty() && !tinggiStr.isEmpty()) {
                    double jarijari = Double.parseDouble(jarijariStr);
                    double tinggi = Double.parseDouble(tinggiStr);
                    double hasil = 0;
                    hasil = 3.14 * jarijari * jarijari * tinggi;
                    hasilCylinder.setText("Hasil : " + String.format("%.3f", hasil));
                } else {
                    Toast.makeText(Cylinder.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jarijariCylinder.setText("");
                tinggiCylinder.setText("");
                hasilCylinder.setText("Hasil");
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