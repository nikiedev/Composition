package com.nikiedev.composition.domain.usecases

import com.nikiedev.composition.domain.entity.GameSettings
import com.nikiedev.composition.domain.entity.Question
import com.nikiedev.composition.domain.repository.GameRepository

class GenerateQuestionUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(maxSumValue: Int): Question {
        return repository.generateQuestion(maxSumValue, COUNT_OF_OPTIONS)
    }

    private companion object {

        private const val COUNT_OF_OPTIONS = 6
    }
}