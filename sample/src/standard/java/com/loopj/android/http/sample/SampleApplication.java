package com.loopj.android.http.sample;

import android.annotation.TargetApi;
import android.app.Application;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;

public class SampleApplication extends Application {

    private static final String LOG_TAG = "SampleApplication";

    @Override
    public void onCreate() {
        setStrictMode();
        super.onCreate();
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    private void setStrictMode() {
        Log.d(LOG_TAG, "Enabling StrictMode policy over my application");
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                .detectAll()
                .penaltyLog()
                .penaltyDeath()
                .build());
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder()
                .detectAll()
                .penaltyLog()
                .build());
    }
}
