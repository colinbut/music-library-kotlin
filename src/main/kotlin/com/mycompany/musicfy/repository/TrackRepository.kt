/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.musicfy.repository

import com.mycompany.musicfy.Track

interface TrackRepository {
    fun findTrackByTrackName(trackName: String) : Track?
}