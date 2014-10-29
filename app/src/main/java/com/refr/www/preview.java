package com.refr.www;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
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
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;
        exv.setMinimumWidth(width);
        exv.setIndicatorBoundsRelative(width-100, 0);

        exv.setBackgroundResource(R.drawable.card);
    }



}
