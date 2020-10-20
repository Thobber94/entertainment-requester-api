package net.bergby.entertainmentrequesterapi.service.common

interface HttpRequesterService {
    fun getMovieFromMovieDbApi(movie: String)
}