package fi.voicehaus.firstapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);

        if (getIntent().hasExtra("fi.voicehaus.firstapp.SOMETHING")) {
            TextView tv = (TextView) findViewById(R.id.textViewHelloWorld);
            String text = Objects.requireNonNull(getIntent().getExtras()).getString("fi.voicehaus.firstapp.SOMETHING");
            tv.setText(text);
        }
    }
}
