package com.refr.www;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;


public class ResumeList extends Activity {
    ListView rlv;
    String [] resumes={"Gene Eburwin",
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
        setContentView(R.layout.activity_resume_list);
    }



    public void previewResume(View view) {
        Intent launchPreviewResume = new Intent(getApplicationContext(), preview.class);
        startActivity(launchPreviewResume);
    }



}
