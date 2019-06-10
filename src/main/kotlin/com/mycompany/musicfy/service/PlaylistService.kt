/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.musicfy.service

import com.mycompany.musicfy.model.Playlist

interface PlaylistService {
    fun createNewPlaylist(playlist: Playlist)
    fun getPlaylist(name: String) : Playlist
}