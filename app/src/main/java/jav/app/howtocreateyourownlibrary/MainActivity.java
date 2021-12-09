package jav.app.howtocreateyourownlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import jav.app.toaster.ToastAMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToastAMessage.s(MainActivity.this,"helllo");
    }
}