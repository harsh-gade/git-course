package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    EditText edusername, edpassword;
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edusername = findViewById(R.id.editTextloginUsername);
        edpassword = findViewById(R.id.editTextloginPassword);
        btn = findViewById(R.id.loginbutton);
        tv = findViewById(R.id.textviewloginnewuser);

    }
}