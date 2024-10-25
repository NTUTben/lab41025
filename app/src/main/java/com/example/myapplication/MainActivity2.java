package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    private EditText set_drink;
    private RadioGroup rg1, rg2;
    private Button btn_send;

    private String sugar = "無糖";
    private String ice_opt = "去冰";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn_send = findViewById(R.id.btn_send);
        btn_send.setOnClickListener(view -> {
            set_drink = findViewById(R.id.ed_drink);
            String drink = set_drink.getText().toString();
            Intent i = new Intent();
            Bundle b = new Bundle();
            b.putString("drink", drink);
            b.putString("sugar", sugar);
            b.putString("ice", ice_opt);
            i.putExtras(b);
            setResult(Activity.RESULT_OK, i); // 用 RESULT_OK 標記執行結果
            finish();
        });

        rg1 = findViewById(R.id.radioGroup); // 選擇 RadioGroup 畫面元件
        rg1.setOnCheckedChangeListener((radioGroup, i) -> {

            if (i == R.id.radioButton1) {
                sugar = "無糖"; // 按下 radioButton1，紀錄無糖
            } else if (i == R.id.radioButton2) {
                sugar = "少糖"; // 按下 radioButton2，紀錄少糖
            } else if (i == R.id.radioButton3) {
                sugar = "半糖"; // 按下 radioButton3，紀錄半糖
            } else if (i == R.id.radioButton4) {
                sugar = "全糖"; // 按下 radioButton4，紀錄全糖
            }
        });
        rg2 = findViewById(R.id.radioGroup2);
        rg2.setOnCheckedChangeListener((radioGroup, i) -> {

            if (i == R.id.radioButton5) {
                ice_opt = "去冰"; // 按下 radioButton5，紀錄去冰
            } else if (i == R.id.radioButton6) {
                ice_opt = "微冰"; // 按下 radioButton6，紀錄微冰
            } else if (i == R.id.radioButton7) {
                ice_opt = "少冰"; // 按下 radioButton7，紀錄少冰
            } else if (i == R.id.radioButton8) {
                ice_opt = "正常冰"; // 按下 radioButton8，紀錄正常冰
            }
        });
    }
}


