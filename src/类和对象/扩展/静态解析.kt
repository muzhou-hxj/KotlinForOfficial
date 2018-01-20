package 类和对象.扩展

open class C

class D : C()

fun C.foo() = "c"
fun D.foo() = "d"

fun printFoo(c: C) {
    println(c.foo())
}

fun main(args: Array<String>) {
    printFoo(D())
}