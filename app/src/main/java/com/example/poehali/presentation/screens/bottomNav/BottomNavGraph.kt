package com.example.poehali.presentation.screens.bottomNav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.poehali.presentation.screens.DictsScreen
import com.example.poehali.presentation.screens.TrainerScreen
import com.example.poehali.presentation.screens.ProfileScreen

@Composable
fun BottomNavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Dicts.route
    ){
        composable(BottomBarScreen.Dicts.route){
            DictsScreen()
        }
        composable(BottomBarScreen.Trainer.route){
            TrainerScreen()
        }
        composable(BottomBarScreen.Profile.route){
            ProfileScreen()
        }
    }
}