package com.example.workmanagerapp

import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager.Companion.getInstance

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_list_item)

        // Create a one-time request
        val workRequest =
            OneTimeWorkRequest.Builder(LogWorker::class.java)
                .build()

        // Execute the task
        getInstance(this)
            .enqueue(workRequest)
    }
}