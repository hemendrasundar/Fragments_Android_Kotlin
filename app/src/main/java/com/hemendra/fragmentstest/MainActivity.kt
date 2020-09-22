package com.hemendra.fragmentstest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fmanager = supportFragmentManager
        var fTx = fmanager.beginTransaction()
        fTx.add(R.id.frag_container,HomeFragment())
        fTx.commit()

        btn_home.setOnClickListener(this)
        btn_calls.setOnClickListener(this)
        btn_chats.setOnClickListener(this)


    }

    override fun onClick(view: View?) {
        var fmanager = supportFragmentManager
        var fTx = fmanager.beginTransaction()
        when(view?.id)
        {
            R.id.btn_home ->  fTx.replace(R.id.frag_container,HomeFragment())
            R.id.btn_chats -> fTx.replace(R.id.frag_container,ChatsFragment())
            R.id.btn_calls -> fTx.replace(R.id.frag_container,CallsFragment())

        }

        fTx.commit()
    }


}