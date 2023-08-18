// main function
abstract class Vechile(wheel: Int)
class Car(speed: Int) : Vechile(4)
class MotorCycle(speed: Int) : Vechile(2)

fun main() {
    val car = Car(200)
    val motorCycle = MotorCycle(100)
    var Vechile: Vechile = car
    Vechile = motorCycle
}