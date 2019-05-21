/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.musicfy.repository

import com.mycompany.musicfy.model.Album
import com.mycompany.musicfy.model.Track
import java.util.*
import kotlin.collections.HashMap

class AlbumRepositoryImpl(trackRepository: TrackRepository) : AlbumRepository {

    private val albums : MutableMap<UUID, Album> = HashMap()

    init {
        val trackList : MutableList<Track> = ArrayList()
        val track = trackRepository.findTrackByTrackName("Track Name")
        if (track != null) {
            trackList.add(track)
        }

        albums[UUID.randomUUID()] = Album("Album Name", 2009, trackList)
    }

    override fun getAlbumByName(name: String): Album {
        return albums.values.stream().filter { it.albumName == name }.findAny().get()
    }

    override fun getAlbumByNameAndAlbumYear(name: String, albumYear: Int): Album {
        return albums.values.stream()
                .filter { it.albumName == name }
                .filter { it.albumYear == albumYear }
                .findAny().get()
    }

    override fun createNewAlbum(album: Album) {
        albums[UUID.randomUUID()] = album
    }


    override fun getAllAlbums(): List<Album> {
        return albums.values.toList()
    }

    override fun deleteAlbum(albumId: UUID) {
        albums.remove(albumId)
    }
}