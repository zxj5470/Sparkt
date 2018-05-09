# Sparkt

[![](https://jitpack.io/v/zxj5470/sparkt.svg?style=flat-square)](https://jitpack.io/#zxj5470/sparkt)

- Step 1. Add `jitpack.io` as a maven repository :
```groovy
allprojects {
   repositories {
      maven { url 'https://jitpack.io' }
   }
}
```
- Step 2. Add the dependency (Look at the number of icon) **or use `+` to get the latest version**
[![](https://jitpack.io/v/zxj5470/sparkt.svg?style=flat-square)](https://jitpack.io/#zxj5470/sparkt)
```groovy
dependencies {
   compile 'com.github.zxj5470:sparkt:+'
}
```

## Samples
- Calculate $\pi$
```kotlin
import com.github.zxj5470.sparkt.api.ext.*
import scala.util.Random

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
```