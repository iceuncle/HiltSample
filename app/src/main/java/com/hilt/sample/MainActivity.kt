package com.hilt.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hilt.sample.data.User
import com.hilt.sample.hilt.AnalyticsService
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var user: User

    @Inject
    lateinit var service: AnalyticsService


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        textView.text = "${user.name}的心情是${user.mood}"
        user.mood = "很复杂"

        service.analyticsMethods()

    }

}