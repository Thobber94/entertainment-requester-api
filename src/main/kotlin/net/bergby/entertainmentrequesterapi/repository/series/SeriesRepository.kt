package net.bergby.entertainmentrequesterapi.repository.series

import net.bergby.entertainmentrequesterapi.model.common.Status
import net.bergby.entertainmentrequesterapi.model.series.Series
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "series", path = "series")
interface SeriesRepository: MongoRepository<Series, String> {
    fun findByName(@Param("name") name: String): Series
    fun findByStatus(@Param("status") status: Status): List<Series>
}