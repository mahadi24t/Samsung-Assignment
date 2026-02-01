# Samsung R&D Institute Bangladesh - Internship Recruitment Task

**Candidate: Md. Mahadi Hasan** 
**Role:** Developer Evangelist / Android Developer
**Language:** Java

---

## 📂 Project Overview
This repository contains the solutions for the three assessment tasks. Each application has been developed using **native Android (Java)** with a focus on clean architecture, battery efficiency, and research-backed optimization.

### **Task 1: Calculator Application**
* **Location:** `/CalculatorApp`
* **Description:** A robust calculator implementing standard arithmetic operations (+, -, *, /).
* **Key Features:**
    * **Separation of Concerns:** Logic is decoupled from the UI (MVC pattern).
    * **Error Handling:** Safe division-by-zero checks and input validation.
    * **UI:** Clean ConstraintLayout implementation.

### **Task 2: Sensor Reader (Accelerometer)**
* **Location:** `/SensorApp`
* **Description:** An application that reads real-time X, Y, Z coordinates from the device accelerometer.
* **Engineering Highlight:**
    * This app implements **Energy-Efficient Sensing**.
    * It adheres to the `Activity` lifecycle, registering sensors in `onResume` and unregistering in `onPause`.
    * *Why?* Continuous sensing drains battery. This approach prevents "wake locks" and ensures the sensor sleeps when the app is minimized, as recommended in mobile computing literature.

### **Task 3: Developer Evangelist Blog Post**
* **Location:** `/Task3_Blog/Reading_Android_Sensors.md`
* **Title:** *Optimizing Mobile Sensing: A Research-Backed Approach to Android Accelerometers*
* **Content:** A technical tutorial explaining how to build the Task 2 app. It cites academic research (Khan et al., Yurur et al.) to explain the theoretical importance of battery life optimization in mobile sensing.

---

## 🚀 How to Run the Projects

1.  **Clone the Repository:**
    ```bash
    git clone [https://github.com/](https://github.com/)[YourUsername]/Samsung-Assignment.git
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