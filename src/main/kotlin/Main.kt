import org.springframework.context.annotation.AnnotationConfigApplicationContext
import java.time.LocalDate

fun main() {
    val context = AnnotationConfigApplicationContext(AppConfig::class.java)
    val trainContainer = context.getBean(Container::class.java) as TrainContainer

    val way1 = Way("Kyiv-Darnytsia", "Lviv", "regular", LocalDate.of(2023, 5, 23), 586, 500.5, false)
    val way2 = Way("Kyiv", "Slavske", "regular", LocalDate.of(2023, 5, 23), 711, 600.5, false)

    trainContainer.add(
            Train(
                    "HRCS2",
                    "Hyundai Rotem",
                    "Speed",
                    LocalDate.of(2012, 5, 27),
                    579,
                    461,
                    true,
                    way1
            ),
    )

    trainContainer.add(
            Train(
                    "HRCS2",
                    "Hyundai Rotem",
                    "Speed",
                    LocalDate.of(2020, 12, 15),
                    579,
                    461,
                    true,
                    way2
            ),
    )
}