package net.bergby.entertainmentrequesterapi.controller.movie

import net.bergby.entertainmentrequesterapi.model.common.Status
import net.bergby.entertainmentrequesterapi.model.movie.Movie
import net.bergby.entertainmentrequesterapi.service.movie.MovieService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("v1/api/movie")
class MovieController(
        val movieService: MovieService
) {

    @PostMapping("/add")
    fun postMovie(@RequestBody movie: Movie) =
            movieService.addMovie(movie)

    @GetMapping("/{name}")
    fun findMovieByName(@PathVariable(value = "name") name: String) =
            movieService.getMovie(name = name)

    @GetMapping("/status/{status}")
    fun findMovieByStatus(@PathVariable(value = "status") status: Status) =
            movieService.getMovieByStatus(status = status)
}