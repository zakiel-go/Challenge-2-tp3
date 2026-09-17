package com.example.challenge_2_tp3.components

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.challenge_2_tp3.R
import com.example.challenge_2_tp3.ui.theme.Challenge_2_tp3Theme

enum class TopBarNavIcon { Menu, Back }

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTopBar(
    title: String,
    onNavigationClick: () -> Unit,
    onProfileClick: () -> Unit,
    modifier: Modifier = Modifier,
    navIcon: TopBarNavIcon = TopBarNavIcon.Menu,
) {
    CenterAlignedTopAppBar(
        modifier = modifier,
        title = {
            Text(
                text = title,
                style = MaterialTheme.typography.titleLarge,
            )
        },
        navigationIcon = {
            IconButton(onClick = onNavigationClick) {
                Icon(
                    painter = painterResource(
                        when (navIcon) {
                            TopBarNavIcon.Menu -> R.drawable.ic_menu
                            TopBarNavIcon.Back -> R.drawable.ic_arrow_back
                        }
                    ),
                    contentDescription = stringResource(
                        when (navIcon) {
                            TopBarNavIcon.Menu -> R.string.cd_open_menu
                            TopBarNavIcon.Back -> R.string.cd_back
                        }
                    ),
                )
            }
        },
        actions = {
            IconButton(onClick = onProfileClick) {
                Icon(
                    painter = painterResource(R.drawable.ic_account_circle),
                    contentDescription = stringResource(R.string.cd_open_profile),
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.surface,
            titleContentColor = MaterialTheme.colorScheme.onSurface,
            navigationIconContentColor = MaterialTheme.colorScheme.onSurface,
            actionIconContentColor = MaterialTheme.colorScheme.onSurface,
        ),
    )
}

@Preview(showBackground = true)
@Composable
private fun AppTopBarMenuPreview() {
    Challenge_2_tp3Theme {
        AppTopBar(
            title = stringResource(R.string.screen_shop_list_title),
            onNavigationClick = {},
            onProfileClick = {},
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun AppTopBarBackPreview() {
    Challenge_2_tp3Theme {
        AppTopBar(
            title = stringResource(R.string.screen_profile_title),
            onNavigationClick = {},
            onProfileClick = {},
            navIcon = TopBarNavIcon.Back,
        )
    }
}
