package com.azizemir.moblperformans;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText sayi1,sayi2;
    Button hesapla;
    TextView sonuc;
    LinearLayout ArkaPlan;
    ImageButton LightMode,DarkMode;

    ArrayList<Integer> numaralar=new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sayi1=findViewById(R.id.BaslangicDegeri);
        sayi2=findViewById(R.id.BitisDegeri);
        sonuc=findViewById(R.id.sonuc);
        hesapla=findViewById(R.id.hesapla);
        LightMode=findViewById(R.id.LightMode);
        DarkMode=findViewById(R.id.DarkMode);
        ArkaPlan=findViewById(R.id.ArkaPlan);

        LightMode.setBackgroundColor(getResources().getColor(R.color.white));
        DarkMode.setBackgroundColor(getResources().getColor(R.color.white));

        LightMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArkaPlan.setBackgroundColor(getResources().getColor(R.color.white));
                sayi1.setBackgroundColor(getResources().getColor(R.color.white));
                sayi2.setBackgroundColor(getResources().getColor(R.color.white));
                sayi1.setTextColor(getResources().getColor(R.color.black));
                sayi2.setTextColor(getResources().getColor(R.color.black));
                sayi1.setHintTextColor(getResources().getColor(R.color.black));
                sayi2.setHintTextColor(getResources().getColor(R.color.black));
                sonuc.setTextColor(getResources().getColor(R.color.black));
                LightMode.setBackgroundColor(getResources().getColor(R.color.white));
                DarkMode.setBackgroundColor(getResources().getColor(R.color.white));
            }
        });

        DarkMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArkaPlan.setBackgroundColor(getResources().getColor(R.color.ArkaPlan));
                sayi1.setBackgroundColor(getResources().getColor(R.color.ArkaPlan));
                sayi2.setBackgroundColor(getResources().getColor(R.color.ArkaPlan));
                sayi1.setTextColor(getResources().getColor(R.color.white));
                sayi2.setTextColor(getResources().getColor(R.color.white));
                sayi1.setHintTextColor(getResources().getColor(R.color.white));
                sayi2.setHintTextColor(getResources().getColor(R.color.white));
                sonuc.setTextColor(getResources().getColor(R.color.white));
                LightMode.setBackgroundColor(getResources().getColor(R.color.ArkaPlan));
                DarkMode.setBackgroundColor(getResources().getColor(R.color.ArkaPlan));

            }
        });

        hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (sayi1.getText().toString().trim().length() == 0 || sayi2.getText().toString().trim().length() ==0) {
                    Toast.makeText(getApplicationContext(), "Alanlar Boş Bırakılamaz !", Toast.LENGTH_SHORT).show();
                }
                else {
                    numaralar.clear();
                    int gelensayi1 = Integer.parseInt(sayi1.getText().toString());
                    int gelensayi2 = Integer.parseInt(sayi2.getText().toString());

                    for (int sayi = gelensayi1; sayi <= gelensayi2; sayi++) {

                        int kontrol = 0;

                        for (int i = 2; i < sayi; i++) {

                            if (sayi % i == 0) {
                                kontrol = 1;
                                break;
                            }

                        }

                        if (kontrol == 0) {
                            numaralar.add(sayi);
                        }
                    }

                    String asallar = Arrays.toString(numaralar.toArray());
                    sonuc.setText(asallar);
                    System.out.println(asallar);
                }
            }
        });
    }
}