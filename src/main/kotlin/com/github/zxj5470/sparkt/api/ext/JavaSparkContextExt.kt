package com.github.zxj5470.sparkt.api.ext

import org.apache.spark.api.java.JavaSparkContext

/**
 * @author zxj5470
 * @date 2018/5/9
 */
inline var JavaSparkContext.logLevel: String
	get() = ""
	set(value) {
		this.setLogLevel(value)
	}
