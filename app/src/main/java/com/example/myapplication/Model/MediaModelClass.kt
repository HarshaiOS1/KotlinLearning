package com.example.myapplication.Model
import com.beust.klaxon.*

private val klaxon = Klaxon()

    data class Welcome (
        val media: Media
    ) {
        public fun toJson() = klaxon.toJsonString(this)

        companion object {
            public fun fromJson(json: String) = klaxon.parse<Welcome>(json)
        }
    }

    data class Media (
        val logo: Logo
    )

    data class Logo (
        val category: Boolean,
        val content: String
    )
