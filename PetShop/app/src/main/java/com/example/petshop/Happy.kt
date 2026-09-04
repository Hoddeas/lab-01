package com.example.petshop

class Happy(date: String): Mood(date) {
    override fun returnMood(): String {
        return "I am happy"
    }
}