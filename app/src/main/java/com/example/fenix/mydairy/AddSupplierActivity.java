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
    }

    public void addSupplier(View view) {

        EditText firstName = (EditText) findViewById(R.id.first_name_input);
        EditText lastName = (EditText) findViewById(R.id.last_name_input);
        EditText phoneNumber = (EditText) findViewById(R.id.supplier_phone);


        if ((firstName.getText().toString().trim().equals(""))) {
            Toast.makeText(getApplicationContext(), "First name field is empty", Toast.LENGTH_SHORT).show();
        } else if ((lastName.getText().toString().trim().equals(""))) {
            Toast.makeText(getApplicationContext(), "Last name field is empty", Toast.LENGTH_SHORT).show();
        } else if ((phoneNumber.getText().toString().trim().equals(""))) {
            Toast.makeText(getApplicationContext(), "Phone number field is empty", Toast.LENGTH_SHORT).show();
        } else {
            Intent i = new Intent(getApplicationContext(), SuppliersActivity.class);
            startActivity(i);

        }
    }
}
