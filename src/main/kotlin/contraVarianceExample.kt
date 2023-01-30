//contravariance uses in keyword it is of type consumers
//it is used to only takes values to the functions which are of subtypes of T

class contraVarianceExample <in T >{
    fun function1(x : T): Number{
        println("takes the parameter of type T")
        return x as Number
    }

    fun function2(x : Int){
        println("this is a function with no return type and takes a parameter not related to generic type ")
    }

    fun function3( x : Any){

    }
}

fun main(){
    var example1 =  contraVarianceExample<Number>()
    println(example1.function1(12f))
}