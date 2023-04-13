package com.test.dorislem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ilkSayi, ikinciSayi;
    TextView txtSonuc;
    Button topla, cıkar, carp, bol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ilkSayi = (EditText) findViewById(R.id.ilkSayi);
        ikinciSayi = (EditText) findViewById(R.id.ikinciSayi);
        topla = (Button) findViewById(R.id.buttonTopla);
        cıkar = (Button) findViewById(R.id.buttonCikar);
        carp = (Button) findViewById(R.id.buttonCarp);
        bol =  (Button) findViewById(R.id.buttonBol);
        txtSonuc = (TextView) findViewById(R.id.sonuc);

        topla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1 = Integer.parseInt(ilkSayi.getText().toString());
                int sayi2 = Integer.parseInt(ikinciSayi.getText().toString());
                int sonuc = sayi1 + sayi2;
                txtSonuc.setText(String.valueOf(sonuc));
            }
        });

        cıkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1 = Integer.parseInt(ilkSayi.getText().toString());
                int sayi2 = Integer.parseInt(ikinciSayi.getText().toString());
                int sonuc = sayi1 - sayi2;
                txtSonuc.setText(String.valueOf(sonuc));
            }
        });
        carp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1 = Integer.parseInt(ilkSayi.getText().toString());
                int sayi2 = Integer.parseInt(ikinciSayi.getText().toString());
                int sonuc = sayi1 * sayi2;
                txtSonuc.setText(String.valueOf(sonuc));
            }
        });
        bol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1 = Integer.parseInt(ilkSayi.getText().toString());
                int sayi2 = Integer.parseInt(ikinciSayi.getText().toString());
                int sonuc = sayi1 / sayi2;
                txtSonuc.setText(String.valueOf(sonuc));
            }
        });



    }
}