package com.refr.www;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class selectReviewer extends Activity {

    ListView lv;
    String [] names={"Gene Eburwin",
            "Dee Giacobbe",
            "Bram Blazhe",
            "Sylvester Trace",
            "Jamaar Antonín",
            "Gene Eburwin",
            "Dee Giacobbe",
            "Bram Blazhe",
            "Sylvester Trace",
            "Jamaar Antonín",
            "Gene Eburwin",
            "Dee Giacobbe",
            "Bram Blazhe",
            "Sylvester Trace",
            "Jamaar Antonín"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_reviewer);
        ListView lv = (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> reviewerAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1 ,names);
        lv.setAdapter(reviewerAdapter);
    }
}
