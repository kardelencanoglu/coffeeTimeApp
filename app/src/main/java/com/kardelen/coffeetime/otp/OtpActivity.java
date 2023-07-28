package com.kardelen.coffeetime.otp;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.kardelen.coffeetime.MainActivity;
import com.kardelen.coffeetime.R;
import com.kardelen.coffeetime.Utils;
import com.kardelen.coffeetime.login.LoginActivity;
import com.kardelen.coffeetime.login.RegisterActivity;

public class OtpActivity extends AppCompatActivity {

    Button otpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.setUpFullscreen(getWindow().getDecorView());
        setContentView(R.layout.activity_otp);

        otpButton = findViewById(R.id.otpButton);
        otpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OtpActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

    }

    public void onLoginClick(View View){
        startActivity(new Intent(this, MainActivity.class));
        overridePendingTransition(R.anim.slide_in_left,R.anim.stay);
    }


    @Override
    public void onBackPressed() {

    }
}