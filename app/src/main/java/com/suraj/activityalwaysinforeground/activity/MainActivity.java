package com.suraj.activityalwaysinforeground.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.suraj.activityalwaysinforeground.R;
import com.suraj.activityalwaysinforeground.service.ActivityService;
import com.suraj.activityalwaysinforeground.util.log.L;

/**
 * This Activity is entry point for application
 */
public class MainActivity extends AppCompatActivity {

    // Context for this Activity
    private Context context = this;

    /**
     * called when this Activity is initialized
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * called when Activity is finishing
     * or gets destroyed by the system
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        L.d("onDestroy called");
        startActivityService();
    }

    /**
     * called when Activity is no longer visible to user
     * onDestroy() may be called after this
     */
    @Override
    protected void onStop() {
        super.onStop();
        L.d("onStop called");
        startActivityService();
    }

    /**
     * starts activity service which runs in background
     */
    private void startActivityService() {
        Intent intent = new Intent(context, ActivityService.class);
        startService(intent);
    }

}
