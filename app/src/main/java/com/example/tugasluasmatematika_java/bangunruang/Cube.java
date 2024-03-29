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

public class Cube extends AppCompatActivity {

    EditText sisiCube;
    TextView hasilCube;
    Button cubeCalculate;
    Button reset;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        sisiCube = findViewById(R.id.cube_sisi);
        hasilCube = findViewById(R.id.cube_hasil);
        cubeCalculate = findViewById(R.id.cube_caculate);
        reset = findViewById(R.id.reset);
        back = findViewById(R.id.arrowBack);

        cubeCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sisiStr = sisiCube.getText().toString();

                if (!sisiStr.isEmpty()) {
                    double sisi = Double.parseDouble(sisiStr);
                    double hasil = 0;
                    hasil = sisi * sisi * sisi;
                    hasilCube.setText("Hasil : " + hasil);
                } else {
                    Toast.makeText(Cube.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
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
                sisiCube.setText("");
                hasilCube.setText("Hasil");
            }
        });
    }
}