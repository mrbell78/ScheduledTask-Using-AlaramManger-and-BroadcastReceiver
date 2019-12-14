package com.babuland.alrmmanager_broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.os.Vibrator;
import android.util.Log;

public class Mytask extends BroadcastReceiver {
    private static final String TAG = "Mytask";
    @Override
    public void onReceive(final Context context, Intent intent) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0;i<10;i++){
                    SystemClock.sleep(100);
                    Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
                    vibrator.vibrate(100);
                    Log.d(TAG, "run: ------------------------"+i);
                }
            }
        }).start();
    }
}
