package com.kotlindojo.learningpreviews.ui.previews

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.kotlindojo.learningpreviews.TextSample
import com.kotlindojo.learningpreviews.ui.theme.LearningPreviewsTheme


@Preview(group = "Basic")
@Composable
fun BasicPreview() {
    LearningPreviewsTheme {
        TextSample()
    }
}

/**
 * Background
 */
@Preview(
    group = "Background",
    showBackground = true,
    backgroundColor = 0xFF03A9F4
)
@Composable
fun ShowBackgroundPreview() {
    LearningPreviewsTheme {
        TextSample()
    }
}

/**
 * Width and Height in dp
 * Defaults to wrap content
 */
@Preview(
    group = "Dimensions",
    widthDp = 128,
    heightDp = 64
)
@Composable
fun DimensionsPreview() {
    LearningPreviewsTheme {
        TextSample()
    }
}

/**
 * Scale font
 */
@Preview(
    group = "Font scale",
    fontScale = 1.5f
)
@Composable
fun FontScalePreview() {
    LearningPreviewsTheme {
        TextSample()
    }
}

/**
 * API Level
 */
@Preview(
    group = "API Level",
    apiLevel = 33
)
@Composable
fun ApiLevel33Preview() {
    LearningPreviewsTheme {
        TextSample()
    }
}

@Preview(
    group = "API Level",
    apiLevel = 25
)
@Composable
fun ApiLevel28Preview() {
    LearningPreviewsTheme {
        TextSample()
    }
}
