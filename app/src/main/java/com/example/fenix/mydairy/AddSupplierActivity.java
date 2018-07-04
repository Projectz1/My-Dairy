package com.example.fenix.mydairy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.function.Supplier;

public class AddSupplierActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_supplier);

        //Add back button
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void addSupplier(View view) {

        EditText firstName = (EditText) findViewById(R.id.first_name_input);
        EditText lastName = (EditText) findViewById(R.id.last_name_input);
        EditText email = (EditText) findViewById(R.id.supplier_email);
        EditText phoneNumber = (EditText) findViewById(R.id.supplier_phone);

        if ((firstName.getText().toString().trim().equals(""))) {
            firstName.setError("First name is required");
        } else if ((lastName.getText().toString().trim().equals(""))) {
            lastName.setError("PLast name is required");
        } else if ((phoneNumber.getText().toString().trim().equals(""))) {
            phoneNumber.setError("Phone number is required");
        } else if (phoneNumber.getText().length() < 10 || phoneNumber.getText().length() > 10) {
            phoneNumber.setError("Phone number must be ten characters long");
        } else {
            Intent i = new Intent(getApplicationContext(), SuppliersActivity.class);
            i.putExtra("f_name", firstName.getText().toString());
            i.putExtra("l_name", lastName.getText().toString());
            i.putExtra("email", email.getText().toString());
            i.putExtra("phone", phoneNumber.getText().toString());
            startActivity(i);

        }
    }
}
