package com.nativeintegrationrn;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityCollection {
    public static List<Activity> activityList = new ArrayList<>();

    public static void addActivity(Activity activity) {
        activityList.add(activity);
    }

    public static void removeActivity(Activity activity) {
        activityList.remove(activity);
    }
    // 随时随地退出程序
    public static void finishAll() {
        for (Activity activity: activityList
             ) {
            if (!activity.isFinishing()) {
                activity.finish();
            }

        }
        activityList.clear();
        android.os.Process.killProcess(android.os.Process.myPid());
    }
}
