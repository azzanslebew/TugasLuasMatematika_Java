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

public class Sphere extends AppCompatActivity {

    EditText jarijariSphere;
    TextView hasilSphere;
    Button sphereCalculate;
    Button reset;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);

        jarijariSphere = findViewById(R.id.sphere_jarijari);
        hasilSphere = findViewById(R.id.sphere_hasil);
        sphereCalculate = findViewById(R.id.sphere_calculate);
        reset = findViewById(R.id.reset);
        back = findViewById(R.id.arrowBack);

        sphereCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jarijariStr = jarijariSphere.getText().toString();

                if (!jarijariStr.isEmpty()) {
                    double jarijari = Double.parseDouble(jarijariStr);
                    double hasil = 0;
                    hasil = 4 * 3.14 * jarijari * jarijari * jarijari / 3;
                    hasilSphere.setText("Hasil : " + String.format("%.3f", hasil));
                } else {
                    Toast.makeText(Sphere.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jarijariSphere.setText("");
                hasilSphere.setText("Hasil");
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