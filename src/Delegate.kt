import kotlin.reflect.KProperty

class PropertyDelegate(var value: String) {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println("${thisRef}")
        println("${property.name} get value ${this.value}")
        return value
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, newValue: String) {
        println("${property.name} set value ${this.value} -> $newValue")
        this.value = newValue
    }
}

class Human{
    var name: String by PropertyDelegate("no name") // getValue, setValue
    val age: String by PropertyDelegate("31") // getValue
}

data class Email(val msg: String)

class Naver {
    val emailList by lazy {
        loadEmail()
    }

    private fun loadEmail(): List<Email> {
        return mutableListOf<Email>().apply {
            Email("test1")
            Email("test2")
        }
    }
}

fun main() {
    val naver = Naver()
    val list = naver.emailList
}

