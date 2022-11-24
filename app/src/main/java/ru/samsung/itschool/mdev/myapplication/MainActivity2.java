package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private Button btn;
    private EditText editText;
    public static final int CODE = 200;
    public static final String KEY2 = "key2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null) {
            String data = bundle.getString(MainActivity.VALUE); // Hello hello
            Toast.makeText(this,
                    data,
                    Toast.LENGTH_LONG).show();
        }
        btn = findViewById(R.id.button3);
        editText = findViewById(R.id.editTextTextPersonName);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra(KEY2,editText.getText().toString());
                setResult(CODE,intent);
                finish(); // активность завершает работу
            }
        });


    }
}