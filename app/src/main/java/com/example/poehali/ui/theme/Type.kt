package com.example.poehali.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.poehali.R

val ubuntu = FontFamily(
    Font(R.font.ubuntu_regular),
    Font(R.font.ubuntu_bold, FontWeight.Bold),
    Font(R.font.ubuntu_light, FontWeight.Light),
    Font(R.font.ubuntu_medium, FontWeight.Medium),
    Font(R.font.ubuntu_italic, FontWeight.Normal, FontStyle.Italic),
)
// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)

private val defaultTypography = Typography()
val appTypography = Typography(
    displayLarge = defaultTypography.displayLarge.copy(fontFamily = ubuntu),
    displayMedium = defaultTypography.displayMedium.copy(fontFamily = ubuntu),
    displaySmall = defaultTypography.displaySmall.copy(fontFamily = ubuntu),
    headlineLarge = defaultTypography.headlineLarge.copy(fontFamily = ubuntu),
    headlineMedium = defaultTypography.headlineMedium.copy(fontFamily = ubuntu),
    headlineSmall = defaultTypography.headlineSmall.copy(fontFamily = ubuntu),
    titleLarge = defaultTypography.titleLarge.copy(fontFamily = ubuntu),
    titleMedium = defaultTypography.titleMedium.copy(fontFamily = ubuntu),
    titleSmall = defaultTypography.titleSmall.copy(fontFamily = ubuntu),
    bodyLarge = defaultTypography.bodyLarge.copy(fontFamily = ubuntu),
    bodyMedium = defaultTypography.bodyMedium.copy(fontFamily = ubuntu),
    bodySmall = defaultTypography.bodySmall.copy(fontFamily = ubuntu),
    labelLarge = defaultTypography.labelLarge.copy(fontFamily = ubuntu),
    labelMedium = defaultTypography.labelMedium.copy(fontFamily = ubuntu),
    labelSmall = defaultTypography.labelSmall.copy(fontFamily = ubuntu)
)

@Composable
fun Ubuntu(): FontFamily = ubuntu