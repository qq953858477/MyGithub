package com.zzy.zzy.mygithub;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Log.i("zzy", "hahs!!!!!!!!:");
        Log.i("zzy 你好!","");
    }
}
