package com.kotlindojo.learningpreviews.ui.previews

import android.content.res.Configuration
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.kotlindojo.learningpreviews.R
import com.kotlindojo.learningpreviews.TextSample
import com.kotlindojo.learningpreviews.ui.theme.LearningPreviewsTheme

/**
 * Stack them
 * https://developer.android.com/jetpack/compose/tooling?hl=it&skip_cache=false#preview-multipreview
 */
@Preview(name = "0", group = "Stack")
@Preview(name = "1", group = "Stack")
@Preview(name = "2", group = "Stack")
@Composable
fun StackPreviews() {
    LearningPreviewsTheme {
        TextSample()
    }
}

/**
 * Multipreview Annotations
 * Multiple @Preview annotations with different configurations that can be applied across multiple
 * composables.
 *
 * Note: Available from Android Studio Dolphin and Jetpack Compose 1.2.0-beta01.
 *
 * https://developer.android.com/jetpack/compose/tooling?hl=it&skip_cache=false#preview-multipreview
 */

// First we create it
@Preview(
    name = "Small",
    group = "Multipreviews",
    fontScale = 0.5f
)
@Preview(
    name = "Medium",
    group = "Multipreviews",
    fontScale = 1f
)
@Preview(
    name = "Large",
    group = "Multipreviews",
    fontScale = 1.5f
)
annotation class FontScalePreviews

// Now we use it
@FontScalePreviews
@Composable
fun MultipreviewsAnnotation() {
    LearningPreviewsTheme {
        TextSample(text = "Hello Scale")
    }
}

@FontScalePreviews
@Composable
fun ScaleFontAgain() {
    Text("More scale?", color = Color.Magenta)
}

/**
 * Combine Multipreviews for a single Composable
 */
// Create them
@Preview(
    name = "Night",
    group = "Combo",
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Preview(
    name = "Day",
    group = "Combo",
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
annotation class UiModePreviews

@Preview(
    name = "English",
    group = "Combo",
    locale = "en"
)
@Preview(
    name = "Bahasa Indonesia",
    group = "Combo",
    locale = "in-rID" // Setup locale https://developer.android.com/training/basics/supporting-devices/languages
)
annotation class LocalePreviews

// Put them together
@UiModePreviews
@LocalePreviews
annotation class ComboPreview

// Use them
@ComboPreview
@Composable
fun Combo() {
    LearningPreviewsTheme {
        Surface(color = MaterialTheme.colors.primary) {
            Text(text = stringResource(R.string.greeting))
        }
    }
}
