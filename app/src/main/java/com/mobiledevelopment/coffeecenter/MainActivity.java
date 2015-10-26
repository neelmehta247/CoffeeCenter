package com.mobiledevelopment.coffeecenter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    Button button;
    TextView textView;
    EditText editText;
    Spinner spinner;
    String[] coffeeTypes = {"Java", "Mocha", "Espresso", "Latte"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);
        spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, coffeeTypes);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        button.setOnClickListener(this);

        textView.setText(String.valueOf(R.id.button));

        button.requestFocus();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button) {
            textView.setText(editText.getText());
        }
    }
}
