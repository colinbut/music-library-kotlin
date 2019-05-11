/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.musicfy.repository

import com.mycompany.musicfy.Track
import java.time.Year

class TrackRepositoryImpl(private val artistRepository: ArtistRepository) : TrackRepository {

    private val tracks : MutableList<Track> = ArrayList()

    init {
        tracks.add(
                Track(1, "Track Name",
                        listOf(artistRepository.findArtistByArtistName("Adele")!!), Year.of(2000)))
    }

    override fun findTrackByTrackName(trackName: String): Track? {
        return tracks.find { it.trackName == trackName }
    }
}
