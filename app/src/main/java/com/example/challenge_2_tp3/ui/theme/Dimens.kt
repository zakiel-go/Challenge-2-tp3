package com.example.challenge_2_tp3.ui.theme

import androidx.compose.ui.unit.dp

/**
 * Escala de espaciados y radios del sistema de diseño.
 *
 * Misma idea que los tokens de color: en las pantallas se escribe `Spacing.md`
 * y nunca `16.dp` suelto, para que los márgenes sean consistentes en toda la app.
 */
object Spacing {
    val xs = 4.dp
    val sm = 8.dp
    val md = 16.dp
    val lg = 24.dp
    val xl = 32.dp
}

object Radius {
    val sm = 8.dp
    val md = 12.dp
    val lg = 20.dp

    /** Botones tipo píldora del Figma. */
    val pill = 50.dp
}
