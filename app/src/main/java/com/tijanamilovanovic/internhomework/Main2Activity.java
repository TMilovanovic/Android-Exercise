package com.tijanamilovanovic.internhomework;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle b = getIntent().getExtras();
        ArrayAdapter<String> myNames = new ArrayAdapter<String>(this, R.layout.content_main2);
        if(b!=null){
            ArrayList<String> names = (ArrayList<String>)b.getStringArrayList("array_list");
            System.out.println(names);
        }

    }

}
