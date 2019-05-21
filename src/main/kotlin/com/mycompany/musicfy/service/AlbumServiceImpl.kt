/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.musicfy.service

import com.mycompany.musicfy.model.Album
import com.mycompany.musicfy.repository.AlbumRepository
import java.util.*

class AlbumServiceImpl (private val albumRepository: AlbumRepository) : AlbumService {
    override fun deleteAlbum(albumId: UUID) {
        albumRepository.deleteAlbum(albumId)
    }

    override fun createAlbum(album: Album) {
        albumRepository.createNewAlbum(album)
    }

    override fun getAlbumByName(name: String) {
        albumRepository.getAlbumByName(name)
    }

    override fun getAlbumByYear(year: Int) {
        // TODO
    }

    override fun getAlbumByNameAndYear(name: String, year: Int) {
        albumRepository.getAlbumByNameAndAlbumYear(name, year)
    }

    override fun getAlbumList() : List<Album> {
        return albumRepository.getAllAlbums()
    }
}