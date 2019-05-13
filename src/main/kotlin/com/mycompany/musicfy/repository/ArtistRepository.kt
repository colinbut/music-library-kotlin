/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.musicfy.repository

import com.mycompany.musicfy.model.Artist

interface ArtistRepository {
    fun findArtistByArtistName(artistName: String) : Artist?
    fun getAllArtists() : List<Artist>
    fun addNewArtist(artist: Artist)
    fun removeArtist(artist: Artist)
}