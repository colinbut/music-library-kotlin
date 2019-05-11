/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.musicfy.repository

import com.mycompany.musicfy.Album
import com.mycompany.musicfy.Track

class AlbumRepositoryImpl(private val trackRepository: TrackRepository) : AlbumRepository {
    private val albums : MutableList<Album> = ArrayList()

    init {
        val trackList : MutableList<Track> = ArrayList()
        val track = trackRepository.findTrackByTrackName("Track Name")
        if (track != null) {
            trackList.add(track)
        }

        albums.add(Album("Album Name", 2009, trackList))
    }

}