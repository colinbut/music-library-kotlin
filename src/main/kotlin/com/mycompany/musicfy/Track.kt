/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.musicfy

import java.time.Year

data class Track (val trackId: Int, val trackName: String, val singers: List<Artist>, val trackYear: Year)