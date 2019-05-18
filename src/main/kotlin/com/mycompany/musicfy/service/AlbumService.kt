/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.musicfy.service

import com.mycompany.musicfy.model.Album

interface AlbumService {
    fun getAlbumList() : List<Album>
    fun createAlbum(album: Album)
    fun getAlbumByName(name: String)
    fun getAlbumByYear(year: Int)
    fun getAlbumByNameAndYear(name: String, year: Int)
}