package com.github.zxj5470.sparkt

import com.github.zxj5470.sparkt.api.ext.*

/**
 * @author zxj5470
 * @date 2018/5/9
 */
val defaultSparkContext = sparkContext {
	appName = "local"
	master = "local"
}.toJavaSparkContext {
	logLevel = "OFF"
}