package com.example.calender_grid_view

import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var coursesGV: GridView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        coursesGV = findViewById(R.id.GridView)
        val courseModelArrayList = ArrayList<CourseModel?>()
        generateDays(courseModelArrayList)
//        courseModelArrayList.add(CourseModel("DSA"))
//        courseModelArrayList.add(CourseModel("JAVA"))
//        courseModelArrayList.add(CourseModel("C++"))
//        courseModelArrayList.add(CourseModel("Python"))
//        courseModelArrayList.add(CourseModel("Javascript"))
//        courseModelArrayList.add(CourseModel("DSA"))
        val adapter = CourseGVAdapter(this, courseModelArrayList)
        coursesGV.adapter = adapter
    }
    private fun generateDays(data :ArrayList<CourseModel?>){
        for(i in 1..30) {
            data.add(CourseModel(i.toString()))
        }
    }
}