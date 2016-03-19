package com.deitel.hicham.textfield;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.SearchView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    String[] Country_Names;
    ListView lv;
    SearchView sv;
    String[] countries = {"Paris","London"};
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.country);
        Country_Names = getResources().getStringArray(R.array.country_names);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Country_Names);
        autoCompleteTextView.setAdapter(adapter);



                        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                if(position==0)
                                {
                                    Intent intent = new Intent(MainActivity.this, next.class);
                                    startActivity(intent);
                                }
                                else
                                {
                                    Intent zab = new Intent(MainActivity.this, nextnext.class);
                                    startActivity(zab);
                                }

                                }
                        });
    }
}







