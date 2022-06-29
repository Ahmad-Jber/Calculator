package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText value1;
    EditText value2;
    TextView result;
    TextView operation;
    Button sum;
    Button sub;
    Button multi;
    Button div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        value1 = findViewById(R.id.value1);
        value2 = findViewById(R.id.value2);
        result = findViewById(R.id.res);
        operation = findViewById(R.id.operation);
        sum = findViewById(R.id.sum);
        sub = findViewById(R.id.sub);
        multi = findViewById(R.id.multi);
        div = findViewById(R.id.div);
        value1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (value1.getText().toString().equals("")) {
                    operation.setText("?");
                }
                result.setText("");
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
       value2.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

           }

           @Override
           public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
               if (value2.getText().toString().equals("")) {
                   operation.setText("?");
               }
               result.setText("");
           }

           @Override
           public void afterTextChanged(Editable editable) {

           }
       });
        sum.setOnClickListener(view -> {
            if (isEmpty()){
                    value1.setError("Required");
                    value2.setError("Required");
                }
            else if (value1.getText().toString().equals("")) value1.setError("Required");
            else if(value2.getText().toString().equals("")) value2.setError("Required");
            else{
                operation.setText("+");
                float x = Float.parseFloat(value1.getText().toString());
                float y = Float.parseFloat(value2.getText().toString());
                result.setText(String.valueOf(x + y));
            }
        });
        sub.setOnClickListener(view -> {
            if (isEmpty()){
                value1.setError("Required");
                value2.setError("Requireda");
            }
            else if (value1.getText().toString().equals("")) value1.setError("Required");
            else if(value2.getText().toString().equals("")) value2.setError("Required");
            else {
                operation.setText("-");
                float x = Float.parseFloat(value1.getText().toString());
                float y = Float.parseFloat(value2.getText().toString());
                result.setText(String.valueOf(x - y));
            }
        });
        multi.setOnClickListener(view -> {
            if (isEmpty()){
                value1.setError("Required");
                value2.setError("Required");
            }
            else if (value1.getText().toString().equals("")) value1.setError("Required");
            else if(value2.getText().toString().equals("")) value2.setError("Required");
            else {
                operation.setText("×");
                float x = Float.parseFloat(value1.getText().toString());
                float y = Float.parseFloat(value2.getText().toString());
                result.setText(String.valueOf(x * y));
            }
        });
        div.setOnClickListener(view -> {
            if (isEmpty()){
                value1.setError("Required");
                value2.setError("Required");
            }
            else if (value1.getText().toString().equals("")) value1.setError("Required");
            else if(value2.getText().toString().equals("")) value2.setError("Required");
            else {
                operation.setText("/");
                float x = Float.parseFloat(value1.getText().toString());
                float y = Float.parseFloat(value2.getText().toString());
                result.setText(String.valueOf(x / y));
            }
        });
    }
    private boolean isEmpty(){
        return value1.getText().toString().equals("")&&value2.getText().toString().equals("");
    }
}