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

import org.w3c.dom.Text;

public class Prism extends AppCompatActivity {

    EditText alasPrism;
    EditText tinggiSegitiga;
    EditText tinggiPrism;
    TextView hasilPrism;
    Button prismCalculate;
    Button reset;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prism);

        alasPrism = findViewById(R.id.prism_alas);
        tinggiSegitiga = findViewById(R.id.prism_tinggi);
        tinggiPrism = findViewById(R.id.prism_tinggiP);
        hasilPrism = findViewById(R.id.prism_hasil);
        prismCalculate = findViewById(R.id.prism_calculate);
        reset = findViewById(R.id.reset);
        back = findViewById(R.id.arrowBack);

        prismCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String alasStr = alasPrism.getText().toString();
                String tinggiStr = tinggiSegitiga.getText().toString();
                String tinggiPStr = tinggiPrism.getText().toString();

                if (!alasStr.isEmpty() && !tinggiStr.isEmpty() && !tinggiPStr.isEmpty()) {
                    double alas = Double.parseDouble(alasStr);
                    double tinggi = Double.parseDouble(tinggiStr);
                    double tinggiP = Double.parseDouble(tinggiPStr);
                    double hasil = 0;
                    hasil = 0.5 * alas * tinggi * tinggiP;
                    hasilPrism.setText("Hasil : " + hasil);
                } else {
                    Toast.makeText(Prism.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alasPrism.setText("");
                tinggiSegitiga.setText("");
                tinggiPrism.setText("");
                hasilPrism.setText("Hasil");
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