// for loop practice code kotlin
// codeAcademy
// Mario Cako

fun isOdd(i: Int): Boolean{
    if (i % 2 != 0){
        return true
    }
    return false
}

fun isEven(num: Int): Boolean {
    if (num % 2 == 0){
        return true
    }
    return false
}


fun main() {
    // Square Variables
    val sqSide = 7
    val sqChar1 = "X  "
    val sqChar2 = "O  "
    // Write your code below
    for (i in 1..sqSide){
        for (j in 1..sqSide){
            if(isEven(i)&&isEven(j) || isOdd(i)&&isOdd(j) ){
                print(sqChar1)
            } else{
                print(sqChar2)
            }
        }
        println()
    }
    println()


    // Triangle Variables
    val triRows = 10
    var triCount = 0
    var triRowLen = triRows
    val triChar1 = "/  "
    val triChar2 = "   "
    // Write your code below

    // triangle 1
    for (i in triRows downTo 1){
        triCount = 0
        while(triCount < triRowLen){
            triCount++
            print(triChar1)
        }
        println()
        triRowLen--
    }
    println()


    // triangle 2
    triRowLen = triRows
    for (i in triRows downTo 1) {
        while (triCount < triRowLen) {
            triCount++
            if (triCount != 1 && triCount != triRowLen && i != triRows) {
                print(triChar2)
            } else {
                print(triChar1)
            }
        }
        println()
        triCount = 0
        triRowLen--
    }


}