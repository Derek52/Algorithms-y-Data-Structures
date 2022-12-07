package algorithms

import org.junit.jupiter.api.Test

class HanoiTowersTest {

    @Test
    fun solveTowersTest() {
        val hanoiTowers = HanoiTowers()
        hanoiTowers.solveTowers(3, 'A', 'B', 'C')
    }
}