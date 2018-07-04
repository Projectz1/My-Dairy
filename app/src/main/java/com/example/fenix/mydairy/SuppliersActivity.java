package com.example.fenix.mydairy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SuppliersActivity extends AppCompatActivity {

    ArrayList<String> firstName = new ArrayList<>();
    ArrayList<String> lastName = new ArrayList<>();
    ArrayList<String> email = new ArrayList<>();
    ArrayList<String> phoneNumber = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suppliers);
        ListView listview = (ListView) findViewById(R.id.suppliers_list_view);

        firstName.add("Joachim");
        firstName.add("Nicholas");
        firstName.add("Rooney");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SuppliersActivity.this, android.R.layout.simple_expandable_list_item_1, firstName);
        listview.setAdapter(adapter);


    }


    public void addSupplier(View view) {
        Intent addSupplierIntent = new Intent(SuppliersActivity.this, AddSupplierActivity.class);
        startActivity(addSupplierIntent);
    }
}
