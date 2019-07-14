/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.musicfy.model

class User {
    val songs: MutableList<Track> = ArrayList()
    val playlists : List<Playlist> = ArrayList()

    fun addSong(track: Track) {
        songs.add(track)
    }
}