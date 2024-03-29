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

public class Circle extends AppCompatActivity {

    EditText jarijariCircle;
    TextView hasilCircle;
    Button circleCalculate;
    ImageView back;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        jarijariCircle = findViewById(R.id.circle_jarijari);
        hasilCircle = findViewById(R.id.circle_hasil);
        circleCalculate = findViewById(R.id.circle_calculate);
        back = findViewById(R.id.arrowBack);
        reset = findViewById(R.id.reset);

        circleCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jarijariStr = jarijariCircle.getText().toString();

                if (!jarijariStr.isEmpty()) {
                    double jari_jari = Double.parseDouble(jarijariStr);
                    double hasil = 0;
                    hasil = 3.14 * jari_jari * jari_jari;
                    hasilCircle.setText("Hasil : " + String.format("%.3f", hasil));
                } else {
                    Toast.makeText(Circle.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
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
                jarijariCircle.setText("");
                hasilCircle.setText("Hasil");
            }
        });
    }
}