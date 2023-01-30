//use site is different from declaration site variance based on where the key words are declared

//if the keywords are mentioned at the class or instance declaration then it is delaration site variance
//if the keywords are mentioned while declaring the instances of the class or interface then it is use site variance
class useSiteExample<T>(val para : T){

}

fun main(){

    var example1 : useSiteExample<Int> = useSiteExample(2)
    var example2 : useSiteExample<out Number> = useSiteExample<Int>(2)
    var example3 : useSiteExample<in Int> = useSiteExample<Number>(2.0)


//   ^ type is Array<Int> but Array<Any> was expected
}