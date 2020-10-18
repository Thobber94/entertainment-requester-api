package net.bergby.entertainmentrequesterapi.service

import net.bergby.entertainmentrequesterapi.model.Movie
import net.bergby.entertainmentrequesterapi.repository.MovieRepository
import org.springframework.stereotype.Service

@Service
class MovieServiceImpl(
        val movieRepository: MovieRepository
) : MovieService {
    override fun getMovie(name: String): Movie {
        val movie = movieRepository.findByName(name)
        return movie
    }
}