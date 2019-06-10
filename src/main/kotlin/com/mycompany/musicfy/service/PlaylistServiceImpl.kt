/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.musicfy.service

import com.mycompany.musicfy.model.Playlist
import com.mycompany.musicfy.repository.PlaylistRepository
import com.mycompany.musicfy.repository.PlaylistRepositoryImpl

class PlaylistServiceImpl : PlaylistService {

    private val playlistRepository: PlaylistRepository

    init {
        playlistRepository = PlaylistRepositoryImpl()
    }

    override fun createNewPlaylist(playlist: Playlist) {
        playlistRepository.addNewPlaylist(playlist)
    }

    override fun getPlaylist(name: String) : Playlist {
        return playlistRepository.getPlaylistByName(name)!!
    }
}