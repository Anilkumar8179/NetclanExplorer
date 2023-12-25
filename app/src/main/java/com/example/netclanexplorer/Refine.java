package com.example.netclanexplorer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class Refine extends AppCompatActivity {

    String[] items={"Available|Hey Let Us Connect","Away|Stay Discrete And Watch","Busy|Bo Not Disturb|Will Catch Up Later","SOS|Emergency!Need Assistance! Help"};


    AutoCompleteTextView autoCompleteTextView;
    ArrayAdapter<String>arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refine);

        autoCompleteTextView=findViewById(R.id.Auto_Complete);
        arrayAdapter= new ArrayAdapter<String>(this,R.layout.itemselect,items);

        autoCompleteTextView.setAdapter(arrayAdapter);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String items= parent.getItemAtPosition(position).toString();
                Toast.makeText(Refine.this, "Item"+items, Toast.LENGTH_SHORT).show();
            }
        });
    }
}