package com.example.ranggabiodata;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText vnim, vnama, vkelas, vtanggal;
    Button moving;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vnim= (EditText) findViewById(R.id.gnim);
        vnama = (EditText) findViewById(R.id.gnama);
        vkelas = (EditText) findViewById(R.id.gkelas);
        vtanggal = (EditText) findViewById(R.id.gtanggal);

        moving = (Button) findViewById(R.id.savedata);
        moving.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String dnim = String.valueOf(vnim.getText());
                String dnama = String.valueOf(vnama.getText());
                String dkelas = String.valueOf(vkelas.getText());
                String dtanggal = String.valueOf(vtanggal.getText());

                biome tampung = new biome();
                tampung.setNim(dnim);
                tampung.setNama(dnama);
                tampung.setKelas(dkelas);
                tampung.setTanggal(dtanggal);
                Intent intent = new Intent(MainActivity.this, bio.class);
                intent.putExtra(bio.EXTRA_DATA, tampung);
                startActivity(intent);
            }
        });

    }
}
