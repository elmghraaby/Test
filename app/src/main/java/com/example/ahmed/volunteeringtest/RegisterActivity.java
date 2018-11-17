package com.example.ahmed.volunteeringtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;


public class RegisterActivity extends AppCompatActivity {

    private EditText regname , regemail, regpassword;
    private Button btn_join;
    private TextView link_already_have_an_account;
    private ProgressBar loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        regname = findViewById(R.id.name);
        regemail = findViewById(R.id.regisetemail);
        regpassword = findViewById(R.id.regisetpassword);
        btn_join = findViewById(R.id.btn_join);
        link_already_have_an_account = findViewById(R.id.link_already_have_an_account);

        btn_join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mName = regname.getText().toString().trim();
                String mEmail = regemail.getText().toString().trim();
                String mPass = regpassword.getText().toString().trim();
                startActivity(new Intent(RegisterActivity.this, HomeActivity.class));

            }

        });

        link_already_have_an_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this, MainActivity.class));
            }
        });


    }
}
