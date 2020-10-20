package net.bergby.entertainmentrequesterapi.service.series

import net.bergby.entertainmentrequesterapi.model.series.Series
import net.bergby.entertainmentrequesterapi.model.common.Status
import net.bergby.entertainmentrequesterapi.repository.series.SeriesRepository
import org.springframework.stereotype.Service

@Service
class SeriesServiceImpl(
        val seriesRepository: SeriesRepository
) : SeriesService {
    override fun addSeries(series: Series): Series {
        return seriesRepository.save(series)
    }

    override fun getSeries(name: String): Series {
        return seriesRepository.findByName(name)
    }

    override fun getSeriesByStatus(status: Status): List<Series> {
        return seriesRepository.findByStatus(status)
    }
}