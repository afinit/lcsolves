class NumArray(_nums: Array[Int]) {

    def sumRange(i: Int, j: Int): Int = {
      _nums.slice(i,j+1).sum
    }

}

object NumArray {
  def apply(_num: Array[Int]): NumArray = {
    new NumArray(_num)
  }
}

object app extends App {
  println(NumArray(Array(-2, 0, 3, -5, 2, -1)).sumRange(0,2))
  println(NumArray(Array(-2, 0, 3, -5, 2, -1)).sumRange(2,5))
  println(NumArray(Array(-2, 0, 3, -5, 2, -1)).sumRange(0,5))
}
