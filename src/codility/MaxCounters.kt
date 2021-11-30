package codility

import printList

/**
 * 참고자료  https://www.youtube.com/watch?v=RRrHal1bKws
 * N counters -> N개의 원소를 갖는 배열 ex) N =3 -> [0,0,0]
 * Todo 최적화 고려
 **/

//if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),

fun solution1(N: Int, A: IntArray): IntArray {
    val list = IntArray(size = N)
    var max = 0
    for (a in A) {
        if (a == N + 1) {
            for (i in list.indices) {
                list[i] = max
            }
        } else if (a <= N) {
            list[a - 1]++
            if (max < list[a - 1])
                max = list[a - 1]
        }
    }
    return list
}


fun solution(N: Int, A: IntArray): IntArray {
    val list = IntArray(size = N)
//    var max = 0
//    var currentMax = 0
//    for(a in A){
//        if(a<N){
//           if(list[a-1]+1 > max){
//               currentMax = list[a-1]++
//           }else
//               list[a-1] = max+1
//        }
//        if(a==N+1){
//            max = currentMax
//        }
//    }
//    for(i in list.indices){
//        if(list[i]<max){
//            list[i] = max
//        }
//    }
    return list
}


fun main() {
    val list = mutableListOf<Int>()
    list.add(3)
    list.add(4)
    list.add(4)
    list.add(6)
    list.add(1)
    list.add(4)
    list.add(4)
    val result = solution(5, list.toIntArray())
    printList(result)

}
//A[0] = 3
//A[1] = 4
//A[2] = 4
//A[3] = 6
//A[4] = 1
//A[5] = 4
//A[6] = 4


//[3, 2, 2, 4, 2]