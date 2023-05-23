import java.time.LocalDate

data class Train(
        val model: String,
        val manufacturer: String,
        val type: String,
        val dateOfCommencementOfOperation: LocalDate,
        val numOfSeats: Int,
        val weight: Int,
        val withConditioning: Boolean,
        val way: Way
) : Comparable<Train> {
    override fun compareTo(train: Train): Int {
        val compare = model.compareTo(train.model)
        return if (compare != 0) compare else way.compareTo(train.way)
    }
}