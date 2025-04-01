// Register_Activity.java
package com.example.healthcare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Register_Activity extends AppCompatActivity {

    EditText edUsername, edEmail, edPassword, edConfirm;
    Button btn;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        edUsername = findViewById(R.id.editTextRigUsername);
        edEmail = findViewById(R.id.editTextRigEmail);
        edPassword = findViewById(R.id.editTextRigPassword);
        edConfirm = findViewById(R.id.editTextRigConfirmPassword2);
        tv1 = findViewById(R.id.textViewuserExist);
        btn = findViewById(R.id.buttonRegister); // Corrected ID

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = edUsername.getText().toString();
                String email = edEmail.getText().toString();
                String password = edPassword.getText().toString();
                String confirm = edConfirm.getText().toString();
                DataBase db = new DataBase(getApplicationContext(),"Nyxcare",null,1);
                if (username.length() == 0 || email.length() == 0 || password.length() == 0 || confirm.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Please fill all details!", Toast.LENGTH_SHORT).show();
                } else {
                    if (password.compareTo(confirm) == 0) {
                        if (isValid(password)) {
                            db.register(username,email,password);
                            Toast.makeText(getApplicationContext(), "Registration Successful!", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(Register_Activity.this, Login_Activity.class));
                        } else {
                            Toast.makeText(getApplicationContext(), "Password must contain at least 8 character, having letter,digit and special character!!", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "Password and Confirm Password didn't match!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Register_Activity.this, Login_Activity.class));
            }
        });
    }

    public static boolean isValid(String passwordhere) {
        int f1 = 0, f2 = 0, f3 = 0;
        if (passwordhere.length() < 8) {
            return false;
        } else {
            for (int p = 0; p < passwordhere.length(); p++) {
                if (Character.isDigit(passwordhere.charAt(p))) {
                    f1 = 1;
                }
            }
            for (int q = 0; q < passwordhere.length(); q++) {
                if (Character.isLetter(passwordhere.charAt(q))) {
                    f2 = 1;
                }
            }
            for (int r = 0; r < passwordhere.length(); r++) {
                char c = passwordhere.charAt(r);
                if (c >= 33 && c <= 46) {
                    f3 = 1;
                }
            }
            return f1 == 1 && f2 == 1 && f3 == 1;
        }
    }
}