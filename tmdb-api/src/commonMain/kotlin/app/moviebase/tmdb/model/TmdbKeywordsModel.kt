package app.moviebase.tmdb.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TmdbKeywordDetail(
    val adult: Boolean,
    @SerialName("backdrop_path") val backdropPath: String?,
    val id: Int,
    val name: String,
    @SerialName("original_language") val originalLanguage: String,
    @SerialName("original_name") val originalName: String,
    @SerialName("overview") val overview: String,
    @SerialName("poster_path") val posterPath: String?,
): TmdbSearchable
