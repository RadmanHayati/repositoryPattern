package com.example.repositorypattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.repositorypattern.servicesandrepositories.repositories.UsersRepository
import com.example.repositorypattern.servicesandrepositories.services.usersServices

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    var a:UsersRepository?=null
        a=usersServices()
        Toast.makeText(this, a.newStudent("sb","01234"), Toast.LENGTH_SHORT).show()

    }
}