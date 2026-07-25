# QuizVault
Offline categorized quiz app for Android (Java) — JSON-driven questions, per-question countdown timers, and a UI-independent, JUnit-tested scoring engine.

## Features
- Category selection with local JSON question bank (no network required)
- Per-question 15-second countdown timer
- Immediate correct/wrong visual feedback
- Score summary on completion

## Built with
Java, Android SDK, org.json, JUnit4

## Run it
1. Clone the repo
2. Open in Android Studio
3. Run on an emulator or device (min SDK — fill in your actual minSdkVersion)

## Architecture note
Scoring and quiz-progression logic (`QuizEngine`) has zero Android 
dependencies and is unit-tested independently of the UI layer.
