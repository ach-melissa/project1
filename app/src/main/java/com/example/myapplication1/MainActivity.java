package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etFirstValue, etSecondValue;
    Button btnAdd, btnSub, btnMul, btnDiv;
    double num1, num2;
    TextView tvResult;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstValue = findViewById(R.id.etfirstvalue);
        etSecondValue = findViewById(R.id.etsecondvalue);
        btnAdd = findViewById(R.id.btnadd);
        btnSub = findViewById(R.id.btnsub);
        btnMul = findViewById(R.id.btnmul);
        btnDiv = findViewById(R.id.btndiv);
        tvResult = findViewById(R.id.tvresult);

        setClickListeners();
    }

    void setClickListeners() {
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(etFirstValue.getText().toString());
                num2 = Double.parseDouble(etSecondValue.getText().toString());
                double result = num1 + num2;
                tvResult.setText(String.valueOf(result));
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(etFirstValue.getText().toString());
                num2 = Double.parseDouble(etSecondValue.getText().toString());
                double result = num1 - num2;
                tvResult.setText(String.valueOf(result));
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(etFirstValue.getText().toString());
                num2 = Double.parseDouble(etSecondValue.getText().toString());
                double result = num1 * num2;
                tvResult.setText(String.valueOf(result));
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(etFirstValue.getText().toString());
                num2 = Double.parseDouble(etSecondValue.getText().toString());
                double result = num1 / num2;
                tvResult.setText(String.valueOf(result));
            }
        });
    }
}

