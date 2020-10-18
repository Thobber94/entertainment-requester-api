package net.bergby.entertainmentrequesterapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "movie")
class Movie(
        @Id var id: String,
        var name: String,
        var theMovieDbId: String
)