package com.example.fenix.mydairy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;


import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.widget.TextView;

import java.util.ArrayList;


public class SuppliersActivity extends AppCompatActivity {

    AddSupplierActivity addSupplierActivity;

    Intent i = getIntent();
//    String f_name = i.getStringExtra("f_name");
//    String l_Name = i.getStringExtra("l_name");


    ArrayList<String> firstName = new ArrayList<>();
    ArrayList<String> lastName = new ArrayList<>();
    ArrayList<String> email = new ArrayList<>();
    ArrayList<String> phoneNumber = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suppliers);

        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView listview = (ListView) findViewById(R.id.suppliers_list_view);

        firstName.add("Joachim");
        firstName.add("Nicholas");
        firstName.add("Rooney");
        firstName.add("Bryant");
        firstName.add("James");
        firstName.add("Joan");
        firstName.add("Zoe");
        firstName.add("Cynthia");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SuppliersActivity.this, android.R.layout.simple_expandable_list_item_1, firstName);
        listview.setAdapter(adapter);

    }

    public void addSupplier(View view) {
        Intent addSupplierIntent = new Intent(SuppliersActivity.this, AddSupplierActivity.class);
        startActivity(addSupplierIntent);
    }

}
