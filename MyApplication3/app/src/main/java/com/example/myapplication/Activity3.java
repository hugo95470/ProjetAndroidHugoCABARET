package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.app.ComponentActivity;

public class Activity3 extends ActivityAbstract {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_3);

       /* TextView NonStaticView = (TextView) findViewById(R.id.textView);

        NonStaticView.setText("Variable non static : " + String.valueOf(super.VarNonStatic));

        Activity3 MaClassAbstract = new Activity3();

        TextView StaticView = (TextView) findViewById(R.id.textView2);

        StaticView.setText("tstttset");
*/

    }

    public void SetNonStaticVar(int Var) {
        super.VarNonStatic += 10;

        TextView NonStaticView = (TextView) findViewById(R.id.textView);

        NonStaticView.setText("Variable non static : " + String.valueOf(super.VarNonStatic));
    }

    public  int GetNonStaticVar() {
        return super.VarNonStatic;
    }

    public  void SetStaticVar() {

        Activity3 MaClassAbstract = new Activity3();

        MaClassAbstract.SetStaticVar(MaClassAbstract.GetStaticVar() + 10);

        TextView StaticView = (TextView) findViewById(R.id.textView2);

        StaticView.setText("Variable static : " + String.valueOf(MaClassAbstract.GetStaticVar()));

    }

    public  int GetStaticVar() {

        Activity3 MaClassAbstract = new Activity3();

        return MaClassAbstract.GetStaticVar();

    }


    public void goToActivity4(View view){

        Log.e("DEVE0304", "Button clicked");

        Intent intent = new Intent(view.getContext(), Activity4.class);
        view.getContext().startActivity(intent);
    };

}
