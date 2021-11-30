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

//https://ksw1652.github.io/2018/10/10/codility-lesson-02-OddOccurrencesInArray/
fun solution(A: IntArray): Int {
    if(A.size == 1)
        return A[0]
    val map = HashMap<Int,Int>()
    for(i in A.indices){
        if(map[A[i]]==null)
            map[A[i]] = i
        else
            map.remove(A[i])
    }
    for(value in map.keys){
        //무조건 한개일듯
        return value
    }
    return 0
}

//A[0] = 9  A[1] = 3  A[2] = 9
//A[3] = 3  A[4] = 9  A[5] = 7
//A[6] = 9

fun main() {
    val list = mutableListOf<Int>()
//    list.add(9)
//    list.add(3)
//    list.add(9)
//    list.add(9)
//    list.add(3)
//    list.add(7)
//    list.add(9)
    for(i in 0 .. 999997){
        list.add(1)
    }
    list.add(2)
    val result = solution(list.toIntArray())
    println(result)
}