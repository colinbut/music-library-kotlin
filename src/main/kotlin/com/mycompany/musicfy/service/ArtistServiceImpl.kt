/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.musicfy.service

import com.mycompany.musicfy.model.Artist
import com.mycompany.musicfy.repository.ArtistRepository

class ArtistServiceImpl (private val artistRepository: ArtistRepository) : ArtistService {

    override fun retrieveAllArtists(): List<Artist> {
        return artistRepository.getAllArtists()
    }

    override fun addNewArtist(artist: Artist) {
        artistRepository.addNewArtist(artist)
    }

    override fun removeArtist(artist: Artist) {
        artistRepository.removeArtist(artist)
    }

    override fun getArtistByArtistName(artistName: String) {
        artistRepository.findArtistByArtistName(artistName)
    }

}