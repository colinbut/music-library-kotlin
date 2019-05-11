/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.musicfy.service

import com.mycompany.musicfy.Album
import com.mycompany.musicfy.repository.AlbumRepository

class AlbumServiceImpl (private val albumRepository: AlbumRepository) : AlbumService {

    override fun getAlbumList() : List<Album> {
        return albumRepository.getAllAlbums()
    }
}