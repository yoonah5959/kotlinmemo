package codility

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