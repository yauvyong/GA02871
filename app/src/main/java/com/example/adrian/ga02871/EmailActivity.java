package com.example.adrian.ga02871;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EmailActivity extends AppCompatActivity {

    Button btn_send;
    EditText et_email, et_subject, et_massage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        btn_send = (Button)findViewById(R.id.email_btn_send);

        et_email = (EditText)findViewById(R.id.email_et_recipient_email);
        et_subject = (EditText)findViewById(R.id.email_et_subject);
        et_massage = (EditText)findViewById(R.id.email_et_massage);

        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent emailIntent = new Intent(Intent.ACTION_SEND);

                emailIntent.setData(Uri.parse("mailto:"));
                emailIntent.setType("text/plain");

                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{
                        et_email.getText().toString()
                });

                emailIntent.putExtra(Intent.EXTRA_SUBJECT, et_subject.getText().toString()
                );

                emailIntent.putExtra(Intent.EXTRA_TEXT, "Hi Good Morning" + et_massage.getText().toString()
                );

                startActivity(emailIntent);

            }
        });
    }
}
