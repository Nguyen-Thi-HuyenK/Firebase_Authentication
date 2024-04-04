# Android application in Kotlin that features user authentication with Firebase Authentication

### This is a simple app that is done based on the requirements of the course "Advanced Android Programming"
#### The app has 3 screens: 
- Register a new user with email and password, the user's information will be saved to the Firebase database
- Login with email and password using the Firebase authentication feature
- After logging in successfully the app will automatically navigate to the user's info screen which displays the user's email and a masked password
#### 1. Register a new user
![Register](https://github.com/Nguyen-Thi-HuyenK/Firebase_Authentication/blob/master/assets/SignUp.jpg)
#### 2. Display the message "Login Unsuccessfully" if the email and/or password is incorrect 
![Login Unsuccessfully](https://github.com/Nguyen-Thi-HuyenK/Firebase_Authentication/blob/master/assets/Login-fail.jpg)
#### 3. Display the message "Login Successfully" if the email and password are correct, and automatically navigate to the user info screen which displays the user's email and masked password.
![Login Successfully](https://github.com/Nguyen-Thi-HuyenK/Firebase_Authentication/blob/master/assets/Screenshot_20240401-164202_Android_Login.jpg)
## Getting Started
### Prerequisites
- Android Studio
- Git
### Clone the Repository
To get started with the Firebase_Authentication Application, clone the repository to your local machine:
git clone
```bash
https://github.com/Nguyen-Thi-HuyenK/Firebase_Authentication.git
```
### Import Project into Android Studio
Open Android Studio and select "Open an existing project". Navigate to the directory where you 
cloned the repository and select the "Firebase_Authentication" directory. Android Studio will then import the project for you.
### Build and Run the Project
Build and run the project in Android Studio. The app should compile and install on your device 
or emulator. You should see the first screen which displays the Login.
