package com.example.modultoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mytoast.ShowToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShowToast.tampilToast("Test Toast", this);
    }
}