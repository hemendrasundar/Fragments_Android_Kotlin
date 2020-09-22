package com.hemendra.fragmentstest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_calls.view.*

class CallsFragment : Fragment()
{

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var v = inflater.inflate(R.layout.fragment_calls,container,false)

        var calls_array = arrayOf("Prasanth","Anurag","Priti","Naresh","Mahesh")
        var arrayadapter = ArrayAdapter<String>(context!!,android.R.layout.simple_list_item_1,calls_array)
        v.lv.adapter = arrayadapter
        return v
    }
}