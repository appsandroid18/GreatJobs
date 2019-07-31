package com.id.man.greatjobs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class Tes1Activity extends AppCompatActivity {

    private long backPressedTime;
    private Toast backToast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_tes1);
    }



    public void btn_submit(View v){
        //TODO Auto-generated method stub
        Intent i = new Intent (getApplicationContext(), RekomendasiActivity.class);
        startActivity(i);
        finish();
    }

    public void btn_back(View v) {
        //TODO Auto-generated method stub
        Intent i = new Intent(getApplicationContext(), TestListActivity.class);
        startActivity(i);
        finish();
    }



    @Override
    public void onBackPressed(){
        //super.onBackPressed();
        Intent i = new Intent(this, TestListActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();
    }
}
