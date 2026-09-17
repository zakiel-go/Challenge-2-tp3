package com.example.challenge_2_tp3.navigation

sealed class Screen(val route: String) {
    data object ItemList : Screen("item_list")
    data object ItemDetail : Screen("item_detail")
    data object Favourites : Screen("favourites")
    data object Profile : Screen("profile")
    data object Settings : Screen("settings")
}
