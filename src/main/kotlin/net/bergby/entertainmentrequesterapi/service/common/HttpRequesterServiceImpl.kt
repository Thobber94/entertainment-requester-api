package net.bergby.entertainmentrequesterapi.service.common

import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.Request
import org.springframework.stereotype.Service
import java.io.IOException

@Service
class HttpRequesterServiceImpl : HttpRequesterService {

    private val client = OkHttpClient()

    private val movieDbUrl = "https://api.themoviedb.org/3/search/movie"
    private val apiKey = ""
    private val language = "en-US"

    override fun getMovieFromMovieDbApi(movie: String) {
        val url = "$movieDbUrl?api_key=$apiKey&$language&query=$movie&page=1&include_adult=false"
        val request = Request.Builder()
                .url(url)
                .build()
        client.newCall(request).execute().use { response ->
            if (!response.isSuccessful) throw IOException("Unexpected code $response")
            println("Response body: ${response.body!!.string()}")
            val gson = Gson()
            val movieDb = gson.fromJson(response.body!!.string(), MovieDb::class.java)
            println(movieDb)
        }
    }
}

data class MovieDb(
        var page: Int,
        var total_results: Int
)