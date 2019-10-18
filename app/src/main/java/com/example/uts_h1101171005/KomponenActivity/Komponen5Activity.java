

package com.example.uts_h1101171005.KomponenActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.uts_h1101171005.ContohSyntax.Syntax5;
import com.example.uts_h1101171005.MainActivity;
import com.example.uts_h1101171005.R;

public class Komponen5Activity extends AppCompatActivity {
    Button syntax5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen5);
        syntax5 = (Button) findViewById(R.id.syntax5);

        syntax5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(Komponen5Activity.this, Syntax5.class);
                startActivity(j);
            }
        });
    }

    public void link5(View view) {
        Intent link5 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/components/intents-filters?hl=id#Types"));
        startActivity(link5);
    }
}