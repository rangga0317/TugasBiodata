package com.example.ranggabiodata;
import android.app.Activity;


import android.os.Bundle;
import android.widget.TextView;

public class bio extends Activity {

    TextView biome;
    public static String EXTRA_DATA = "extra_data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        biome = (TextView)findViewById(R.id.tampil);
        biome tampung = getIntent().getParcelableExtra(EXTRA_DATA);
        String text = "NIM : "+tampung.getNim()+" Nama : "+tampung.getNama()+" Kelas : "+tampung.getKelas()+
                " Tanggal Lahir : "+tampung.getTanggal();
        biome.setText(text);


    }

}
