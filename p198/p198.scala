object Solution {
    def rob(nums: Array[Int]): Int = {
        var prevNums = (0,0,0)
        nums.map {
            houseVal =>
              val curr = scala.math.max( prevNums._1, scala.math.max( prevNums._2 + houseVal, prevNums._3 + houseVal ) )
              prevNums = (curr, prevNums._1, prevNums._2)
              curr
        }
        scala.math.max(prevNums._1, prevNums._2)
    }
}

object app extends App {
    println(Solution.rob(Array(1,2,3,1)))
    println(Solution.rob(Array(2,7,9,3,1)))
}
    
