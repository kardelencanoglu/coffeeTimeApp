package com.kardelen.coffeetime.login;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.kardelen.coffeetime.R;
import com.kardelen.coffeetime.Utils;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.setUpFullscreen(getWindow().getDecorView());
        setContentView(R.layout.activity_register);
    }

    public void onLoginClick(View View){
        startActivity(new Intent(this, LoginActivity.class));
        overridePendingTransition(R.anim.slide_in_left,R.anim.stay);

    }

    @Override
    public void onBackPressed() {

    }
}