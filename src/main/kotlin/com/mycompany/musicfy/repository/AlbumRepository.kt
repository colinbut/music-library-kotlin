/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.musicfy.repository

import com.mycompany.musicfy.model.Album
import java.util.*

interface AlbumRepository {
    fun getAllAlbums() : List<Album>
    fun getAlbumByName(name: String) : Album
    fun getAlbumByNameAndAlbumYear(name: String, albumYear: Int) : Album
    fun createNewAlbum(album: Album)
    fun deleteAlbum(albumId: UUID)
}