package com.example.challenge_2_tp3.ui.theme

import androidx.compose.ui.graphics.Color

/**
 * Paleta de la app, derivada del color de marca del Figma (marrón terracota).
 *
 * No se usan estos valores directamente en las pantallas: se mapean en [Theme] a los
 * roles de Material 3 (primary, surface, outline, etc.) y las pantallas consumen
 * siempre el rol, nunca el hexadecimal. Así, cambiar la marca es cambiar este archivo.
 */

// ---------- Light ----------
val primaryLight = Color(0xFF9C4A2B)
val onPrimaryLight = Color(0xFFFFFFFF)
val primaryContainerLight = Color(0xFFFFDBCF)
val onPrimaryContainerLight = Color(0xFF3A0B00)

val secondaryLight = Color(0xFF77574C)
val onSecondaryLight = Color(0xFFFFFFFF)
val secondaryContainerLight = Color(0xFFFFDBCF)
val onSecondaryContainerLight = Color(0xFF2C160E)

val tertiaryLight = Color(0xFF6C5D2F)
val onTertiaryLight = Color(0xFFFFFFFF)
val tertiaryContainerLight = Color(0xFFF5E1A7)
val onTertiaryContainerLight = Color(0xFF231B00)

val errorLight = Color(0xFFBA1A1A)
val onErrorLight = Color(0xFFFFFFFF)
val errorContainerLight = Color(0xFFFFDAD6)
val onErrorContainerLight = Color(0xFF410002)

val backgroundLight = Color(0xFFFBEDE9)
val onBackgroundLight = Color(0xFF231A16)
val surfaceLight = Color(0xFFFFF8F6)
val onSurfaceLight = Color(0xFF231A16)
val surfaceVariantLight = Color(0xFFF5DED6)
val onSurfaceVariantLight = Color(0xFF53433E)

val outlineLight = Color(0xFF85736D)
val outlineVariantLight = Color(0xFFD8C2BA)
val scrimLight = Color(0xFF000000)
val inverseSurfaceLight = Color(0xFF392E2A)
val inverseOnSurfaceLight = Color(0xFFFFEDE7)
val inversePrimaryLight = Color(0xFFFFB59B)

val surfaceDimLight = Color(0xFFE8D6D0)
val surfaceBrightLight = Color(0xFFFFF8F6)
val surfaceContainerLowestLight = Color(0xFFFFFFFF)
val surfaceContainerLowLight = Color(0xFFFFF1EC)
val surfaceContainerLight = Color(0xFFFCEBE5)
val surfaceContainerHighLight = Color(0xFFF6E5E0)
val surfaceContainerHighestLight = Color(0xFFF1E0DA)

// ---------- Dark ----------
val primaryDark = Color(0xFFFFB59B)
val onPrimaryDark = Color(0xFF5A1B03)
val primaryContainerDark = Color(0xFF7C3317)
val onPrimaryContainerDark = Color(0xFFFFDBCF)

val secondaryDark = Color(0xFFE7BEAF)
val onSecondaryDark = Color(0xFF442A21)
val secondaryContainerDark = Color(0xFF5D4036)
val onSecondaryContainerDark = Color(0xFFFFDBCF)

val tertiaryDark = Color(0xFFD9C58D)
val onTertiaryDark = Color(0xFF3B2F05)
val tertiaryContainerDark = Color(0xFF534619)
val onTertiaryContainerDark = Color(0xFFF5E1A7)

val errorDark = Color(0xFFFFB4AB)
val onErrorDark = Color(0xFF690005)
val errorContainerDark = Color(0xFF93000A)
val onErrorContainerDark = Color(0xFFFFDAD6)

val backgroundDark = Color(0xFF1A120F)
val onBackgroundDark = Color(0xFFF1DFD9)
val surfaceDark = Color(0xFF1A120F)
val onSurfaceDark = Color(0xFFF1DFD9)
val surfaceVariantDark = Color(0xFF53433E)
val onSurfaceVariantDark = Color(0xFFD8C2BA)

val outlineDark = Color(0xFFA08D86)
val outlineVariantDark = Color(0xFF53433E)
val scrimDark = Color(0xFF000000)
val inverseSurfaceDark = Color(0xFFF1DFD9)
val inverseOnSurfaceDark = Color(0xFF392E2A)
val inversePrimaryDark = Color(0xFF9C4A2B)

val surfaceDimDark = Color(0xFF1A120F)
val surfaceBrightDark = Color(0xFF423734)
val surfaceContainerLowestDark = Color(0xFF140C0A)
val surfaceContainerLowDark = Color(0xFF231A16)
val surfaceContainerDark = Color(0xFF271E1A)
val surfaceContainerHighDark = Color(0xFF322824)
val surfaceContainerHighestDark = Color(0xFF3D332E)
