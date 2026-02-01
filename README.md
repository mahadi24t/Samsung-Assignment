# Android Developer Assessment Tasks

**Candidate:** [Your Name]
**Role:** Developer Evangelist / Android Developer
**Language:** Java

---

## 📂 Project Overview
This repository demonstrates best practices in **native Android (Java)** development, featuring clean architecture, battery-efficient sensing, and research-backed optimization strategies.

### **Module 1: Robust Calculator**
* **Location:** `/CalculatorApp`
* **Description:** A production-ready calculator implementing standard arithmetic operations.
* **Key Features:**
    * **Separation of Concerns:** Logic is decoupled from the UI (MVC pattern).
    * **Error Handling:** Safe division-by-zero checks and input validation.
    * **UI:** Responsive ConstraintLayout implementation.

### **Module 2: Energy-Efficient Sensor Reader**
* **Location:** `/SensorApp`
* **Description:** An application that monitors real-time device accelerometer data (X, Y, Z).
* **Engineering Highlight:**
    * This app implements **Battery-Aware Sensing**.
    * It strictly adheres to the `Activity` lifecycle, registering sensors in `onResume` and unregistering in `onPause`.
    * *Why?* Continuous sensing drains battery. This approach prevents "wake locks" and ensures the sensor sleeps when the app is minimized, aligning with mobile computing research standards.

### **Module 3: Technical Documentation**
* **Location:** `/Task3_Blog/Reading_Android_Sensors.md`
* **Title:** *Optimizing Mobile Sensing: A Research-Backed Approach to Android Accelerometers*
* **Content:** A technical article explaining the theoretical engineering behind Module 2. It cites academic research (Khan et al., Yurur et al.) to validate the battery optimization strategies used in the code.

---

## 🚀 How to Run the Projects

1.  **Clone the Repository:**
    ```bash
    git clone [https://github.com/](https://github.com/)[YourUsername]/Android-Developer-Assessment.git
    ```
2.  **Open in Android Studio:**
    * Open Android Studio -> File -> Open.
    * Select either `CalculatorApp` or `SensorApp`.
3.  **Build & Run:**
    * Wait for Gradle Sync to complete.
    * Select your Emulator (Minimum SDK: API 24).
    * Click **Run**.

---

## 🛠 Tech Stack
* **Language:** Java (OpenJDK 18)
* **IDE:** Android Studio / VS Code
* **Build System:** Gradle
* **Min SDK:** API 24 (Nougat)

---
*Thank you for reviewing my submission. I look forward to discussing these implementations further.*