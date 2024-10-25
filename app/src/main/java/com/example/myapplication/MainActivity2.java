package com.example.myapplication;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private EditText set_drink;
    private RadioGroup rg1,rg2;
    private Button btn_send;

    private String sugar ="無糖";
    private String ice_opt = "去冰";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        rg1 = findViewById(R.id.radioGroup);
        rg1.setOnCheckedChangeListener((radioGroup, i) -> {
            if(i == R.id.radioButton1) {
                sugar = "無糖";
        });
        });
    }
}