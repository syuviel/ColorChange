package com.example.colorchange;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button mMagicButton;
    private ConstraintLayout mLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLayout = findViewById(R.id.myLayout);

        mMagicButton = findViewById(R.id.button);
        mMagicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();

                int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));

                mLayout.setBackgroundColor(color);
                mMagicButton.setBackgroundColor(color);
            }
        });

    }
}