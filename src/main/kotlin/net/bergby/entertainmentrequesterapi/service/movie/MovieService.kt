package net.bergby.entertainmentrequesterapi.service.movie

import net.bergby.entertainmentrequesterapi.model.common.Status
import net.bergby.entertainmentrequesterapi.model.movie.Movie

interface MovieService {
    fun addMovie(movie: Movie): Movie
    fun getMovie(name: String): Movie
    fun getMovieByStatus(status: Status): List<Movie>
}