package com.example.foodx;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginSignupPage extends AppCompatActivity {

    private Button signup;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_signup_page);
    }

    public void loginFunc(View view){
//        login = (Button) findViewById(R.id.login_button);
//        login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                loginPage();
//            }
//        });
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
//    public void loginPage(){
//        Intent intent = new Intent(this, Login.class);
//        startActivity(intent);
//    }

    public void signupFunc(View view){
//        signup = (Button) findViewById(R.id.signup_button);
//        signup.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//               signUpPage();
//            }
//        });
        Intent intent = new Intent(this, com.example.foodx.SignUp.class);
        startActivity(intent);
    }

//    public void signUpPage(){
//        Intent intent = new Intent(this, SignUp.class);
//        startActivity(intent);
//    }
}
