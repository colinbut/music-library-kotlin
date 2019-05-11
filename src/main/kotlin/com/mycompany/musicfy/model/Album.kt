/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.musicfy.model

data class Album(val albumName: String, val albumYear: Int, val tracks: MutableList<Track> = ArrayList()) {

    fun addTracks(track: Track) {
        tracks.add(track)
    }
}