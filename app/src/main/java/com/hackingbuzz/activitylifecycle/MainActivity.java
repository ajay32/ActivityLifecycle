package com.hackingbuzz.activitylifecycle;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    // for landscape....map example

    TextView view;

    //ii took TAG so that i dont have to write string in every Log function again n again
    // This is the activity life cycle of  (ActivityLifeCycle Project)

    public static final String TAG = "ActivityLifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = (TextView) findViewById(R.id.textView2);

        Log.i(TAG," onCreate() Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart() Called");
        view.setText("My name is AJ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume() Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause() Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop() Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy() called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart() called");
    }
}
