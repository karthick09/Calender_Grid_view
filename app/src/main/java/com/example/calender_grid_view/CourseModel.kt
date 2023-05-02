package com.example.calender_grid_view

class CourseModel(var course_name: String) {

    fun getCourseName(): String {
        return course_name
    }

    fun setCourseName(course_name: String) {
        this.course_name = course_name
    }
}