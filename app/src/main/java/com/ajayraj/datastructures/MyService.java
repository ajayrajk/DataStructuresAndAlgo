package com.ajayraj.datastructures;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.JobIntentService;

/**
 * apttrix.com
 * Created by Ajay Raj on 11,June,2019
 */

public class MyService extends JobIntentService {

    @Override
    public void onCreate() {
        super.onCreate();
    }



    @Override
    protected void onHandleWork(@NonNull Intent intent) {

    }
}
