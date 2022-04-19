package com.nikiedev.composition.domain.entity

data class Question(
    val sum: Int,
    val visibleNumber: Int,
    val options: List<Int>
) {

    val rightNumber: Int
        get() = sum - visibleNumber
}