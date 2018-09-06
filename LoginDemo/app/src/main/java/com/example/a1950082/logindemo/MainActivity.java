package com.example.a1950082.logindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//video for tutorial: https://www.youtube.com/watch?v=lF5m4o_CuNg&t=317s
    private EditText Name;
    private EditText Password;
    private Button Login;
    private TextView Info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText) findViewById(R.id.etName);
        Password = (EditText) findViewById(R.id.etName);
        Info = (TextView) findViewById(R.id.tvInfo);
        Login = (Button) findViewById(R.id.btnLogin);
    }

    private void validate(String userName, String userPassword) {
        if ((userName == "Admin") && (userPassword == "1234")) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        }
    }
}
