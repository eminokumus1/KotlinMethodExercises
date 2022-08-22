fun main(args: Array<String>) {
    var str = "hello"
    str = capitalize(str)
    println("Capitalize = $str")

    str = "hELlO"
    str = lower(str)
    println("Lower = $str")

    str = "hello"
    str = upper(str)
    println("Upper = $str")

    encode(str)

    str = "HellO"
    println("Ends With =  ${endsWith(str, 'o')}")

    str = "Hello"
    println("Starts With = ${startsWith(str,'h')}")

    str ="Hello"
    print("Find = ")
    find(str,'l')



}

fun capitalize(str: String): String {
    val firstCh = str[0]
    return if (firstCh.code in 97..122) {
        val chValue = firstCh.code - 32
        val capitalFirstCh = chValue.toChar()
        var newStr = capitalFirstCh.toString()
        for (i in 1..str.length - 1) newStr += str[i]
        newStr
    } else str
}

fun lower(str: String): String {
    var newStr =""
    for (i in 0..str.length-1){
        newStr += if (str[i].code in 65..90) (str[i].code+32).toChar() else str[i]
    }
    return newStr
}

fun upper(str: String): String{
    var newStr = ""
    for (i in 0..str.length-1){
        newStr += if(str[i].code in 97..122) (str[i].code-32).toChar() else str[i]
    }
    return newStr
}

fun encode(str: String){
    println("Encoded string: ")
    for (i in 0..str.length-1) print("${str[i].code} ")
    println()
}

fun endsWith(str: String, ch: Char): Boolean = str[str.length-1].equals(ch, ignoreCase = true)

fun startsWith(str: String,ch: Char): Boolean = str[0].equals(ch, ignoreCase = true)

fun find(str: String, ch: Char) {
    for(i in 0..str.length-1){
        if (str[i].equals(ch)){
            println("This character is in ${i+1}.th row")
            break
        }else if (i == str.length-1){
            println("String doesn't include this character")
        }
    }
}