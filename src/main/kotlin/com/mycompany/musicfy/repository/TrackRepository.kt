/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.musicfy.repository

import com.mycompany.musicfy.model.Track
import java.time.Year

interface TrackRepository {
    fun findTrackByTrackName(trackName: String) : Track?
    fun findTrackByTrackNameAndTrackYear(trackName: String, trackYear: Year): Track?
    fun insertTrack(track: Track)
    fun removeTrack(track: Track)
}