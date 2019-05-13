/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.musicfy.service

import com.mycompany.musicfy.model.Track
import com.mycompany.musicfy.repository.TrackRepository
import java.time.Year
import java.util.*

class TrackServiceImpl(private val trackRepository: TrackRepository) : TrackService {

    override fun addNewTrack(track: Track) {
        trackRepository.insertTrack(track)
    }

    override fun getTrack(name: String, year: Year) : Track {
        val track = trackRepository.findTrackByTrackNameAndTrackYear(name, year)
        Objects.requireNonNull(track)
        return track!!
    }

    override fun deleteTrack(track: Track) {
        trackRepository.removeTrack(track)
    }
}