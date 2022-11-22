package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null) {
            Toast.makeText(this,
                    bundle.getString(MainActivity.VALUE),
                    Toast.LENGTH_LONG).show();
        }
    }
}