fun <T> copy1(from: Array<out T>, to: Array<T>) {
    assert(from.size == to.size)
    for (i in from.indices)
        to[i] = from[i]
}


fun main(){
    val ints: Array<Int> = arrayOf(1, 2, 3)
    val any = Array<Any>(3) { "yes" }
    copy1(ints, any)

    val ints1: Array<Int> = arrayOf(1, 2, 3)
    val numbs = Array<Number>(3) { 1.0 }


    any.forEach { println(it) }


//   ^ type is Array<Int> but Array<Any> was expected
}