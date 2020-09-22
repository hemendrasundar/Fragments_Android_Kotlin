package com.hemendra.fragmentstest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_chat.view.*

class ChatsFragment : Fragment()
{

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var v = inflater.inflate(R.layout.fragment_chat,container,false)

        v.btn.setOnClickListener {
            Toast.makeText(activity,"clciked",Toast.LENGTH_LONG).show()
        }
        return v
    }
}