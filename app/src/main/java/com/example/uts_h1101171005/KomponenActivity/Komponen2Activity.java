package com.example.uts_h1101171005.KomponenActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.uts_h1101171005.ContohSyntax.Syntax2;
import com.example.uts_h1101171005.MainActivity;
import com.example.uts_h1101171005.R;

public class Komponen2Activity extends AppCompatActivity {
    Button syntax2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen2);

        syntax2 = (Button) findViewById(R.id.syntax2);

        syntax2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g = new Intent(Komponen2Activity.this, Syntax2.class);
                startActivity(g);
            }
        });
    }

    public void link2(View view) {
        Intent link2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/components/fundamentals?hl=id#Components"));
        startActivity(link2);


    }
}
