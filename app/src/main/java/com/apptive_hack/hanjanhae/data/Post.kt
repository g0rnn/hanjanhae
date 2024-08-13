package com.apptive_hack.hanjanhae.data

data class Post(
    val img: String,
    val description: String,
    val likes: Int,
    val comments: Int,
    val date: String,
    var liked: Boolean = false,
)