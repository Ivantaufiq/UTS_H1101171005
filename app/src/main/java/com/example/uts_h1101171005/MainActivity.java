package com.example.uts_h1101171005;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.uts_h1101171005.KomponenActivity.Komponen1Activity;
import com.example.uts_h1101171005.KomponenActivity.Komponen2Activity;
import com.example.uts_h1101171005.KomponenActivity.Komponen3Activity;
import com.example.uts_h1101171005.KomponenActivity.Komponen4Activity;
import com.example.uts_h1101171005.KomponenActivity.Komponen5Activity;

public class MainActivity extends AppCompatActivity {
    Button komponen1,komponen2,komponen3,komponen4,komponen5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        komponen1 = (Button) findViewById(R.id.komponen1);
        komponen2 = (Button) findViewById(R.id.komponen2);
        komponen3 = (Button) findViewById(R.id.komponen3);
        komponen4 = (Button) findViewById(R.id.komponen4);
        komponen5 = (Button) findViewById(R.id.komponen5);

        komponen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, Komponen1Activity.class);
                startActivity(a);
            }
        });

        komponen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(MainActivity.this, Komponen2Activity.class);
                startActivity(b);
            }
        });

        komponen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(MainActivity.this, Komponen3Activity.class);
                startActivity(c);
            }
        });

        komponen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(MainActivity.this, Komponen4Activity.class);
                startActivity(d);
            }
        });

        komponen5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(MainActivity.this, Komponen5Activity.class);
                startActivity(e);
            }
        });
    }
}
