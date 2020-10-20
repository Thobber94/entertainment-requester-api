package net.bergby.entertainmentrequesterapi.controller.series

import net.bergby.entertainmentrequesterapi.model.common.Status
import net.bergby.entertainmentrequesterapi.model.series.Series
import net.bergby.entertainmentrequesterapi.service.series.SeriesService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("v1/api/series")
class SeriesController(
        val seriesService: SeriesService
) {

    @PostMapping("/add")
    fun postSeries(@RequestBody series: Series) =
            seriesService.addSeries(series)

    @GetMapping("/{name}")
    fun findSeriesByName(@PathVariable(value = "name") name: String) =
            seriesService.getSeries(name = name)

    @GetMapping("/status/{status}")
    fun findSeriesBySonarrStatus(@PathVariable(value = "status") status: Status) =
            seriesService.getSeriesByStatus(status = status)
}