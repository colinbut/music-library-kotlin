/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.musicfy

import org.assertj.core.api.Assertions.assertThat
import java.time.Year
import kotlin.test.Test

class AlbumTest {

    @Test
    fun `Retrieve list of albums should return list of albums in the system` () {
        val expectedAlbumList = listOf(
            Album("21", 2011, getAlbum21Tracks())
        )

        val albumList = getAlbums()

        assertThat(albumList).isEqualTo(expectedAlbumList)
    }

    private fun getAlbum21Tracks(): MutableList<Track> {
        return listOf(
                Track(1, "Rolling in the Deep",
                        listOf(Artist(1, "Adele", 2008)),
                        Year.of(2011))
        ).toMutableList()
    }

    private fun getAlbums(): Any {
        val adele21Album = Album("21", 2011, getAlbum21Tracks())

        val albumList : MutableList<Album> = ArrayList()
        albumList.add(adele21Album)

        return albumList
    }
}