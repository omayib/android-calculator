package com.kalkulator.app;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	Button bPlus, bMin, bMultiple, bDivide;
	EditText in1, in2, out;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		in1 = (EditText) findViewById(R.id.idSatu);
		in2 = (EditText) findViewById(R.id.idDua);
		out = (EditText) findViewById(R.id.idHasil);
		bPlus = (Button) findViewById(R.id.idBtnJumlah);
		bMin = (Button) findViewById(R.id.idBtnKurang);
		bMultiple = (Button) findViewById(R.id.idBtnKali);
		bDivide = (Button) findViewById(R.id.idBtnBagi);
		bPlus.setOnClickListener(this);
		bMin.setOnClickListener(this);
		bMultiple.setOnClickListener(this);
		bDivide.setOnClickListener(this);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.idBtnJumlah:
			String varangka1 = in1.getText().toString();
			String varangka2 = in2.getText().toString();
			if (!varangka1.equals("") || !varangka2.equals("")) {
				String hsl = penjumlahan(varangka1, varangka2);
				out.setText(hsl);
			} else {
				Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
			}
			break;
		case R.id.idBtnKurang:
			String a1 = in1.getText().toString();
			String a2 = in2.getText().toString();
			if (!a1.equals("") || !a2.equals("")) {
				String hsl = pengurangan(a1, a2);
				out.setText(hsl);
			} else {
				Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
			}

			break;
		case R.id.idBtnKali:
			String s1 = in1.getText().toString();
			String s2 = in2.getText().toString();
			if (!s1.equals("") || !s2.equals("")) {
				String hsl = perkalian(s1, s2);
				out.setText(hsl);
			} else {
				Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
			}

			break;
		case R.id.idBtnBagi:
			String input1 = in1.getText().toString();
			String input2 = in2.getText().toString();
			if (!input1.equals("") || !input2.equals("")) {
				String hsl = pembagian(input1, input2);
				out.setText(hsl);
			} else {
				Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
			}
			break;
		}

	}

	private String penjumlahan(String a, String b) {
		Double d1 = Double.parseDouble(a);
		Double d2 = Double.parseDouble(b);
		Double dHasil = d1 + d2;
		String sHasil = String.valueOf(dHasil);
		return sHasil;
	}

	private String pengurangan(String a, String b) {
		Double d1 = Double.parseDouble(a);
		Double d2 = Double.parseDouble(b);
		Double dHasil = d1 - d2;
		String sHasil = String.valueOf(dHasil);
		return sHasil;
	}

	private String perkalian(String a, String b) {
		Double d1 = Double.parseDouble(a);
		Double d2 = Double.parseDouble(b);
		Double dHasil = d1 * d2;
		String sHasil = String.valueOf(dHasil);
		return sHasil;
	}

	private String pembagian(String a, String b) {
		Double d1 = Double.parseDouble(a);
		Double d2 = Double.parseDouble(b);
		Double dHasil = d1 / d2;
		String sHasil = String.valueOf(dHasil);
		return sHasil;
	}

}
