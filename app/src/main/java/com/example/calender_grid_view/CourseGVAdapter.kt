package com.example.calender_grid_view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView


class CourseGVAdapter(context: Context, courseModelArrayList: ArrayList<CourseModel?>?) :
    ArrayAdapter<CourseModel?>(context, 0, courseModelArrayList!!) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var listitemView = convertView
        if (listitemView == null) {

            listitemView = LayoutInflater.from(context).inflate(R.layout.card_item, parent, false)
        }

        val courseModel: CourseModel? = getItem(position)
        val courseTV = listitemView!!.findViewById<TextView>(R.id.idTVCourse)

        courseTV.setText(courseModel?.getCourseName())
        return listitemView
    }
}