package com.adamino.acalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	EditText operand1;
	EditText operand2;
	Button btnPlus;
	Button btnSubtract;
	Button btnDivide;
	Button btnMultiply;
	Button btnClear;
	TextView resultText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Operand fields from the main screen
		operand1 = (EditText) findViewById(R.id.editOperand1);
		operand2 = (EditText) findViewById(R.id.editOperand2);
		
		// Associate buttons
		btnPlus = (Button) findViewById(R.id.btnPlus);
		btnSubtract = (Button) findViewById(R.id.btnSubtract);
		btnDivide = (Button) findViewById(R.id.btnDivide);
		btnMultiply = (Button) findViewById(R.id.btnMultiply);
		btnClear = (Button) findViewById(R.id.btnClear);
		
		// Associate result textField
		resultText = (TextView)findViewById(R.id.textResult);
		
		// Add functionality to process results
		btnPlus.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				float oper1 = Float.parseFloat(operand1.getText().toString());
				float oper2 = Float.parseFloat(operand2.getText().toString());
				
				float theResult = oper1 + oper2;
				resultText.setText(Float.toString(theResult));
			}
		});
		
		// Subtract calculator processing
				btnSubtract.setOnClickListener(new View.OnClickListener() {
					
			@Override
			public void onClick(View v) {
				float oper1 = Float.parseFloat(operand1.getText().toString());
				float oper2 = Float.parseFloat(operand2.getText().toString());
						
				float theResult = oper1 - oper2;
				resultText.setText(Float.toString(theResult));
			}
		});
				
		// Divide calculator processing
				btnDivide.setOnClickListener(new View.OnClickListener() {
					
			@Override
			public void onClick(View v) {
				float oper1 = Float.parseFloat(operand1.getText().toString());
				float oper2 = Float.parseFloat(operand2.getText().toString());
						
				float theResult = oper1 / oper2;
				resultText.setText(Float.toString(theResult));
			}
		});
				
		// Multiply calculator processing
				btnMultiply.setOnClickListener(new View.OnClickListener() {
					
			@Override
			public void onClick(View v) {
				float oper1 = Float.parseFloat(operand1.getText().toString());
				float oper2 = Float.parseFloat(operand2.getText().toString());
						
				float theResult = oper1 * oper2;
				resultText.setText(Float.toString(theResult));
			}
		});
				
		// Clear
				btnClear.setOnClickListener(new View.OnClickListener() {
					
			@Override
			public void onClick(View v) {
				operand1.setText("");
				operand2.setText("");
				resultText.setText("0.00");
			}
		});
				
		
	}

}
