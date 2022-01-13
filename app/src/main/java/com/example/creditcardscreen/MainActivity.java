package com.example.creditcardscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView inputExercise;
    EditText cardNumber;
    EditText expiry;
    EditText securityCode;
    EditText firstName;
    EditText lastName;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputExercise = (TextView) findViewById(R.id.textView7);
        cardNumber = (EditText) findViewById(R.id.editText);
        expiry = (EditText) findViewById(R.id.editText2);
        securityCode = (EditText) findViewById(R.id.editText3);
        firstName = (EditText) findViewById(R.id.editText4);
        lastName = (EditText) findViewById(R.id.editText5);
        submit = (Button) findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cardNumber.getText().toString().equals(" ")|| expiry.getText().toString().equals(" ")||
                        securityCode.getText().toString().equals(" ")||
                        firstName.getText().toString().equals(" ")|| lastName.getText().toString().equals(" ")) {
                    Toast.makeText(MainActivity.this, "Please Enter fields", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(cardNumber.getText().toString().matches("[0-9]{16}") &&
                            expiry.getText().toString().matches("(0[1-9]|1[0-2])\\/?([0-9]{2})")
                            && securityCode.getText().toString().matches("[0-9]{3}") &&
                            firstName.getText().toString().matches("[a-zA-Z]") &&
                            lastName.getText().toString().matches("[a-zA-Z]")) {
                        Toast.makeText(MainActivity.this, "Payment Successful", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}