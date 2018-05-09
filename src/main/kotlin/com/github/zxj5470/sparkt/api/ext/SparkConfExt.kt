package com.github.zxj5470.sparkt.api.ext

/**
 * @author zxj5470
 * @date 2018/5/9
 */
import org.apache.spark.SparkConf
import org.apache.spark.api.java.JavaSparkContext

/**
 * @author zxj5470
 * @date 2018/5/9
 */
fun SparkConf.toJavaSparkContext(block: JavaSparkContext.() -> Unit) = JavaSparkContext(this).apply(block)

fun SparkConf.toJavaSparkContext() = JavaSparkContext(this)


inline fun sparkContext(block: SparkConf.() -> Unit) = SparkConf().apply(block)

private var _appName = ""
private var _master = ""

var SparkConf.appName: String
	get() = _appName
	set(value) {
		this.setAppName(value)
		_appName = value
	}

var SparkConf.master: String
	get() = _master
	set(value) {
		this.setMaster(value)
		_master = value
	}

var SparkConf.jars: Array<String>?
	get() = null
	set(value) {
		this.setJars(value)
	}