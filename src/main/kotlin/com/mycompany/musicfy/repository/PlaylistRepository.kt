/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.musicfy.repository

import com.mycompany.musicfy.model.Playlist

interface PlaylistRepository {
    fun addNewPlaylist(playlist: Playlist)
    fun getPlaylistByName(name: String) : Playlist?
}