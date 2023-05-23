import java.time.LocalDate

data class Way(
        val startPoint: String,
        val destination: String,
        val type: String,
        val dateOfDeparture: LocalDate,
        val roadLength: Int,
        val ticketPrice: Double,
        val circular: Boolean
) : Comparable<Way> {
    override fun compareTo(way: Way): Int {
        val compare = startPoint.compareTo(way.startPoint)
        return if (compare != 0) compare else startPoint.compareTo(way.startPoint) + destination.compareTo(way.destination)
    }
}