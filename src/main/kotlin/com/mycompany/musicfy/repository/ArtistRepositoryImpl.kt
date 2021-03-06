/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.musicfy.repository

import com.mycompany.musicfy.model.Artist

class ArtistRepositoryImpl : ArtistRepository {

    private val artists : MutableList<Artist> = ArrayList()

    init {
        artists.add(Artist(1, "Adele", 2003))
    }

    override fun getAllArtists(): List<Artist> {
        return artists.toList()
    }

    override fun findArtistByArtistName(artistName: String): Artist? {
        return artists.find { it.artistName == artistName }
    }

    override fun addNewArtist(artist: Artist) {
        artists.add(artist)
    }

    override fun removeArtist(artist: Artist) {
        artists.remove(artist)
    }

}