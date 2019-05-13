/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.musicfy.repository

import com.mycompany.musicfy.model.Playlist

class PlaylistRepositoryImpl : PlaylistRepository {

    private val playlists : MutableList<Playlist> = ArrayList()

    init {
        playlists.add(Playlist(1, "New Playlist"))
    }

    override fun getPlaylistByName(name: String) : Playlist? {
        return playlists.find { it.name == name }
    }

    override fun addNewPlaylist(playlist: Playlist) {
        playlists.add(playlist)
    }
}