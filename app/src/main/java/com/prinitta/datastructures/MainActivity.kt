package com.prinitta.datastructures

fun main() {
    fun removeAll() {
        val list: MutableCollection<String> = LinkedList()
        list.add("Bleach")
        list.add("The promissed neverland")
        list.add("Food wars")
        list.add("Pokemon")
        list.add("Kakegurui")
        list.add("Violet evergarden")
        println(list)
        list.removeAll(listOf("Kakegurui", "Bleach"))
        println(list)
    }
    removeAll()
}