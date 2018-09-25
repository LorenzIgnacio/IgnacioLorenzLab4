package com.ignacio.lorenz;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d( "4ITG","OnCreate has executed...");
    }

    @Override
    protected void  onStart() {
        super.onStart();
        Log.d( "Start","OnStart has executed...");
    }

    @Override
    protected void  onResume() {
        super.onResume();
        Log.d( "Resume","OnResume has executed...");
    }

    @Override
    protected void  onPause() {
        super.onPause();
        Log.d( "Pause","OnPause has executed...");
    }

    @Override
    protected void  onStop() {
        super.onStop();
        Log.d( "Stop","OnStop has executed...");
    }

    @Override
    protected void  onRestart() {
        super.onRestart();
        Log.d( "Restart","OnRestart has executed...");
    }

    @Override
    protected void  onDestroy() {
        super.onDestroy();
        Log.d( "Destroy","OnDestroy has executed...");
    }

    public void showToast(View v){
        Toast.makeText(this, "4ITG is the best...", Toast.LENGTH_LONG).show();
    }

    public void showSnack(View v){
        Snackbar.make(v, "Prelims is fast approaching....", Snackbar.LENGTH_LONG).show();
    }
}
