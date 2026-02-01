# Calculator App

A simple Android calculator application that performs basic arithmetic operations.

## Description

This is a basic calculator app built for Android using Java. It provides a clean and intuitive interface for performing addition, subtraction, multiplication, and division operations on two numbers.

## Features

- **Basic Arithmetic Operations**: Supports addition (+), subtraction (-), multiplication (*), and division (/)
- **Input Validation**: Ensures both numbers are entered before performing calculations
- **Error Handling**: Handles division by zero gracefully
- **Clean UI**: Simple and user-friendly interface with two input fields and operation buttons
- **Real-time Results**: Displays calculation results immediately

## Prerequisites

- **Android Studio**: Version 2022.3.1 or later (recommended)
- **Android SDK**: API level 24 (Android 7.0) or higher
- **Java Development Kit (JDK)**: Version 11 or higher
- **Gradle**: Version 8.0 or higher (included with Android Studio)

## Installation

1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   cd calculator-app
   ```

2. **Open in Android Studio**:
   - Launch Android Studio
   - Select "Open an existing Android Studio project"
   - Navigate to the cloned directory and select it

3. **Build the project**:
   - Wait for Gradle sync to complete
   - Build the project using `Build > Make Project` or `Ctrl+F9`

4. **Run on device/emulator**:
   - Connect an Android device or start an emulator
   - Click the "Run" button (green play icon) or use `Shift+F10`

## Usage

1. Launch the Calculator App on your Android device
2. Enter the first number in the "Enter Number 1" field
3. Enter the second number in the "Enter Number 2" field
4. Tap one of the operation buttons (+, -, *, /)
5. View the result displayed below the buttons

**Note**: Both number fields must be filled before performing any operation. Attempting to divide by zero will display an error message.

## Project Structure

```
calculator-app/
├── app/
│   ├── build.gradle.kts          # App-level build configuration
│   ├── proguard-rules.pro        # ProGuard rules for release builds
│   └── src/
│       ├── androidTest/           # Instrumentation tests
│       ├── main/
│       │   ├── AndroidManifest.xml    # App manifest
│       │   ├── java/
│       │   │   └── com/example/calculatorapp/
│       │   │       ├── CalculatorLogic.java  # Business logic for calculations
│       │   │       └── MainActivity.java     # Main activity with UI logic
│       │   └── res/               # Resources (layouts, values, drawables)
│       │       ├── layout/
│       │       │   └── activity_main.xml     # Main activity layout
│       │       └── values/         # String, color, and theme resources
│       └── test/                  # Unit tests
├── build.gradle.kts               # Top-level build file
├── gradle.properties              # Gradle properties
├── gradlew                        # Gradle wrapper (Linux/Mac)
├── gradlew.bat                    # Gradle wrapper (Windows)
└── settings.gradle.kts            # Project settings
```

## Technologies Used

- **Language**: Java 11
- **Framework**: Android SDK
- **Build Tool**: Gradle with Kotlin DSL
- **Architecture**: Model-View-Controller (MVC) pattern
- **UI Components**: Android Views (EditText, Button, TextView)

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Built as a learning project for Android development
- Uses standard Android development practices and patterns
