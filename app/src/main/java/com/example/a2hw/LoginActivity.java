package com.example.a2hw;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private Button button;
    private EditText editText1, editText2;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
        button.setOnClickListener(v -> {
            if (!(editText1.getText().toString().equals(""))) {
                if (!(editText2.getText().toString().equals(""))) {
                    Toast.makeText(this, "Добро пожаловать!", Toast.LENGTH_SHORT).show();
                    button.setBackgroundResource(R.drawable.color2);
                } else {
                    button.setBackgroundResource(R.drawable.color);
                }
            } else {
                button.setBackgroundResource(R.drawable.color);
            }
        });textView.setOnClickListener(v -> {
            Toast.makeText(this, "Вы нажали не туда XD !!!",Toast.LENGTH_SHORT).show();
        });
    }


    public void init() {
        button = findViewById(R.id.btn);
        editText1 = findViewById(R.id.email);
        editText2 = findViewById(R.id.psw3);
        textView = findViewById(R.id.psw2);

    }
}