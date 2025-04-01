package com.example.healthcare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FindDoctor_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_find_doctor);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        CardView exit = findViewById(R.id.cardFDback);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FindDoctor_Activity.this,Home_Activity.class));
            }
        });
        CardView familyDoctor = findViewById(R.id.cardFDFamilyDoctor);
        familyDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctor_Activity.this, DoctorDetailsActivity.class);
                it.putExtra("tittle","Family Physician");
                startActivity(it);
            }
        });
        CardView dietician = findViewById(R.id.cardFDDiet);
        dietician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctor_Activity.this, DoctorDetailsActivity.class);
                it.putExtra("tittle","Dietician");
                startActivity(it);
            }
        });
        CardView dentist = findViewById(R.id.cardFDDentist);
        dentist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctor_Activity.this, DoctorDetailsActivity.class);
                it.putExtra("tittle","Dentist");
                startActivity(it);
            }
        });
        CardView surgeon = findViewById(R.id.cardFDSurgeon);
        surgeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctor_Activity.this, DoctorDetailsActivity.class);
                it.putExtra("tittle","Surgeon");
                startActivity(it);
            }
        });
        CardView cardo = findViewById(R.id.cardFDCardiologist);
        cardo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctor_Activity.this, DoctorDetailsActivity.class);
                it.putExtra("tittle","Cardiologist");
                startActivity(it);
            }
        });
    }
}