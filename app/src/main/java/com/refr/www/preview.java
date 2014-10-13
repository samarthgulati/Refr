package com.refr.www;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class preview extends Activity {
    ExpandableListView exv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        exv=(ExpandableListView)findViewById(R.id.elv1);
        exv.setAdapter(new previewAdapter(this));
    }



}
