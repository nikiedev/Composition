package com.nikiedev.composition.domain.repository

import com.nikiedev.composition.domain.entity.GameSettings
import com.nikiedev.composition.domain.entity.Level
import com.nikiedev.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(maxSumValue: Int, countOfOptions: Int): Question

    fun getGameSettings(level: Level): GameSettings
}