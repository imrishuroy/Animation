package com.sixteenbrains.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   String message;

    boolean bartIsShowing = true;
    boolean textView2 = true;
    public void fade (View view){

        Log.i("Info", "Image Pressed");
               message = "Bart Is Showing";


        ImageView bartimageView = (ImageView) findViewById(R.id.bartimageView);

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);


       ImageView homerimageView = (ImageView) findViewById(R.id.homerimageView);


     if(bartIsShowing) {

         bartIsShowing = false;

         textView2.animate().alpha(0).setDuration(500);
         textView3.animate().alpha(1).setDuration(500);


            message = "Homer Is Showing";

          bartimageView.animate().alpha(0).setDuration(2000);

          homerimageView.animate().alpha(1).setDuration(2000);

     }else {
         bartIsShowing = true;

           textView2.animate().alpha(1).setDuration(500);
            textView3.animate().alpha(0).setDuration(500);

         bartimageView.animate().alpha(1).setDuration(2000);

         homerimageView.animate().alpha(0).setDuration(2000);

        }





        Toast.makeText(this, message ,Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}