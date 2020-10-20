package net.bergby.entertainmentrequesterapi.service.movie

import net.bergby.entertainmentrequesterapi.model.common.Status
import net.bergby.entertainmentrequesterapi.model.movie.Movie
import net.bergby.entertainmentrequesterapi.repository.movie.MovieRepository
import net.bergby.entertainmentrequesterapi.service.common.HttpRequesterService
import org.springframework.stereotype.Service

@Service
class MovieServiceImpl(
        val movieRepository: MovieRepository,
        val httpRequesterService: HttpRequesterService
) : MovieService {
    override fun addMovie(movie: Movie): Movie {
        return movieRepository.save(movie)
    }

    override fun getMovie(name: String): Movie {
        httpRequesterService.getMovieFromMovieDbApi(name)
        return movieRepository.findByName(name)
    }

    override fun getMovieByStatus(status: Status): List<Movie> {
        return movieRepository.findByStatus(status)
    }
}