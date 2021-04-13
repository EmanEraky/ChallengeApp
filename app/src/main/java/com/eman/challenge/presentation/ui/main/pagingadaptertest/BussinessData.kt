//package com.eman.challenge.presentation.ui.main.pagingadaptertest
//
//object BussinessData {
//
//    fun getItems(size: Int): List<Character> {
//        return Array(size) {
//            Character(it.toString(), "Item $it")
//        }.toList()
//    }
//
//    // 累加
//    fun getIncreaseItems(start: String, size: Int): List<Character> {
//        return Array(size) {
//            val index = start.toInt() + it
//            Character(index.toString(), "Item $index")
//        }.toList()
//    }
//
//    // 累減，陣列的第一個元素是最小的數
//    fun getReduceItems(start: Int, size: Int): List<Character> {
//        return Array(size) {
//            val index = (start - size) + it
//            Character(index.toString(), "Item $index")
//        }.toList()
//    }
//}