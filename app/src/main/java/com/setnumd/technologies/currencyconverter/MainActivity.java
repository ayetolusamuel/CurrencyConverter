package com.setnumd.technologies.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private static final double NAIRA_CONVERSION_RATE = 360.50;
    private EditText amountToBeConverted;
private TextView resultTextView;
private Button convertButton;
private ImageView imageView;
private static final String TAG = MainActivity.class.getSimpleName();
    public void convertButtonClick(View view){
String amountValue = amountToBeConverted.getText().toString();
if (amountValue.length()!= 0){
    double amountValueInDouble  = Double.parseDouble(amountValue);
    double result = amountValueInDouble*NAIRA_CONVERSION_RATE;
    DecimalFormat df = new DecimalFormat("#.##");   //2dp format
    result = Double.valueOf(df.format(result));
    resultTextView.setText("₦"+String.valueOf(result));
   Toast.makeText(this, ""+"₦"+String.valueOf(result), Toast.LENGTH_SHORT).show();

}
else{
    Toast.makeText(MainActivity.this,"Enter amount to be converted to ₦",Toast.LENGTH_SHORT).show();
}


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        amountToBeConverted = findViewById(R.id.edt_amount);
        resultTextView = findViewById(R.id.resultTextView);
        convertButton = findViewById(R.id.convertButton);


    }
}
