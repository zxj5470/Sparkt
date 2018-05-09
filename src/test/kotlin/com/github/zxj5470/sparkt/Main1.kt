import com.github.zxj5470.sparkt.*

/**
 * @author zxj5470
 * @date 2018/5/9
 */


fun main(args: Array<String>) {
	val sc = defaultSparkContext
	val lines = sc.textFile("testData.txt")
	val lineLengths = lines.map { it.length }
	val totalLength = lineLengths.reduce { a, b -> a + b }
	println(lineLengths)
	println(totalLength)
}