package net.bergby.entertainmentrequesterapi.service.series

import net.bergby.entertainmentrequesterapi.model.series.Series
import net.bergby.entertainmentrequesterapi.model.common.Status

interface SeriesService {
    fun addSeries(series: Series): Series
    fun getSeries(name: String): Series
    fun getSeriesByStatus(status: Status): List<Series>
}