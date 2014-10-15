package com.refr.www;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;


public class Login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void logIn(View view) {
        //Intent logIn = new Intent(getApplicationContext(), ResumeList.class);
        //startActivity(logIn);
    }

    public void signUp(View view) {
        //Intent signUp = new Intent(getApplicationContext(), SignUp.class);
        //startActivity(signUp);
    }
}
