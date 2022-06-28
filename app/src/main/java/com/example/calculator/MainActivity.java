package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText value1 = findViewById(R.id.value1);
        EditText value2 = findViewById(R.id.value2);
        TextView result = findViewById(R.id.res);
        TextView operation = findViewById(R.id.operation);
        Button sum = findViewById(R.id.sum);
        Button sub = findViewById(R.id.sub);
        Button multi = findViewById(R.id.multi);
        Button div = findViewById(R.id.div);
        value1.setOnFocusChangeListener((view, b) -> {
            if(value1.getText().toString().equals("")){
                operation.setText("?");
            }
        });
        value2.setOnFocusChangeListener((view, b) -> {
            if(value2.getText().toString().equals("")){
                operation.setText("?");
            }
        });
        sum.setOnClickListener(view -> {
            if (value1.getText().toString().equals("")){
                value1.setError("Please Enter missing value");
            }else if(value2.getText().toString().equals("")){
                value2.setError("Please Enter missing value");
            } else{
                operation.setText("+");
                float x = Float.parseFloat(value1.getText().toString());
                float y = Float.parseFloat(value2.getText().toString());
                result.setText(String.valueOf(x + y));
            }
        });
        sub.setOnClickListener(view -> {
            if (value1.getText().toString().equals("")){
                value1.setError("Please Enter missing value");
            }else if(value2.getText().toString().equals("")){
                value2.setError("Please Enter missing value");
            }else {
                operation.setText("-");
                float x = Float.parseFloat(value1.getText().toString());
                float y = Float.parseFloat(value2.getText().toString());
                result.setText(String.valueOf(x - y));
            }
        });
        multi.setOnClickListener(view -> {
            if (value1.getText().toString().equals("")){
                value1.setError("Please Enter missing value");
            }else if(value2.getText().toString().equals("")){
                value2.setError("Please Enter missing value");
            }else {
                operation.setText("×");
                float x = Float.parseFloat(value1.getText().toString());
                float y = Float.parseFloat(value2.getText().toString());
                result.setText(String.valueOf(x * y));
            }
        });
        div.setOnClickListener(view -> {
            if (value1.getText().toString().equals("")){
                value1.setError("Please Enter missing value");
            }else if(value2.getText().toString().equals("")){
                value2.setError("Please Enter missing value");
            }else {
                operation.setText("/");
                float x = Float.parseFloat(value1.getText().toString());
                float y = Float.parseFloat(value2.getText().toString());
                result.setText(String.valueOf(x / y));
            }
        });
    }
}