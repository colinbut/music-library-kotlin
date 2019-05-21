/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.musicfy.service

import com.mycompany.musicfy.model.Artist

interface ArtistService {
    fun retrieveAllArtists() : List<Artist>
    fun addNewArtist(artist: Artist)
    fun removeArtist(artist: Artist)
    fun getArtistByArtistName(artistName: String)
}