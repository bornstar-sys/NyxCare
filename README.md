# NyxCare - HealthCare Mobile Application

Overview
NyxCare is a healthcare mobile application designed to provide users with convenient access to medical services. Built using Android Studio Meerkat (2024.3.1) with Java, NyxCare aims to streamline healthcare tasks such as booking lab tests, purchasing medicines, finding doctors, and reading health articles. The app integrates with Firebase for real-time data storage and synchronization across devices.

Features :
Login & Registration: Secure user authentication with username, password, and email.
Home Dashboard: Central hub with six options:
Lab Test: Book lab tests and packages with cart and checkout functionality.
Buy Medicine: Order medicines with a similar cart-based system.
Find Doctor: Browse and book appointments with doctors (e.g., surgeons, dentists).
Health Article: View health-related articles stored as images.
Order Detail: Track booked orders and appointments.
Logout: Return to the login screen.
User-Friendly UI: Designed with Material Design principles for accessibility and ease of use.

Current Development Status
Login Page: Implemented (activity_login.xml) with username/password fields, login button, and registration link.
Next Steps: Registration page, home dashboard, and Database integrated(SQLite).
Find Doctor page is well created and page is ready to nevigate to any particular type to doctor.
Doctor details: doctor detail page is ready with details of doctor(Name, Address, Experience, Phone number, Consultation fee)
Booking Appointment page is in progress...

Technologies Used
IDE: Android Studio Meerkat (2024.3.1)
Language: Java
Database: For now using SQLite further plan to replace it with Firebase (planned for user data, orders, and appointments)
UI Framework: Android XML with ConstraintLayout,Linear layout and Relative layout.
Minimum SDK: API 21 (Android 5.0 Lollipop)

Prerequisites
To run or contribute to NyxCare, ensure you have:
Android Studio Meerkat (2024.3.1 or later)
Java Development Kit (JDK) 17 or higher
An Android device/emulator running API 35 "VanillaIceCream"; Android 15.0 NyxCare/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/yourname/nyxcare/
│   │   │   │   └── Login_Activity.java       # Login page logic
│   │   │   ├── res/
│   │   │   │   ├── drawable/                # Backgrounds and icons
│   │   │   │   ├── layout/
│   │   │   │   │   └── activity_login.xml   # Login page UI
│   │   │   │   └── values/                  # Colors, strings, etc.
│   └── build.gradle                         # App-level Gradle config
├── build.gradle                             # Project-level Gradle config
└── README.md                                # This file NyxCare/

Screenshots
https://drive.google.com/drive/folders/1soLksQKJ8__d_mqIVjPZzvgMPH63U041?usp=sharing



