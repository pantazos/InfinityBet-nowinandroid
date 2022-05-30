package com.google.samples.apps.nowinandroid.feature.foryou

import com.google.samples.apps.nowinandroid.core.model.data.SaveableNewsResource

/**
 * A sealed hierarchy describing the state of the feed on the for you screen.
 */
sealed interface ForYouFeedUiState {
    /**
     * The feed is still loading.
     */
    object Loading : ForYouFeedUiState

    /**
     * The feed is loaded with the given list of news resources.
     */
    data class Success(
        /**
         * The list of news resources contained in this [PopulatedFeed].
         */
        val feed: List<SaveableNewsResource>
    ) : ForYouFeedUiState
}
