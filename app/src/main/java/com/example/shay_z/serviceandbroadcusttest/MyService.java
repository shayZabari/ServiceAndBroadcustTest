package com.example.shay_z.serviceandbroadcusttest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by shay_z on 21/06/2017.
 */

public class MyService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("123", "before");
        new MyBackground().execute();
        Log.d("123", "after");
        return START_STICKY;
    }
}
