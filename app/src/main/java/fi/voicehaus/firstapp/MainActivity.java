package fi.voicehaus.firstapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.MessageFormat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton = findViewById(R.id.addButton);
        addButton.setOnClickListener(v -> {
            EditText firstNumEditText = findViewById(R.id.firstNumEditText);
            EditText secondNumEditText = findViewById(R.id.secondNumEditText);
            TextView resultTextView = findViewById(R.id.resultTextView);

            int num1 = Integer.parseInt(firstNumEditText.getText().toString());
            int num2 = Integer.parseInt(secondNumEditText.getText().toString());
            int result = num1 + num2;
            resultTextView.setText(MessageFormat.format("{0}", result));
        });
    }
}
