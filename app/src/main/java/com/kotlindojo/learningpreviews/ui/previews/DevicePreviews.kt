package com.kotlindojo.learningpreviews.ui.previews

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.kotlindojo.learningpreviews.TextSample
import com.kotlindojo.learningpreviews.ui.theme.LearningPreviewsTheme

/**
 * Device and System UI
 *
 */
@Preview(
    group = "Device",
    showSystemUi = true,
    device = Devices.AUTOMOTIVE_1024p
)
@Composable
fun AutomotivePreview() {
    LearningPreviewsTheme {
        TextSample("Combo")
    }
}

@Preview(
    group = "Device",
    showSystemUi = true,
    device = Devices.PIXEL_4_XL
)
@Composable
fun Pixel4XLPreview() {
    LearningPreviewsTheme {
        TextSample("Combo")
    }
}

@Preview(
    group = "Device",
    showSystemUi = true,
    device = Devices.FOLDABLE
)
@Composable
fun FoldablePreview() {
    LearningPreviewsTheme {
        TextSample("Combo")
    }
}

@Preview(
    group = "Device",
    showSystemUi = true,
    device = Devices.DESKTOP
)
@Composable
fun DesktopPreview() {
    LearningPreviewsTheme {
        TextSample("Combo")
    }
}
