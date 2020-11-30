package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Activity4 extends ActivityAbstract{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_4);

    }

    public  void SetNonStaticVar(int Var) {
        super.VarNonStatic = Var;
    }

    public  int GetNonStaticVar() {
        return super.VarNonStatic;
    }

    public  void SetStaticVar(int Var) {

        Activity3 MaClassAbstract = new Activity3();

        MaClassAbstract.SetStaticVar(Var);

    }

    public  int GetStaticVar() {

        Activity3 MaClassAbstract = new Activity3();

        return MaClassAbstract.GetStaticVar();

    }

    public void goToActivity3(View view){

        Log.e("DEVE0304", "Button clicked");

        Intent intent = new Intent(view.getContext(), Activity3.class);
        view.getContext().startActivity(intent);
    };

}
