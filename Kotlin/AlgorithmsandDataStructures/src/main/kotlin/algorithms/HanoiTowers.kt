package algorithms

class HanoiTowers {

    fun solveTowers(top: Int, from: Char, inter: Char, to: Char) {
        if (top == 1) {
            println("Disk 1 from $from to $to")
        } else {
            solveTowers(top-1, from, to, inter)
            println("Disk $top from $from to $to")
            solveTowers(top-1, inter, from, to)
        }
    }
}