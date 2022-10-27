package com.example.poehali.presentation.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.poehali.presentation.screens.bottomNav.BottomBarScreen
import com.example.poehali.presentation.screens.bottomNav.BottomNavGraph


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen(){
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomBar(navController = navController) }
    ) {
        BottomNavGraph(navController = navController)
    }
}

@Composable
fun BottomBar(navController: NavHostController){
    val screens = listOf(
        BottomBarScreen.Dicts,
        BottomBarScreen.Trainer,
        BottomBarScreen.Profile)
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = navBackStackEntry?.destination
    
    BottomNavigation() {
        screens.forEach{
            AddItem(screen = it, currentScreen = currentScreen, navController = navController)
        }
    }
}

@Composable
fun RowScope.AddItem(
    screen: BottomBarScreen,
    currentScreen: NavDestination?,
    navController: NavHostController
){
    BottomNavigationItem(
        label = {
            Text(screen.title)
        },
        icon = {
            Icon(imageVector = screen.icon, "icon")
        },
        selected = currentScreen?.hierarchy?.any{
            it.route == screen.route
        } == true,
        onClick = {
            navController.navigate(screen.route)
        },
        unselectedContentColor = LocalContentColor.current.copy(ContentAlpha.disabled)
    )
}