package com.example.myapplicationlinerlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    static final String SAVED_INT_KEY = "saved_key";
    TextView result;

    FAAdapter adapter;
    Button seven;
    Button eight;
    Button nine;
    Button divide;
    Button four;
    Button five;
    Button six;
    Button multiply;
    Button one;
    Button two;
    Button three;
    Button minus;
    Button dote;
    Button zero;
    Button equal;
    Button plus;
    Button percent;
    Button clear;


    double num1;
    double num2;

    String operation; // это +, -, *, /


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        divide = findViewById(R.id.divide);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        multiply = findViewById(R.id.multiply);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        plus = findViewById(R.id.plus);
        dote = findViewById(R.id.dote);
        zero = findViewById(R.id.zero);
        equal = findViewById(R.id.equal);
        minus = findViewById(R.id.minus);
        percent = findViewById(R.id.percent);
        clear = findViewById(R.id.clear);


        View.OnClickListener ocl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = findViewById(R.id.result);

                switch (v.getId()) {
                    case R.id.seven:
                        result.append(seven.getText().toString());
                        break;
                    case R.id.eight:
                        result.append(eight.getText().toString());
                        break;
                    case R.id.nine:
                        result.append(nine.getText().toString());
                        break;
                    case R.id.divide:
                        num1 = Double.parseDouble(result.getText().toString());
                        result.setText("");
                        operation = "/";
                        break;
                    case R.id.four:
                        result.append(four.getText().toString());
                        break;
                    case R.id.five:
                        result.append(five.getText().toString());
                        break;
                    case R.id.six:
                        result.append(six.getText().toString());
                        break;
                    case R.id.multiply:
                        num1 = Double.parseDouble(result.getText().toString());
                        result.setText("");
                        operation = "*";
                        break;
                    case R.id.one:
                        result.append(one.getText().toString());
                        break;
                    case R.id.two:
                        result.append(two.getText().toString());
                        break;
                    case R.id.three:
                        result.append(three.getText().toString());
                        break;
                    case R.id.minus:
                        num1 = Double.parseDouble(result.getText().toString());
                        result.setText("");
                        operation = "-";
                        break;
                    case R.id.dote:
                        result.append(dote.getText().toString());
                        break;
                    case R.id.zero:
                        result.append(zero.getText().toString());
                        break;
                    case R.id.equal:
                        num2 = Double.parseDouble(result.getText().toString());
                        if (operation == "+") {
                            result.setText(Double.toString(num1 + num2));
                            String res = String.valueOf(num1 + num2);
                        } else if (operation == "-") {
                            result.setText(Double.toString(num1 - num2));
                            String res = String.valueOf(num1 + num2);
                        } else if (operation == "*") {
                            result.setText(Double.toString(num1 * num2));
                            String res = String.valueOf(num1 + num2);
                        } else if (operation == "/") {
                            result.setText((Double.toString(num1 / num2)));
                            String res = String.valueOf(num1 + num2);
                            finish();
                        } else if (operation == "%") {
                            result.setText(Double.toString((num1 / 100) * num2));
                            String res = String.valueOf(num1 + num2);
                        }

                    if (result != null) {
                        Intent intent1 = new Intent();
                        intent1.putExtra("key32", result.getText().toString());
                        setResult(RESULT_OK, intent1);
                        finish();
                    }
                    break;
                    case R.id.plus:
                        num1 = Double.parseDouble(result.getText().toString());
                        result.setText("");
                        operation = "+";
                        break;
                    case R.id.percent:
                        num1 = Double.parseDouble(result.getText().toString());
                        result.setText("");
                        operation = "%";


                    case R.id.clear:
                        result.append(clear.getText().toString());
                        result.setText("");
                        break;
                }

            }
        };

        seven.setOnClickListener(ocl);
        eight.setOnClickListener(ocl);
        nine.setOnClickListener(ocl);
        divide.setOnClickListener(ocl);
        four.setOnClickListener(ocl);
        five.setOnClickListener(ocl);
        six.setOnClickListener(ocl);
        multiply.setOnClickListener(ocl);
        one.setOnClickListener(ocl);
        two.setOnClickListener(ocl);
        three.setOnClickListener(ocl);
        minus.setOnClickListener(ocl);
        dote.setOnClickListener(ocl);
        zero.setOnClickListener(ocl);
        equal.setOnClickListener(ocl);
        plus.setOnClickListener(ocl);
        percent.setOnClickListener(ocl);
        clear.setOnClickListener(ocl);
    }


//    @Override
//    public void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//        Log.d("ololo", "onSaveInstanceState");
//        outState.putDouble(SAVED_INT_KEY, Double.parseDouble(result.getText().toString()));
//    }
//
//    @Override
//    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//        double savedDouble = savedInstanceState.getDouble(SAVED_INT_KEY);
//        Log.d("ololo", savedDouble + " - onRestoreInstanceState");
//        result.append(Double.toString(savedDouble));
//    }

}
