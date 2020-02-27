package com.lamorado.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lamorado.myrecyclerview.R.layout.activity_main
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_next.*
import org.w3c.dom.Text

class NextActivity : AppCompatActivity() {

    companion object {
        val NAME = "name"
        val DETAIL = "detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        val tvName: TextView = findViewById(R.id.name_tv)

        val name = intent.getStringExtra(NAME)
        val detail = intent.getStringExtra(DETAIL)

        val text = "Name : $name \nDetail : $detail"
        tvName.text = text

    }
}
