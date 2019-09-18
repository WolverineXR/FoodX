package com.example.foodx;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void homeScreenFunc(View view){
//        login = (Button) findViewById(R.id.login_button);
//        login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                homeScreenPage();
//            }
//        });
        Intent intent = new Intent(this, HomeScreen.class);
        startActivity(intent);
    }
//    public void homeScreenPage(){
//        Intent intent = new Intent(this, HomeScreen.class);
//        startActivity(intent);
//    }
}
