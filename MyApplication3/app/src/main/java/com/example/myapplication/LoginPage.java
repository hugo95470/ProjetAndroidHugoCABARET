package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        Log.e("DEVE0304", "LoginPage:onCreate()");
    }

    public void erasetext(View view){


        try{
            TextView monText = (EditText)findViewById(R.id.text2);

            if(monText.getVisibility() == View.VISIBLE){
                monText.setVisibility(View.INVISIBLE);
            }else{
                monText.setVisibility(View.VISIBLE);
            }

        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }


    }




}