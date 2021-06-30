package com.example.wepart30june;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText medtxt1;
    private EditText medtxt2;
    private EditText medtxt3;
    private Button mbtn;
    private String emailvalidation= "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isEmailval=isemail();
                boolean ispassval=ispasswordvalid();
               if( isEmailval && ispassval){
                   Intent intent =new Intent(MainActivity.this,MainActivity2.class);
                   intent.putExtra("username",medtxt1.getText().toString());
                   startActivity(intent);
               }

            }
        });
    }
    private void initViews(){
        medtxt1=findViewById(R.id.edtxt1);
        medtxt2=findViewById(R.id.edtxt2);
        medtxt3=findViewById(R.id.edtxt3);
        mbtn=findViewById(R.id.btn);
    }
    private boolean isemail() {
        if (medtxt2.getText().toString().matches(emailvalidation)) {
            return true;
        } else {
            medtxt2.setError("Invalid email");
            return false;
        }

    }
        private boolean ispasswordvalid(){
            if(medtxt3.getText().toString().length()>=6){
                return true;
            }else{
                medtxt3.setError("password is less than 6 character");
                return false;


            }




        }



    }


