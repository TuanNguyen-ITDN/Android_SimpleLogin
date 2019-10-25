package com.example.androidsimplelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn_Register = (Button) findViewById(R.id.btn_Register);
        btn_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        final Button btn_Login = (Button) findViewById(R.id.btn_Login);
        btn_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginSuccess();
            }
        });
    }

    public void loginSuccess() {
        final EditText edit_text_email = (EditText) findViewById(R.id.edit_email);
        email = edit_text_email.getText().toString();
        final EditText edit_text_password = (EditText) findViewById(R.id.edit_password);
        password = edit_text_password.getText().toString();
        Toast.makeText(this, email + "Login success", Toast.LENGTH_SHORT).show();

        if (email.equals("admin") && password.equals("admin")) {
            Toast.makeText(this, "Login success", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Email or Password is incorrect", Toast.LENGTH_SHORT).show();
        }
    }
}