package com.example.calculatorproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    /** Called when the user clicks the Add button */
    public void NegButton(View view) {
        EditText FirstNumber = (EditText) findViewById(R.id.FirstNumber);
        double number1 = Double.parseDouble(FirstNumber.getText().toString());
        double number4 = number1 * -1;
        FirstNumber.setText(Double.toString(number4));
    }

    public void NegButton2(View view) {
        EditText SecondNumber = (EditText) findViewById(R.id.SecondNumber);
        double number2 = Double.parseDouble(SecondNumber.getText().toString());
        double number5 = number2 * -1;
        SecondNumber.setText(Double.toString(number5));
    }

    public void Add(View view) {
        EditText FirstNumber = (EditText) findViewById(R.id.FirstNumber);
        double number1 = Double.parseDouble(FirstNumber.getText().toString());
        EditText SecondNumber = (EditText) findViewById(R.id.SecondNumber);
        double number2 = Float.parseFloat(SecondNumber.getText().toString());
        double number3 = number1 + number2;
        TextView Result = (TextView) findViewById(R.id.Result);
        Result.setText(Double.toString(number3));
    }

    public void Divide(View view) {
        EditText FirstNumber = (EditText) findViewById(R.id.FirstNumber);
        double number1 = Double.parseDouble(FirstNumber.getText().toString());
        EditText SecondNumber = (EditText) findViewById(R.id.SecondNumber);
        double number2 = Double.parseDouble(SecondNumber.getText().toString());
        double number3 = number1 / number2;
        TextView Result = (TextView) findViewById(R.id.Result);
        Result.setText(Double.toString(number3));
    }

    public void Minus(View view) {
        EditText FirstNumber = (EditText) findViewById(R.id.FirstNumber);
        double number1 = Double.parseDouble(FirstNumber.getText().toString());
        EditText SecondNumber = (EditText) findViewById(R.id.SecondNumber);
        double number2 = Double.parseDouble(SecondNumber.getText().toString());
        double number3 = number1 - number2;
        TextView Result = (TextView) findViewById(R.id.Result);
        Result.setText(Double.toString(number3));
    }

    public void Multiple(View view) {
        // Intent intent = new Intent(this, AddtheNumber.class);
        EditText FirstNumber = (EditText) findViewById(R.id.FirstNumber);
        double number1 = Double.parseDouble(FirstNumber.getText().toString());
        EditText SecondNumber = (EditText) findViewById(R.id.SecondNumber);
        double number2 = Double.parseDouble(SecondNumber.getText().toString());
        double number3 = number1 * number2;
        TextView Result = (TextView) findViewById(R.id.Result);
        Result.setText(Double.toString(number3));
    }
}
