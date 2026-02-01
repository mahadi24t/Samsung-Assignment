package com.example.calculatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // 1. Declare UI Variables
    private EditText etNum1, etNum2;
    private TextView tvResult;
    private Button btnAdd, btnSub, btnMul, btnDiv;
    
    // 2. Instantiate our Logic Class
    private CalculatorLogic calculator = new CalculatorLogic();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 3. Initialize Views (Link Java variables to XML IDs)
        etNum1 = findViewById(R.id.etNumber1);
        etNum2 = findViewById(R.id.etNumber2);
        tvResult = findViewById(R.id.tvResult);
        
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);

        // 4. Set Click Listeners (Using 'this' because we implemented View.OnClickListener)
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        // 5. Get Input Strings
        String strNum1 = etNum1.getText().toString();
        String strNum2 = etNum2.getText().toString();

        // 6. Basic Validation: Don't crash if fields are empty!
        if (strNum1.isEmpty() || strNum2.isEmpty()) {
            Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
            return;
        }

        // 7. Parse numbers
        double n1 = Double.parseDouble(strNum1);
        double n2 = Double.parseDouble(strNum2);
        double result = 0;

        // 8. Determine which button was clicked
        int id = view.getId();
        
        if (id == R.id.btnAdd) {
            result = calculator.add(n1, n2);
        } else if (id == R.id.btnSub) {
            result = calculator.subtract(n1, n2);
        } else if (id == R.id.btnMul) {
            result = calculator.multiply(n1, n2);
        } else if (id == R.id.btnDiv) {
            result = calculator.divide(n1, n2);
            // Handle Divide by Zero
            if (Double.isNaN(result)) {
                tvResult.setText("Error: Cannot divide by zero"); 
                return;
            }
        }

        // 9. Display Result
        tvResult.setText("Result: " + result);
    }
}