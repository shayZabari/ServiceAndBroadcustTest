package com.example.shay_z.serviceandbroadcusttest;

import android.os.AsyncTask;
import android.util.Log;

/**
 * Created by shay_z on 21/06/2017.
 */

class MyBackground extends AsyncTask<String, String, String> {

    @Override
    protected String doInBackground(String... params) {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(2000);
                Log.d("123", "i= "+i);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;

    }
}
