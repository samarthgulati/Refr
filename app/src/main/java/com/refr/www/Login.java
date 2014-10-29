package com.refr.www;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class Login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void logIn(View view) {
        Intent launchResumeList = new Intent(getApplicationContext(), ResumeList.class);
        startActivity(launchResumeList);
    }

    public void signUp(View view) {
        //Intent signUp = new Intent(getApplicationContext(), SignUp.class);
        //startActivity(signUp);
    }
}
