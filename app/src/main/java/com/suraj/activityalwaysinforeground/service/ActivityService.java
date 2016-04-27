package com.suraj.activityalwaysinforeground.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.suraj.activityalwaysinforeground.activity.MainActivity;
import com.suraj.activityalwaysinforeground.util.log.L;

/**
 * This Service gets called from MainActivity
 * It is responsible for starting MainActivity again
 */
public class ActivityService extends Service {

    private Context context = this;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    /**
     * called when Service is created for first time
     * It will only be called once for initialization
     */
    @Override
    public void onCreate() {
        L.d("onCreate is called");
        super.onCreate();
    }

    /**
     * called when startService() is called
     *
     * @param intent
     * @param flags
     * @param startId
     * @return
     */
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        L.d("onStartCommand called");
        startMainActivity();

        /**
         * We want this service to continue running until it is explicitly
         * stopped, so return sticky.
         */
        return Service.START_STICKY;
    }

    /**
     * starts Main Activity
     */
    private void startMainActivity() {
        Intent intent = new Intent(context, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
