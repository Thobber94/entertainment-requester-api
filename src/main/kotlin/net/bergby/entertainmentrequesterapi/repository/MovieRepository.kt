package net.bergby.entertainmentrequesterapi.repository

import net.bergby.entertainmentrequesterapi.model.Movie
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "movies", path = "movies")
interface MovieRepository: MongoRepository<Movie, String> {
    fun findByName(@Param("name") name: String): Movie
}