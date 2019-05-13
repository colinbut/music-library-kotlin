/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.musicfy.repository

import com.mycompany.musicfy.model.Track
import java.time.Year

class TrackRepositoryImpl(artistRepository: ArtistRepository) : TrackRepository {

    private val tracks : MutableList<Track> = ArrayList()

    init {
        tracks.add(
                Track(1, "Track Name",
                        listOf(artistRepository.findArtistByArtistName("Adele")!!), Year.of(2000)))
    }

    override fun findTrackByTrackName(trackName: String): Track? {
        return tracks.find { it.trackName == trackName }
    }

    override fun findTrackByTrackNameAndTrackYear(trackName: String, trackYear: Year) : Track? {
        return tracks.find { it.trackName == trackName && it.trackYear == trackYear }
    }

    override fun insertTrack(track: Track) {
        tracks.add(track)
    }

    override fun removeTrack(track: Track) {
        tracks.remove(track)
    }

}
