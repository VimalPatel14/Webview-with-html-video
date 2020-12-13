package com.vimal.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start = new Intent(MainActivity.this,WebviewTextActivity.class);
                startActivity(start);
            }
        });

        findViewById(R.id.html).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start = new Intent(MainActivity.this,WebviewHtmlActivity.class);
                startActivity(start);
            }
        });

        findViewById(R.id.video).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start = new Intent(MainActivity.this,WebviewVideoActivity.class);
                startActivity(start);
            }
        });
    }
}