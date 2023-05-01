package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] listarr = {"This is list data 1.","This is list data 2","This is list data 3.","This is list data 4",
                        "This is list data 5"};
    String[] customlistarr = {"Person 1.","Person 2.","Person 3.","Person 4.","Person 5.","Person 6.","Person 7.","Person 8.","Person 9.","Person 10"};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listdata);

        //Bilt in array Adapter
        //ArrayAdapter data = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, listarr);
        //listView.setAdapter(data);

        //Custom array Adapter
        CustomAdapter ca = new CustomAdapter(this, R.layout.custom_adapter,customlistarr);
        listView.setAdapter(ca);

    }
}