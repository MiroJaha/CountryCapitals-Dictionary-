fun main(){

    val countryCapitals= mutableMapOf<String,String>()

    var count=0
    while(count<3) {

        print("Please Enter The Country: ")
        val country = readLine().toString()
        print("Please Enter The Capital: ")
        val capital = readLine()!!

        if (country.isBlank() || capital.isEmpty()) {
            println("\nPlease Enter Valid Name\n")
            continue
        }
        println()
        countryCapitals[country] = capital
        count++
    }

    for(i in countryCapitals.keys)
        println("The Capital of $i is ${countryCapitals[i]}")
}