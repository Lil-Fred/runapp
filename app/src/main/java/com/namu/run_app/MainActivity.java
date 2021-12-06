package com.namu.run_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.renderscript.ScriptGroup;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private boolean mShouldUnbind;
    private BackgroundService mBoundService;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startService(new Intent(this, BackgroundService.class));
    }
}