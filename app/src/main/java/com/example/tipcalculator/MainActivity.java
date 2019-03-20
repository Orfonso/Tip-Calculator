package com.example.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Creates variables for all XML values
    Button tenPercent;
    Button fifteenPercent;
    Button twentyPercent;
    Button twentyfivePercent;
    EditText billText;
    TextView totalText;

    //Variables
    Double money = 0.0;
    Double totalAmount = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Sets variables to values
        tenPercent = (Button) findViewById(R.id.tenPercent);
        fifteenPercent = (Button) findViewById(R.id.fifteenPercent);
        twentyPercent = (Button) findViewById(R.id.twentyPercent);
        twentyfivePercent = (Button) findViewById(R.id.twentyfivePercent);
        billText = (EditText) findViewById(R.id.billAmount);
        totalText = (TextView) findViewById(R.id.total);

        //Creates action for buttons when pressed
        tenPercent.setOnClickListener(this);
        fifteenPercent.setOnClickListener(this);
        twentyPercent.setOnClickListener(this);
        twentyfivePercent.setOnClickListener(this);
    }

    /*
        Method that does the calculation for the tip
        Sets money equal to the number the user sets at the top of the screen
        Determines which button was pressed and then does the calculation according to
        that tip amount.
     */
    @Override
    public void onClick(View view)  {
        money = Double.parseDouble(billText.getText().toString());

        if (view.getId() == tenPercent.getId()) {
            totalAmount = Math.round((money * 1.1) * 100.0) / 100.0;
            totalText.setText("$" + totalAmount);
        }

        if (view.getId() == fifteenPercent.getId()) {
            totalAmount = Math.round((money * 1.15) * 100.0) / 100.0;
            totalText.setText("$" + totalAmount);
        }

        if (view.getId() == twentyPercent.getId()) {
            totalAmount = Math.round((money * 1.2) * 100.0) / 100.0;
            totalText.setText("$" + totalAmount);
        }

        if (view.getId() == twentyfivePercent.getId()) {
            totalAmount = Math.round((money * 1.25) * 100.0) / 100.0;
            totalText.setText("$" + totalAmount);
        }
    }
}
