package net.bergby.entertainmentrequesterapi.model.movie

import net.bergby.entertainmentrequesterapi.model.common.Status
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate

@Document(collection = "movie")
class Movie(
        @Id var id: String,
        var name: String,
        var theMovieDbId: String,
        var imdbId: String,
        var originalTitle: String,
        var releaseDate: LocalDate,
        var releaseStatus: String,
        var status: Status
)