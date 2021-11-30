//https://app.codility.com/programmers/lessons/2-arrays/
fun solution(A: IntArray, K: Int): IntArray {
    if(A.isEmpty())
        return A
    val realK = K % A.size
    if (realK == 0)
        return A
    val result = mutableListOf<Int>()
    val startIndex = A.size - realK

    for (i in startIndex until A.size) {
        result.add(A[i])
    }
    for (i in 0 until startIndex) {
        result.add(A[i])
    }
    return result.toIntArray()
}


//[1, 2, 3, 4], 4
//[3, 8, 9, 7, 6], 3 => [9, 7, 6, 3, 8].
//fun main() {
//    val k = 10
//    val list = listOf<Int>()
//    val l = list.toIntArray()
//    val result = solution(l, k)
//    for (a in result) {
//        println(a)
//    }
//}
//

//A[0] = 9  A[1] = 3  A[2] = 9
//A[3] = 3  A[4] = 9  A[5] = 7
//A[6] = 9
//OddOccurrencesInArray

