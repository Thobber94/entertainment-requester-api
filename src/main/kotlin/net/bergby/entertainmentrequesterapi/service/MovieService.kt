package net.bergby.entertainmentrequesterapi.service

import net.bergby.entertainmentrequesterapi.model.Movie

interface MovieService {
    fun getMovie(name: String): Movie
}