package com.example.tugasluasmatematika_java.bangunruang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tugasluasmatematika_java.R;

import org.w3c.dom.Text;

public class Beam extends AppCompatActivity {

    EditText panjangBeam;
    EditText lebarBeam;
    EditText tinggiBeam;
    TextView hasilBeam;
    Button beamCalculate;
    Button reset;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beam);

        panjangBeam = findViewById(R.id.beam_panjang);
        lebarBeam = findViewById(R.id.beam_lebar);
        tinggiBeam = findViewById(R.id.beam_tinggi);
        hasilBeam = findViewById(R.id.beam_hasil);
        beamCalculate = findViewById(R.id.beam_calculate);
        reset = findViewById(R.id.reset);
        back = findViewById(R.id.arrowBack);

        beamCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String panjangStr = panjangBeam.getText().toString();
                String lebarStr = lebarBeam.getText().toString();
                String tinggiStr = tinggiBeam.getText().toString();

                if (!panjangStr.isEmpty() && !lebarStr.isEmpty() && !tinggiStr.isEmpty()) {
                    double panjang = Double.parseDouble(panjangStr);
                    double lebar = Double.parseDouble(lebarStr);
                    double tinggi = Double.parseDouble(tinggiStr);
                    double hasil = 0;
                    hasil = panjang * lebar * tinggi;
                    hasilBeam.setText("Hasil : " + hasil);
                } else {
                    Toast.makeText(Beam.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
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
                panjangBeam.setText("");
                lebarBeam.setText("");
                tinggiBeam.setText("");
                hasilBeam.setText("Hasil");
            }
        });
    }
}