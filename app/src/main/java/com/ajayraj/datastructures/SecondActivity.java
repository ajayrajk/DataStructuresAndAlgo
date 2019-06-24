package com.ajayraj.datastructures;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * apttrix.com
 * Created by Ajay Raj on 20,June,2019
 */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Log.e("test","second activity onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.e("test","second activity onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.e("test","second activity onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.e("test","second activity onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.e("test","second activity onStop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.e("test","second activity onRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.e("test","second activity onDestroy");

    }
}

