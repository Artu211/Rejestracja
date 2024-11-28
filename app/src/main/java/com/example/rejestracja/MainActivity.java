package com.example.rejestracja;


import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;


public class MainActivity extends AppCompatActivity {

    private TextView alert;
    private EditText email;
    private EditText pass;
    private EditText pass2;
    private Button wyslij;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alert = findViewById(R.id.alert);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        pass2 = findViewById(R.id.pass2);
        wyslij = findViewById(R.id.wyslij);

        wyslij.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String email1 = email.getText().toString().trim();
                String pass1_value = pass.getText().toString().trim();
                String pass2_value = pass2.getText().toString().trim();
                if(!android.util.Patterns.EMAIL_ADDRESS.matcher(email1).matches()){
                    alert.setText("Nieprawidłowy adres email");
                }
                else if(!pass1_value.equals(pass2_value)){
                    alert.setText("Hasła się różnią");
                }
                else{
                    alert.setText("Witaj " + email1);
                }
            }
        });


    }


