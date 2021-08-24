package com.example.listviewbase.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.listviewbase.Model.Data
import com.example.listviewbase.R
import org.w3c.dom.Text


class CustomListAdapter(var context : Context, var items: List<Data>) : BaseAdapter() {

    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(position: Int): Any {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {


        val viewHolder:ViewHolder
        var convertView = convertView
            if(convertView == null){
            convertView = LayoutInflater.from(parent?.context).inflate(R.layout.row_item, parent, false)
       // val text1 = convertView.findViewById<TextView>(R.id.textView)
        //val text2 = convertView.findViewById<TextView>(R.id.textView2)
                viewHolder = ViewHolder(convertView)
                convertView.tag = viewHolder}
        else{
            viewHolder = convertView.tag as ViewHolder
        }

        val data = getItem(position) as Data

        viewHolder.t1.text = data.text1
        viewHolder.t2.setText(data.text2)

        return convertView!!
    }
}

    private class ViewHolder(view: View){
     var t1: TextView = view.findViewById(R.id.textView)
        var t2  = view.findViewById<TextView>(R.id.textView2)
    }