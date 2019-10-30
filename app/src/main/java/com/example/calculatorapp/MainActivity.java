package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ผูกตัวแปร java กับ xml
        final EditText numberEditText1 = findViewById(R.id.edt1);
        final EditText numberEditText2 = findViewById(R.id.edt2);
        Button addButton = findViewById(R.id.btnAdd);
        Button button2 = findViewById(R.id.btn2);
        Button button3 = findViewById(R.id.btn3);
        Button button4 = findViewById(R.id.btn4);
        final TextView resultTextView = findViewById(R.id.tvResult);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(numberEditText1.getText().toString());
                int num2 = Integer.parseInt(numberEditText2.getText().toString());
                int result = num1 + num2;
                resultTextView.setText(result+"");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(numberEditText1.getText().toString());
                int num2 = Integer.parseInt(numberEditText2.getText().toString());
                int result = num1 - num2;
                resultTextView.setText(result+"");

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(numberEditText1.getText().toString());
                int num2 = Integer.parseInt(numberEditText2.getText().toString());
                int result = num1 * num2;
                resultTextView.setText(result+"");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(numberEditText1.getText().toString());
                int num2 = Integer.parseInt(numberEditText2.getText().toString());
                int result = num1 / num2;
                resultTextView.setText(result+"");
            }
        });

    }//end oncreate()Method
}//end class

