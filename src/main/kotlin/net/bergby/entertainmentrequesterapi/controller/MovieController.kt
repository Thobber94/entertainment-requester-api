package net.bergby.entertainmentrequesterapi.controller

import net.bergby.entertainmentrequesterapi.service.MovieService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("v1/api/movie")
class MovieController(
        val movieService: MovieService
) {

    @GetMapping("/{name}")
    fun findMovieByName(@PathVariable(value = "name") name: String) =
            movieService.getMovie(name = name)
}