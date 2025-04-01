package com.example.healthcare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDetailsActivity extends AppCompatActivity {
    private String[][] doctor_details1 =
            {
                    {"Doctor Name : Dr. Manoj Kishor Chhotray","Hospital Address : Apollo Hospitals, Gajapati Nagar, Bhubaneswar", "Specialty :General Physician", "Experience : 54 years","1000"},
                    {"Doctor Name : Dr. Amitav Mohanty", "Hospital Address : Apollo Hospitals, Gajapati Nagar, Bhubaneswar", "Specialty :General Physician", "Experience : 36 years","1000"},
                    {"Doctor Name : Dr. Debashis Maikap","Hospital Address : Kalinga Institute Of Medical Sciences, Patia, Bhubaneswar", "Specialty :General Physician", "Experience : 14 years","800"},
                    {"Doctor Name : Dr. Salil Kumar Parida","Hospital Address : Apollo Hospitals, Gajapati Nagar, Bhubaneswar", "Specialty :General Physician", "Experience : 22 years","600"},
                    {"Doctor Name : Dr. S. Hari Sankara Patra", "Hospital Address : Kalinga Hospital, Bhubaneswar", "Specialty :Ophthalmology (Eye)", "Experience : 16 years","1000"},
                    {"Doctor Name : Dr. Samarendra Behera", "Hospital Address : Kalinga Hospital, Bhubaneswar", "Specialty :ENT (Ear, Nose, Throat)", "Experience : 8 years","1000"},
                    {"Doctor Name : Dr. Rangadhar Satapathy", "Hospital Address : Multicare Homeopathy Clinic, Chandrasekharpur, Bhubaneswar", "Specialty : Orthopedic (Homeopathy)", "Experience : 16 years","400"},
                    {"Doctor Name : Dr. Sanjeev Patnaik", "Hospital Address : Kalinga Hospital, Bhubaneswar	", "Specialty : Orthopedic Surgery (Bones)", "Experience : 23 years","1000"},
                    {"Doctor Name : Dr. Jagannath Sahoo", "Hospital Address : IMS & Sum Hospital, Bhubaneswar ", "Specialty : Orthopedic Surgery (Bones)", "Experience : 9 years","1000"},
                    {"Doctor Name : Dr. Bishnu Prasad Patro	", "Hospital Address : IMS & Sum Hospital, Bhubaneswar ", "Specialty : Orthopedic Surgery (Bones)", "Experience : 17 years","1000"},
                    {"Doctor Name : Dr. Shivabrata Dhal Mohapatra", "Hospital Address : Kalinga Hospital, Bhubaneswar", "Specialty :Gastroenterology (Stomach)", "Experience : 6 years","800"},

            };
    private String[][] doctor_details2 =
            {
                    {"Doctor Name : Dr. Sunita Sahoo", "Hospital Address : Restora HealthCare, Gajapati Nagar, Bhubaneswar", "Specialty : Dietician", "Experience : 19 years", "1000"},
                    {"Doctor Name : Dt. Swati Mohapatra", "Hospital Address : Swati Mohapatra Dietician Clinic, Khandagiri, Bhubaneswar", "Specialty : Dietician", "Experience : 19 years", "850"},
                    {"Doctor Name : Dt. Trupti Padhi", "Hospital Address :Dt. Trupti's Diet Consultancy, Chandrasekharpur, Bhubaneswar", "Specialty : Dietician", "Experience : 23 years", "500"},
                    {"Doctor Name : Dt. Ankita Chowdhury Nandi", "Hospital Address : The Wellness Jar, Dumuduma, Bhubaneswar", "Specialty : Dietician", "Experience : 14 years", "300"},
                    {"Doctor Name : Dt. Anmayee Nanda", "Hospital Address : Hi-Tech Medical College and Hospital, Bhubaneswar", "Specialty : Dietician", "Experience : 14 years", "350"},
                    {"Doctor Name : Dt. Suryasikha Mohanty", "Hospital Address : Dt. Suryasikha Mohanty's Clinic, Kalinga Nagar, Bhubaneswar", "Specialty : Dietician", "Experience : 14", "600"},
                    {"Doctor Name : Dr. Priyambada Sahoo", "Hospital Address : Apollo Sugar Clinics, Bhubaneshwar", "Specialty : Dietician", "Experience : 10+ years", "500"},
                    {"Doctor Name : Mr. Ajit Kumar Prusty", "Hospital Address : Newlife Wellness Centre, Nageswar Tangi, Bhubaneswar", "Specialty : Dietician", "Experience : 12 years","200"}
            };
    private String[][] doctor_details3 =
            {
                    {"Doctor Name: Dr. Smruti Ranjan Behera", "Hospital Address: Hi-Tech Dental College & Hospital, Pandara, Bhubaneswar", "Specialty : Dentist", "Experience: 15 years", "800"},
                    {"Doctor Name: Dr. Satyajit Dash", "Hospital Address: Kalinga Institute of Dental Sciences, Patia, Bhubaneswar", "Specialty : Dentist", "Experience: 12 years", "700"},
                    {"Doctor Name: Dr. Anuradha Pati", "Hospital Address: Dental Spa, Saheed Nagar, Bhubaneswar", "Specialty : Dentist", "Experience: 10 years", "600"},
                    {"Doctor Name: Dr. Debashis Mishra", "Hospital Address: The Dental Clinic, Nayapalli, Bhubaneswar", "Specialty : Dentist", "Experience: 8 years", "500"},
                    {"Doctor Name: Dr. Priyadarshini Nayak", "Hospital Address: Smile Dental Care, Jayadev Vihar, Bhubaneswar", "Specialty : Dentist", "Experience: 7 years", "550"},
                    {"Doctor Name: Dr. Subrat Kumar Sahoo", "Hospital Address: Dent-O-Care, Kharabela Nagar, Bhubaneswar", "Specialty : Dentist", "Experience: 6 years", "450"},
                    {"Doctor Name: Dr. Rajashree Mohanty", "Hospital Address: Happy Smile Dental Clinic, Chandrasekharpur, Bhubaneswar", "Specialty : Dentist", "Experience: 5 years", "400"},
                     {"Doctor Name: Dr. Ankit Kumar", "Hospital Address: Sparkle Dental Studio, Patrapada, Bhubaneswar", "Specialty : Dentist", "Experience: 4 years", "350"}
            };
    private String[][] doctor_details4 =
            {
                    {"Doctor Name: Dr. Jagadananda Mishra", "Hospital Address: SUM Hospital, K-8, Kalinga Nagar, Ghatikia, Bhubaneswar", "Experience: 8years", "Specialty: General Surgeon", "800"},
                    {"Doctor Name: Dr. Prakash Kumar Sahoo", "Hospital Address: SUM Hospital, K-8, Kalinga Nagar, Ghatikia, Bhubaneswar", "Experience: 10years", "Specialty: General Surgeon", "700"},
                    {"Doctor Name: Dr. Deepak Kumar Benia", "Hospital Address: IMS & SUM Hospital, K-8, Kalinga Nagar, Ghatikia, Bhubaneswar", "Experience: 5 years", "Specialty: Orthopedic Surgeon", "1,000"},
                    {"Doctor Name: Dr. Kishan Kishan", "Hospital Address: IMS & SUM Hospital, K-8, Kalinga Nagar, Ghatikia, Bhubaneswar", "Experience: 14 years", "Specialty: Orthopedic Surgeon", "1,100"},
                    {"Doctor Name: Dr. Pradeep Kumar Jena", "Hospital Address: KIMS Hospital, Baramunda, Bhubaneswar", "Experience: 22 years", "Specialty: Neurosurgeon", "1,200"},
                    {"Doctor Name: Dr. Satyaprakash Mishra", "Hospital Address: KIMS Hospital, Baramunda, Bhubaneswar", "Experience: 18 years", "Specialty: General Surgeon", "900"},
                    {"Doctor Name: Dr. Rajeev Kumar", "Hospital Address: Apollo Hospitals, Gajapati Nagar, Bhubaneswar", "Experience: 20 years", "Specialty: Cardiac Surgeon", "1,500"},
                    {"Doctor Name: Dr. Nidhi Rathi", "Hospital Address: Apollo Hospitals, Gajapati Nagar, Bhubaneswar", "Experience: 15 years", "Specialty: Plastic Surgeon", "1,000"},
                    {"Doctor Name: Dr. Suman K. Behera", "Hospital Address: Kalinga Institute of Medical Sciences (KIMS), Patia, Bhubaneswar", "Experience: 25 years", "Specialty: Orthopedic Surgeon", "1,100"},
                    {"Doctor Name: Dr. Abhishek Mohapatra", "Hospital Address: Kalinga Hospital, Bhubaneswar", "Experience: 16 years", "Specialty: General Surgeon", "800"}
            };
    private  String[][] doctor_details5 =
            {
                    {"Doctor Name: Dr. Prasant Kumar Sahoo", "Hospital Address: Apollo Hospitals, Gajapati Nagar, Bhubaneswar", "Specialty : Cardiologist", "Experience: 37 years", "1,000"},
                    {"Doctor Name: Dr. P C Rath", "Hospital Address: Apollo Hospitals, Gajapati Nagar, Bhubaneswar", "Specialty : Cardiologist", "Experience: 36 years", "1,000"},
                    {"Doctor Name: Dr. Byomakesh Dikshit", "Hospital Address: Apollo Hospitals, Gajapati Nagar, Bhubaneswar", "Specialty : Cardiologist", "Experience: 8 years", "1,000"},
                    {"Doctor Name: Dr. Brajaraj Das", "Hospital Address: Apollo Hospitals, Gajapati Nagar, Bhubaneswar", "Specialty : Cardiologist", "Experience: 25 years", "1,000"},
                    {"Doctor Name: Dr. Ashutosh Kumar", "Hospital Address: CARE Hospitals, Bhubaneswar", "Specialty : Cardiologist", "Experience: 17 years", "900"},
                    {"Doctor Name: Dr. Bikram Keshari Mohapatra", "Hospital Address: CARE Hospitals, Bhubaneswar", "Specialty : Cardiologist", "Experience: 10+ years", "800"},
                    {"Doctor Name: Dr. Debasish Mohapatra", "Hospital Address: CARE Hospitals, Bhubaneswar", "Specialty : Cardiologist", "Experience: 10+ years", "850"},
                    {"Doctor Name: Dr. Giridhari Jena", "Hospital Address: CARE Hospitals, Bhubaneswar", "Specialty : Cardiologist", "Experience: 5 years", "900"},
                    {"Doctor Name: Dr. Kanhu Charan Mishra", "Hospital Address: CARE Hospitals, Bhubaneswar", "Specialty : Cardiologist", "Experience: 05+ years", "850"},
                    {"Doctor Name: Dr. Sushil Kumar", "Hospital Address: KIMS Hospital, Baramunda, Bhubaneswar", "Specialty : Cardiologist", "Experience: 15 years", "1,000"},
                    {"Doctor Name: Dr. Satyaprakash Mishra", "Hospital Address: KIMS Hospital, Baramunda, Bhubaneswar", "Specialty : Cardiologist", "Experience: 18 years", "1,000"},
                    {"Doctor Name: Dr. Rajeev Kumar", "Hospital Address: SUM Hospital, K-8, Kalinga Nagar, Ghatikia, Bhubaneswar", "Specialty : Cardiologist", "Experience: 20 years", "1,100"}
            };

    TextView tv;
    Button btn;
    String[][] doctor_details = {};
    HashMap<String,String> item;
    ArrayList List;
    SimpleAdapter sa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_doctor_details);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btn = findViewById(R.id.buttonODBack);
        tv = findViewById(R.id.textViewODtittle);
        Intent it = getIntent();
        String tittle = it.getStringExtra("tittle");
        tv.setText(tittle);

        if(tittle.compareTo("Family Physician")==0)
            doctor_details = doctor_details1;
        else
        if(tittle.compareTo("Dietician")==0)
            doctor_details = doctor_details2;
        else
        if(tittle.compareTo("Dentist")==0)
            doctor_details = doctor_details3;
        else
        if(tittle.compareTo("Surgeon")==0)
            doctor_details = doctor_details4;
        else
        if(tittle.compareTo("Cardiologist")==0)
            doctor_details = doctor_details5;


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DoctorDetailsActivity.this,FindDoctor_Activity.class));
            }
        });
        List = new ArrayList();
        for (int i = 0;i<doctor_details.length;i++){
            item = new HashMap<String,String>();
            item.put("line1", doctor_details[i][0]);
            item.put("line2", doctor_details[i][1]);
            item.put("line3", doctor_details[i][2]);
            item.put("line4", doctor_details[i][3]);
            item.put("line5", "Consultant fee : "+doctor_details[i][4]+"/-rupees");
            List.add(item);
        }
        sa = new SimpleAdapter(this,List,
                R.layout.multi_lines,new String[]{"line1","line2","line3","line4","line5"},
                new int[]{R.id.line_a,R.id.line_b,R.id.line_c,R.id.line_d,R.id.line_e});
        ListView lst = findViewById(R.id.listViewOD);
        lst.setAdapter(sa);
    }
}