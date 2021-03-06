package com.diah.goapps.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.diah.goapps.R;

public class LoginActivity extends AppCompatActivity {
    Button login;
    EditText username, password;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_relative);
        login = findViewById(R.id.btnLogin);
        username = findViewById(R.id.etUsername);
        password = findViewById(R.id.etPassword);

        login.setOnClickListener(v -> {
            if (password.getText().toString().toUpperCase().equals("TEST1")) {
                login_sukses();
            } else {
                Toast.makeText(getApplicationContext(), "Salah Password", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void login_sukses() {
        String user_login = username.getText().toString();
        Intent i = new Intent(this, MainActivity.class);
        //Kirim usernamenya ke tampilan utama
        i.putExtra("USERNAME", user_login);

        startActivity(i);
    }
}
