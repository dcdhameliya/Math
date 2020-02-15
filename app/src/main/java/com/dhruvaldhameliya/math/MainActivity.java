package com.dhruvaldhameliya.math;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.dhruvaldhameliya.mymath.Math;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, String.valueOf(Math.Plus(5, 10)), Toast.LENGTH_LONG).show();
    }
}
