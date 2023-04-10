package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {

    ListView listview;
    Button Addbutton;
    EditText GetValue;
    EditText GetValue1;
    EditText GetValue2;

    String[] ListElements = new String[] {};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = (ListView) findViewById(R.id.listView1);
        Addbutton = (Button) findViewById(R.id.button1);
        GetValue = (EditText) findViewById(R.id.editText);
        GetValue1 = (EditText) findViewById(R.id.editText1);
        GetValue2 = (EditText) findViewById(R.id.editText2);
        final List < String > ListElementsArrayList = new ArrayList < String >
                (Arrays.asList(ListElements));


        final ArrayAdapter < String > adapter = new ArrayAdapter < String >
                (MainActivity.this, android.R.layout.simple_list_item_1,
                        ListElementsArrayList);

        listview.setAdapter(adapter);

        Addbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ListElementsArrayList.add(GetValue.getText().toString());
                ListElementsArrayList.add(GetValue1.getText().toString());
                ListElementsArrayList.add(GetValue2.getText().toString());
                adapter.notifyDataSetChanged();
            }

        });
    }
}