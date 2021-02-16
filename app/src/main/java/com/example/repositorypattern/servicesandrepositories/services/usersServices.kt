package com.example.repositorypattern.servicesandrepositories.services

import android.widget.Toast
import com.example.repositorypattern.servicesandrepositories.repositories.UsersRepository
import java.util.ArrayList

class usersServices:UsersRepository {
    override fun getAllStudents(): List<String> {
       val a:List<String> = listOf("dsad","dsad")
        return a
    }

    override fun newStudent(name: String, phoneNumber: String): String {
        return "i got"+name+phoneNumber
    }
}