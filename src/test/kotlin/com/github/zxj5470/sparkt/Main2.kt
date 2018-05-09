package com.github.zxj5470.sparkt

import scala.util.Random

/**
 * @author zxj5470
 * @date 2018/5/9
 */
fun main(args: Array<String>) {
	val tasks = 4
	val n = tasks * 100000
	val sc = defaultSparkContext

	val count = sc.parallelize((1..n).toList(), tasks).map {
		val x = Random().nextDouble() * 2 - 1
		val y = Random().nextDouble() * 2 - 1
		if (x * x + y * y <= 1) 1 else 0
	}.reduce { i, j -> i + j }
	println("Pi is roughly " + 4.0 * count / n)
}