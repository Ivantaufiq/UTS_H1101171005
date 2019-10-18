package com.example.uts_h1101171005.KomponenActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.uts_h1101171005.ContohSyntax.Syntax1;
import com.example.uts_h1101171005.R;

public class Komponen1Activity extends AppCompatActivity {
    Button syntax1, link1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen1);
        syntax1 = (Button) findViewById(R.id.syntax1);
        link1 = (Button) findViewById(R.id.link1);

        syntax1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(Komponen1Activity.this, Syntax1.class);
                startActivity(f);
            }
        });
    }

    public void link(View view) {
        Intent link1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/components/fundamentals?hl=id#Components"));
        startActivity(link1);
    }
}
