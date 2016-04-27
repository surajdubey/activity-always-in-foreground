package com.suraj.activityalwaysinforeground.util.log;

import android.util.Log;

import com.suraj.activityalwaysinforeground.util.config.Const;

/**
 * This class is used for printing output on Logcat
 */
public class L {

    /**
     * print debug message
     * @param logDebugMessage
     */
    public static void d(String logDebugMessage) {
        Log.d(Const.LOGCAT_KEY, logDebugMessage);
    }

    /**
     * print error message
     * @param logErrorMessage
     */
    public static void e(String logErrorMessage) {
        Log.e(Const.LOGCAT_KEY, logErrorMessage);
    }
}
