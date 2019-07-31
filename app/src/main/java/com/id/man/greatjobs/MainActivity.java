package com.id.man.greatjobs;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private long backPressedTime;
    private Toast backToast;
    SharedPreferences sharedpreferences;
    public static final String my_shared_preferences = "my_shared_preferences";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        sharedpreferences = getSharedPreferences(my_shared_preferences, Context.MODE_PRIVATE);
    }

    public void btn_1(View v){
        //TODO Auto-generated method stub
        Intent i = new Intent (getApplicationContext(), LamaranActivity.class);
        startActivity(i);
        finish();
    }

    public void btn_2(View v){
        //TODO Auto-generated method stub
        Intent i = new Intent (getApplicationContext(), TawaranActivity.class);
        startActivity(i);
        finish();
    }

    public void btn_3(View v){
        //TODO Auto-generated method stub
        Intent i = new Intent (getApplicationContext(), IklanActivity.class);
        startActivity(i);
        finish();
    }

    public void btn_more(View v){
        //TODO Auto-generated method stub
        Toast.makeText(MainActivity.this, "No more recomendation", Toast.LENGTH_SHORT).show();

    }


    @Override
    public void onBackPressed(){
        AlertDialog.Builder altdial = new AlertDialog.Builder(MainActivity.this);
        altdial.setMessage("Apakah Anda Yakin ?").setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {


                        MainActivity.super.onBackPressed();
                        finish();
                        System.exit(0);
                        return;
                    }
                })
                .setNeutralButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        dialogInterface.cancel();
                    }
                });

        AlertDialog alert = altdial.create();
        alert.setTitle("Keluar");
        alert.show();
/*
        if(backPressedTime +2000 > System.currentTimeMillis()){
            backToast.cancel();
            super.onBackPressed();
            finish();
            System.exit(0);
            return;
        }else{



            backToast = Toast.makeText(getBaseContext(), "Please press Back again to Exit", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();
*/
    }
}
