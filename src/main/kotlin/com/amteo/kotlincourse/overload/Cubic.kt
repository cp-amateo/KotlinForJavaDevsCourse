package com.amteo.kotlincourse.overload

class Cubic(val x: Int, val y: Int, val z: Int) {

    operator fun plus(other: Cubic): Cubic {
        return Cubic(x + other.x, y + other.y, z + other.z)
    }

    operator fun minus(other: Cubic): Cubic {
        return Cubic(x - other.x, y - other.y, z - other.z)
    }

    override fun toString(): String {
        return "Cubic(x=$x, y=$y, z=$z)"
    }
}
