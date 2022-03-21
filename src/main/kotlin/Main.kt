fun main() {

    val array: IntArray = intArrayOf(1,3,5,2,6,7,4,9,8,0)
    var sortedArray = sort(array)
    println(sortedArray.contentToString())
    
}

fun sort(array: IntArray): IntArray {

    var j: Int
    var value: Int
    val upperLimit = array.size - 1

    for(i in  1 .. upperLimit) {
        value = array[i]
        j = i - 1
        while(j >= 0 && value > array[j]) {
            array[j+1] = array[j]
            j--
            array[j + 1] = value
        }
    }
    return array
}