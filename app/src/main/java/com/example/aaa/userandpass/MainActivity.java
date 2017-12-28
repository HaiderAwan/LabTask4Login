package com.example.aaa.userandpass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.StringBufferInputStream;

public class MainActivity extends AppCompatActivity {
EditText etusername ,etpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         etusername = (EditText)findViewById(R.id.textView4);
         etpass= (EditText)findViewById(R.id.textView5);

        Button logbtn =(Button)findViewById(R.id.sign_in_btn);
        logbtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                final String userstr =etusername.getText().toString();
                final String passtr =etpass.getText().toString();

                if(userstr.equals("")||passtr.equals(""))
                {
                    Toast.makeText(MainActivity.this, "user name or password is empty",Toast.LENGTH_SHORT).show();
                }
                else if(userstr.equals(passtr))
                {
                    Toast.makeText(MainActivity.this, "user name or password is same",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
