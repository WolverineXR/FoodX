package com.example.foodx;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
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
}
