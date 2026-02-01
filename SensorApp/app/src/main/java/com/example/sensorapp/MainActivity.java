package com.example.sensorapp;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    // 1. Declare Variables
    private SensorManager sensorManager;
    private Sensor accelerometer;
    private TextView tvX, tvY, tvZ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2. Link UI Components
        tvX = findViewById(R.id.tvX);
        tvY = findViewById(R.id.tvY);
        tvZ = findViewById(R.id.tvZ);

        // 3. Initialize Sensor Service
        // We ask the Android System: "Give us access to the phone's sensors"
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        
        // 4. Get the Specific Sensor (Accelerometer)
        if (sensorManager != null) {
            accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        }
    }

    // --- The "Battery Safe" Life Cycle Methods ---

    @Override
    protected void onResume() {
        super.onResume();
        // Register the listener ONLY when the app is open
        if (accelerometer != null) {
            sensorManager.registerListener(this, accelerometer, SensorManager.SENSOR_DELAY_NORMAL);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Unregister ONLY when the app is minimized (Saves Battery!)
        sensorManager.unregisterListener(this);
    }

    // --- Sensor Event Listener Methods ---

    @Override
    public void onSensorChanged(SensorEvent event) {
        // This runs every time the sensor detects movement
        if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            float x = event.values[0];
            float y = event.values[1];
            float z = event.values[2];

            // Update UI
            tvX.setText("X: " + String.format("%.2f", x));
            tvY.setText("Y: " + String.format("%.2f", y));
            tvZ.setText("Z: " + String.format("%.2f", z));
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        // Not needed for this task, but required by the interface
    }
}