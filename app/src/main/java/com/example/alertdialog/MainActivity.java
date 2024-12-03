package com.example.alertdialog;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // קישור האלמנטים של ה-UI
        EditText editText = findViewById(R.id.editText);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // יצירת AlertDialog
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Wow")
                        .setMessage("Awesome")
                        .setPositiveButton("Yes", (dialog, which) -> {
                            // קריאה לטקסט מה-EditText והצגת Toast
                            String input = editText.getText().toString();
                            Toast.makeText(MainActivity.this, "You wrote: " + input, Toast.LENGTH_SHORT).show();
                        })
                        .setNegativeButton("Cancel", (dialog, which) -> {
                            // לא קורה כלום
                        });
                // הצגת הדיאלוג
                builder.show();
            }
        });
    }
}