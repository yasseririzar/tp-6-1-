
package com.example.workmanagerapp;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class LogWorker extends Worker {

    public LogWorker(@NonNull Context context,
                     @NonNull WorkerParameters params) {
        super(context, params);
    }

    @NonNull
    @Override
    public Result doWork() {

        Log.d("LogWorker", "Bonjour depuis WorkManager !");

        return Result.success();
    }
}
