package com.example.calixta.hello;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //change txt color
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //make random colors
                Random random = new Random();
                int colors = Color.rgb(random.nextInt(256),random.nextInt(256), random.nextInt(256));
                ((TextView) findViewById(R.id.textView)).setTextColor(colors);
            }
        });
        //change background color
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.black));
                findViewById(R.id.button).setBackgroundColor(getResources().getColor(R.color.orange));
                findViewById(R.id.button2).setBackgroundColor(getResources().getColor(R.color.orange));
                findViewById(R.id.button3).setBackgroundColor(getResources().getColor(R.color.orange));
            }
        });
        //change txt
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String newText = ((EditText) findViewById(R.id.userText)).getText().toString();
                if (TextUtils.isEmpty(newText)) {
                    ((TextView) findViewById(R.id.textView)).setText("Hello from Rosio :)");
                }
                else {
                ((TextView) findViewById(R.id.textView)).setText(newText);
            }}
        });
        //set back to default
        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // text color
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.androidblue));
                //background
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.gray));

                //text
                ((TextView) findViewById(R.id.textView)).setText("Hello from Rosio :)");
                //button color
                findViewById(R.id.button).setBackgroundColor(getResources().getColor(R.color.androidblue));
                findViewById(R.id.button2).setBackgroundColor(getResources().getColor(R.color.androidblue));
                findViewById(R.id.button3).setBackgroundColor(getResources().getColor(R.color.androidblue));

            }
        });


    }

}
