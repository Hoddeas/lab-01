package com.example.petshop

class Sad(date: String): Mood(date) {
    override fun returnMood(): String {
        return "I am sad"
    }
}