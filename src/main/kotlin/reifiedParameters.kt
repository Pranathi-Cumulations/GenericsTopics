//reified parameters is a concept of inline functions to pass type parameters inside the functions
// which can be used later on inside the implementation

inline fun <reified  T> checkIfTheParameterPassedisT(para : Any){
    if (para is T){
        println("It passes")
    }
    else{
        println("it does not match")
    }
}



fun main(){
    checkIfTheParameterPassedisT<Int>(4)
    checkIfTheParameterPassedisT<Int>("yes")
}