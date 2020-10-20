package net.bergby.entertainmentrequesterapi.repository.movie

import net.bergby.entertainmentrequesterapi.model.common.Status
import net.bergby.entertainmentrequesterapi.model.movie.Movie
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "movies", path = "movies")
interface MovieRepository: MongoRepository<Movie, String> {
    fun findByName(@Param("name") name: String): Movie
    fun findByStatus(@Param("status") status: Status): List<Movie>
}