package com.example.adrian.ga02871;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_login, btn_sign_up;
    EditText et_user_name, et_password;
    ImageButton img_btn_start_email_activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_login = (Button)findViewById(R.id.main_btn_login);
        btn_sign_up = (Button)findViewById(R.id.main_btn_sign_up);

        et_user_name = (EditText)findViewById(R.id.main_et_user_name);
        et_password = (EditText)findViewById(R.id.main_et_password);

        img_btn_start_email_activity = (ImageButton)findViewById(R.id.main_img_btn_email_activity);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Login Clicked!", Toast.LENGTH_LONG).show();
            }
        });

        btn_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Password = " + et_password.getText(), Toast.LENGTH_LONG).show();
            }
        });

        img_btn_start_email_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, EmailActivity.class);
                startActivity(myIntent);
            }
        });

    }
}
