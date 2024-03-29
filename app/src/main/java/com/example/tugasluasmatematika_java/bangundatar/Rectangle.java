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

public class Rectangle extends AppCompatActivity {

    EditText panjangRectangle;
    EditText lebarRectangle;
    TextView hasilRectangle;
    Button rectangleCalculate;
    ImageView back;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);

        panjangRectangle = findViewById(R.id.rectangle_panjang);
        lebarRectangle = findViewById(R.id.rectangle_lebar);
        hasilRectangle = findViewById(R.id.rectangle_hasil);
        rectangleCalculate = findViewById(R.id.rectangle_calculate);
        back = findViewById(R.id.arrowBack);
        reset = findViewById(R.id.reset);

        rectangleCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String panjangStr = panjangRectangle.getText().toString();
                String lebarStr = lebarRectangle.getText().toString();

                if (!panjangStr.isEmpty() && !lebarStr.isEmpty()) {
                    double panjang = Double.parseDouble(panjangStr);
                    double lebar = Double.parseDouble(lebarStr);
                    double hasil = 0;
                    hasil = panjang * lebar;
                    hasilRectangle.setText("Hasil : " + hasil);
                } else {
                    Toast.makeText(Rectangle.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
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
                panjangRectangle.setText("");
                lebarRectangle.setText("");
                hasilRectangle.setText("Hasil");
            }
        });
    }
}