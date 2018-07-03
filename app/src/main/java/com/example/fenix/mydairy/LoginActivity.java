package com.example.fenix.mydairy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    /**
     * This method is executed when the login button is clicked
     */
    public void login(View v) {

        EditText loginEmail = (EditText) findViewById(R.id.login_input_email);
        EditText loginPassword = (EditText) findViewById(R.id.login_password);

        /**
         * This section ensures that the fields are filled before logging in
         */
        if (loginEmail.getText().toString().isEmpty()) {
            loginEmail.setError("Email field is required");
        } else if (loginPassword.getText().toString().isEmpty()) {
            loginPassword.setError("Password field is required");
        } else {
            Intent intent1 = new Intent(LoginActivity.this, Main2Activity.class);
            startActivity(intent1);
        }

    }

    /**
     * This method is executed when the create account button is clicked
     */
    public void signUp(View view) {
        EditText firstName = (EditText) findViewById(R.id.first_name_input);
        EditText lastName = (EditText) findViewById(R.id.last_name_input);
        EditText signUpEmail = (EditText) findViewById(R.id.signup_input_email);
        EditText sihnUpPhoneNumber = (EditText) findViewById(R.id.signup_phone);
        EditText signUpPassword = (EditText) findViewById(R.id.signup_password);
        EditText confirmPassword = (EditText) findViewById(R.id.confirm_password);

        /**
         * This section ensures that the fields are filled before logging in
         */
        if (firstName.getText().toString().isEmpty()) {
            firstName.setError("First name is required");
        } else if (lastName.getText().toString().isEmpty()) {
            lastName.setError("Last name is required");
        } else if (signUpEmail.getText().toString().isEmpty()) {
            signUpEmail.setError("Your email is required");
        } else if (sihnUpPhoneNumber.getText().toString().isEmpty()) {
            sihnUpPhoneNumber.setError("Phone number is required");
        } else if (signUpPassword.getText().toString().isEmpty()) {
            signUpPassword.setError("Password is required");
        } else if (confirmPassword.getText().toString().isEmpty()) {
            confirmPassword.setError(" Confirm Password is required");
        } else {
            Intent intent2 = new Intent(LoginActivity.this, Main2Activity.class);
            startActivity(intent2);
        }

    }
}
