package com.example.fenix.mydairy;

import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class SuppliersActivity extends AppCompatActivity {

    //AddSupplierActivity addSupplierActivity;

    Intent i = getIntent();

    //String some = i.getStringExtra("f_name");
//    String l_Name = i.getStringExtra("l_name");

    ArrayList<String> firstName = new ArrayList<>();
    ArrayList<String> lastName = new ArrayList<>();
    ArrayList<String> email = new ArrayList<>();
    ArrayList<String> phoneNumber = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suppliers);

        //Add back button
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
        //firstName.add(some);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SuppliersActivity.this, android.R.layout.simple_expandable_list_item_1, firstName);
        listview.setAdapter(adapter);

    }
//        ListView.OnItemClickListener(new AdapterView.OnItemClickListener()){
//
//        @Override
//
//                public void onItemClick(AdapterView<?> adapterView, View view,int i Log 1){
//                String text = listview.getItemAtPosition(i).toString();
//                Toast.makeText(SuppliersActivity.this,""+ text,Toast.LENGTH_LONG).show();
//        }
//    }
//
//        @Override
//
//            public boolean onCreateOptinsMenu(Menu menu){
//
//            MenuInflater inflater = getMenuInflater();
//            inflater.inflate(R.menu.menu,menu);
//
//            MenuItem searchItem  = menu.findItem(R.id.item_search);
//
//            SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchView);
//
//            searchView.setOnQueryTextListener();
//        }


    public void addSupplier(View view) {
        Intent addSupplierIntent = new Intent(SuppliersActivity.this, AddSupplierActivity.class);
        startActivity(addSupplierIntent);
    }
}
