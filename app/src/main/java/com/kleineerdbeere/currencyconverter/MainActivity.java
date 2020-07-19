package com.kleineerdbeere.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static double zlotyKurs = 4.48;

    //TODO accept only 9 digits in input field.
    //TODO accept only 2 decimal in input for currency.

    public void clickFunction(View view){

        EditText euroInput = (EditText) findViewById(R.id.editTextNumberDecimal);

        String amountInEuro = euroInput.getText().toString();
        double amountInEuroDouble = Double.parseDouble(amountInEuro);

        double amountInZlotyDouble = amountInEuroDouble * zlotyKurs;
        String amountInZlotyString = String.format("%.2f", amountInZlotyDouble);

        Log.i("Info", "Entered value = " + amountInZlotyDouble); //euroInput.getText().toString());


        Toast.makeText(this, "Are " + amountInZlotyString + " Zloty", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}