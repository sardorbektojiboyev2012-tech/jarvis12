package com.jarvis.agent.ui

import androidx.compose.material3.darkColorScheme
import androidx.compose.ui.graphics.Color

// JARVIS Neon Glass theme: deep navy surfaces, electric cyan and violet accents.
val Cyan = Color(0xFF48E8FF)
val Violet = Color(0xFF9B8CFF)
val jarvisScheme = darkColorScheme(
    primary = Cyan,
    onPrimary = Color(0xFF001419),
    primaryContainer = Color(0xFF103B49),
    onPrimaryContainer = Color(0xFFD4F7FF),
    secondary = Violet,
    onSecondary = Color(0xFF160E35),
    secondaryContainer = Color(0xFF30275A),
    onSecondaryContainer = Color(0xFFE9E3FF),
    background = Color(0xFF070B13),
    onBackground = Color(0xFFEAF4FF),
    surface = Color(0xFF101725),
    onSurface = Color(0xFFEAF4FF),
    surfaceVariant = Color(0xFF182235),
    onSurfaceVariant = Color(0xFFB9C8DD),
    outline = Color(0xFF344963),
    error = Color(0xFFFF6B81)
)
