package com.example.poehali.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.poehali.ui.theme.PoehaliTheme


@Composable
fun TrainerScreen(){
    Box(
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Тренажер")
    }
}

@Preview(showSystemUi = true)
@Composable
fun DefaultPreview() {
    PoehaliTheme {
        TrainerScreen()
    }
}