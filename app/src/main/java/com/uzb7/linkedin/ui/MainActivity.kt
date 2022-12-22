package com.uzb7.linkedin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.uzb7.linkedin.R
import com.uzb7.linkedin.adapter.PostAdapter
import com.uzb7.linkedin.model.Post

class MainActivity : AppCompatActivity() {
    lateinit var list: ArrayList<Post>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        list=loadList()
        val recyclerView=findViewById<RecyclerView>(R.id.rv_post)
        recyclerView.adapter=PostAdapter(list)
    }

    private fun loadList(): ArrayList<Post> {
        var myList=ArrayList<Post>()
        myList.add(Post(
            "https://carakoom.com/data/wall/787/6434237a_medium.jpg",
            true,
            "Mansurbek Madirimov",
            "Android developer",
            "fri",
            "My project",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSq7mE91Q11QO_xVFHPkcDO-LGydmcBpBmofQ&usqp=CAU.jpg"
        ))
        return myList
    }
}