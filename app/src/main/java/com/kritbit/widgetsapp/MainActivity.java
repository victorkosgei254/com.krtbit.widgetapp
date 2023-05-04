package com.kritbit.widgetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView company_name;
    EditText company_message;
    Button send_msg;
    ImageView company_logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //All widgets are instantiated here
        company_name = findViewById(R.id.textView);
        company_message = findViewById(R.id.messageBox);
        send_msg = findViewById(R.id.send_msg_btn);
        company_logo = findViewById(R.id.logo);

        //Handling the click event on buttons
        send_msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String text = company_message.getText().toString();
               Toast.makeText(MainActivity.this, text, Toast.LENGTH_LONG).show();
               company_message.setText("");
            }
        });
    }
}