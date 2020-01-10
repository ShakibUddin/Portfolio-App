package com.portfolio.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    private ScrollView scroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scroll=(ScrollView)findViewById(R.id.scrollView);
        scroll.setSmoothScrollingEnabled(true);
    }
}
