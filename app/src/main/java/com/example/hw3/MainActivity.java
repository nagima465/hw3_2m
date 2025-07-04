package com.example.hw3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Integer firstOperand;
    private Integer secondOperand;
    private Integer result;

    private Boolean isOperationClick;
    private String operation;

    private Button  buttonActivity;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.screen_zero);
        buttonActivity = findViewById(R.id.click);

        buttonActivity.setOnClickListener(v->{
            Intent intent = new Intent ( MainActivity.this,MainActivity2.class);
            intent.putExtra("result", result);
            startActivity(intent);
        });
    }



    public void OnNumberClick(View view) {
        buttonActivity.setVisibility(View.GONE);
        if (view.getId() == R.id.screen) {
            textView.setText("0");
        } else {
            String text = ((MaterialButton) view).getText().toString();
            if (textView.getText().toString().equals("0") || isOperationClick) {
                textView.setText(text);
            } else {
                textView.append(text);
            }
        }
        isOperationClick = false;
    }

    public void OnOperationClick(View view) {
        if (view.getId() == R.id.plus) {
            firstOperand = Integer.valueOf(textView.getText().toString());
            operation = "+";
        } else if (view.getId() == R.id.delenie) {
            firstOperand = Integer.valueOf(textView.getText().toString());
            operation = "/";
        } else if (view.getId() == R.id.minys) {
            firstOperand = Integer.valueOf(textView.getText().toString());
            operation = "-";
        } else if (view.getId() == R.id.multiplication) {
            firstOperand = Integer.valueOf(textView.getText().toString());
            operation = "*";
        } else if (view.getId() == R.id.equals) {
            secondOperand = Integer.valueOf(textView.getText().toString());
            if (operation.equals("+")) {
                result = firstOperand + secondOperand;
                textView.setText(result.toString());
            } else if (operation.equals("-")) {
                result = firstOperand - secondOperand;
                textView.setText(result.toString());
            } else if (operation.equals("*")) {
                result = firstOperand * secondOperand;
                textView.setText(result.toString());
            } else if (operation.equals("/")) {
                if (secondOperand == 0) {
                    textView.setText("Error");
                } else {
                    result = firstOperand / secondOperand;
                }
            }
            textView.setText(result.toString());
        }
        isOperationClick = true;
        buttonActivity.setVisibility(View.VISIBLE);
    }
}
