package com.kotlindojo.learningpreviews.ui.previews

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * PreviewParameters
 * https://developer.android.com/jetpack/compose/tooling?hl=it&skip_cache=false#previewparameter
 */

// Return sample data as sequence
class DojoSlideParameterProvider : PreviewParameterProvider<Talk> {
    override val values = sequenceOf(
        Talk(title = "Jetpack Compose Navigation", presenter = "Elisha Lye"),
        Talk(title = "Make use of a use case", presenter = "Sarah Bernard"),
        Talk(title = "Security and Storage", presenter = "Swapnil Gupta"),
    )
}

// Pass in sample data as Preview Parameter
@Preview(device = Devices.DESKTOP)
@Composable
fun DojoSlidePreview(
    @PreviewParameter(DojoSlideParameterProvider::class) talk: Talk
) {
    DojoSlide(title = talk.title, presenter = talk.presenter)
}


data class Talk (
    val title: String,
    val presenter: String
)

@Composable
fun DojoSlide(title: String, presenter: String){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(13, 92, 99)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = title, fontWeight = Bold, fontSize = 84.sp, color = Color(120, 205, 215))
        Spacer(modifier = Modifier.height(32.dp))
        Text(text = presenter,  fontSize = 54.sp, color = Color(120, 205, 215))
    }
}
