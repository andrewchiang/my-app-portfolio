package com.example.android.myappportfolio;

import android.app.Application;
import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    /**
     * calls Spotify Streamer app.
     * @param view
     */
    public void invokeSpotifyStreamer(View view){
        display_a_toast("Spotify Streamer");
    }

    /**
     * calls Scores app.
     * @param view
     */
    public void invokeScoresApp(View view){
        display_a_toast("Scores");
    }

    /**
     * calls Library app.
     * @param view
     */
    public void invokeLibraryApp(View view){
        display_a_toast("Library");
    }

    /**
     * calls Build it Bigger app.
     * @param view
     */
    public void invokeBuildItBigger(View view){
        display_a_toast("Build It Bigger");
    }

    /**
     * calls XYZ Reader app.
     * @param view
     */
    public void invokeXyzReader(View view){
        display_a_toast("XYZ Reader");
    }

    /**
     * calls Capstone: My Own App.
     * @param view
     */
    public void invokeCapstoneApp(View view){
        display_a_toast("Capstone");
    }

    /**
     * shows a message in a small popup.
     * @param appName
     */
    public void display_a_toast(String appName){
        String msg = "This button will launch my " + appName + " app!";
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, msg, duration).show();
    }
}
