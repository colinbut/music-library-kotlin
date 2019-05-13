/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.musicfy.repository

import com.mycompany.musicfy.model.Album
import com.mycompany.musicfy.model.Track

class AlbumRepositoryImpl(private val trackRepository: TrackRepository) : AlbumRepository {

    private val albums : MutableList<Album> = ArrayList()

    init {
        val trackList : MutableList<Track> = ArrayList()
        val track = trackRepository.findTrackByTrackName("Track Name")
        if (track != null) {
            trackList.add(track)
        }

        albums.add(Album("Album Name", 2009, trackList))
    }

    override fun getAlbumByName(name: String): Album {
        return albums.stream().filter { it.albumName == name }.findAny().get()
    }

    override fun getAlbumByNameAndAlbumYear(name: String, albumYear: Int): Album {
        return albums.stream()
                .filter { it.albumName == name }
                .filter { it.albumYear == albumYear }
                .findAny().get()
    }

    override fun createNewAlbum(album: Album) {
        albums.add(album)
    }


    override fun getAllAlbums(): List<Album> {
        return albums.toList()
    }

}