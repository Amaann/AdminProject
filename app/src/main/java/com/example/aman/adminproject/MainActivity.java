package com.example.aman.adminproject;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button loginButton;
    Context context;
    EditText email;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//
//        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
//        getSupportActionBar().hide(); // hide the title bar
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

        setContentView(R.layout.activity_login);


        context = this;
        initView();
    }


    private void initView() {


        loginButton = findViewById(R.id.Id_Login_button);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (login()) {
                    Toast.makeText(context, "Login Successful", Toast.LENGTH_SHORT).show();
                    nextActivity();
                }
            }
        });
    }

    private boolean login() {
        //TODO verify email password and login
        return true;
    }

    private void nextActivity() {
        Intent intent = new Intent(context, HomeActivity.class);
        startActivity(intent);
        finish();
    }


}
