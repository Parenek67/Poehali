package com.example.poehali.presentation.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.poehali.R
import com.example.poehali.ui.theme.PoehaliTheme
import com.example.poehali.ui.theme.Ubuntu

@Composable
fun DictsScreen(){
    /*Box(
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Словари")
    }*/
    Scaffold(
        topBar = {
            TopAppBar(backgroundColor = colorResource(R.color.main),
            contentColor = Color.White) {

                Text(text = "Словари", fontSize = 20.sp,
                    color = Color.White, fontFamily = Ubuntu())
                Spacer(Modifier.weight(1f,true))
                IconButton(onClick = {}) {
                    Icon(painter = painterResource(id = R.drawable.search),
                        contentDescription = "")
                }
                IconButton(onClick = {}) {
                    Icon(painter = painterResource(id = R.drawable.sort),
                        contentDescription = "")
                }
            }
        },
        content = {paddingValues ->
            Column(Modifier.padding(paddingValues)){}
        }
    )
}

@Preview(showSystemUi = true)
@Composable
fun DefaultPreview() {
    MaterialTheme {
        DictsScreen()
    }
}
