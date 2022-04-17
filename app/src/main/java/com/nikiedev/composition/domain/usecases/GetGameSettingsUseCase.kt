package com.nikiedev.composition.domain.usecases

import com.nikiedev.composition.domain.entity.GameSettings
import com.nikiedev.composition.domain.entity.Level
import com.nikiedev.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}