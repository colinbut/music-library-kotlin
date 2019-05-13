/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.musicfy.service

import com.mycompany.musicfy.model.Track
import java.time.Year

interface TrackService {
    fun addNewTrack(track: Track)
    fun getTrack(name: String, year: Year) : Track
    fun deleteTrack(track: Track)
}