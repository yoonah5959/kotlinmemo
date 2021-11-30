import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val dateStr ="2019-06-14T00:00:00.000+09:00"
    val format = SimpleDateFormat("yyyy-MM-dd", Locale.KOREAN)
    val date = format.parse(dateStr)
    println("date $date")

    val format2 = SimpleDateFormat("yyyy.M.d", Locale.KOREA)
    val result = format2.format(date)
    println("result $result")
}
