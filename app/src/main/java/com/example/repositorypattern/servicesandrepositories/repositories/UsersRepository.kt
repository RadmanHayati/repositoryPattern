package com.example.repositorypattern.servicesandrepositories.repositories

interface UsersRepository {
    fun getAllStudents():List<String>
    fun newStudent(name:String,phoneNumber:String):String

}