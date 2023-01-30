import java.util.Objects

//coVariance are like producers the keyword used is out used when the functions return the elements
//called producers only returns objects of Type T
class coVarianceExample<out T >(val type : T){
    fun function1(): T{
        return type
    }

    fun function2(x : Any): String{
        println("this is a function with no return type and takes a parameter not related to generic type ")
        return "yes"
    }

    fun function3( x : Any){

    }

}

fun main(){
    var example1 = coVarianceExample<String>("Pra")
    println(example1.type)

    var example2 = coVarianceExample<Number>(1.0)
    var returnValue = example2.type

    println(returnValue)

}
