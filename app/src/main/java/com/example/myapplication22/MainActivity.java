package com.example.myapplication22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etEmail,etPass;
    Button btnLogin,view;
    TextView tvReg;
    DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmail = findViewById(R.id.etEmail);
        etPass = findViewById(R.id.etPass);
        btnLogin = findViewById(R.id.btnLogin);
        tvReg = findViewById(R.id.tvReg);
        view = findViewById(R.id.btnView);
        db = new DBHelper(this);




        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email, pass;
                email = etEmail.getText().toString();
                pass = etPass.getText().toString();



                Intent i =new Intent(MainActivity.this,webb.class);
                startActivity(i);
                finish();

                if (email.equals("")) {
                    Toast.makeText(MainActivity.this, "Email Required",Toast.LENGTH_SHORT).show();

                } else if (pass.equals("")) {

                    Toast.makeText(MainActivity.this, "Password Required",Toast.LENGTH_SHORT).show();
                }
                else {
                    //authentication
                }
            }


        });
        tvReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this,register.class);
                startActivity(i);
                finish();


            }
        });

    }


}
