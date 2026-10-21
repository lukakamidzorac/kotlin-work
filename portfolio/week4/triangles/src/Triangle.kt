// COMP2850 Portfolio: Week 4
// Triangle class
// COMP2850 Portfolio: Week 4
// Triangle class
import kotlin.math.sqrt

class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) {

    val perimeter: Double
        get() = sideA + sideB + sideC

    val semiPerimeter: Double
        get() = perimeter / 2

    val area: Double
        get() = sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC))
    init {
           require() { "Invalid triangle" }
       }

       override fun toString() = "____"

    init {
        require(____) { "Invalid triangle" }
    }

    override fun toString() = "____"

}
