/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.musicfy.repository

import com.mycompany.musicfy.model.Album

interface AlbumRepository {
    fun getAllAlbums() : List<Album>
    fun getAlbumByName(name: String) : Album
    fun getAlbumByNameAndAlbumYear(name: String, albumYear: Int) : Album
    fun createNewAlbum(album: Album)
}