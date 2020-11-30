package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public abstract class ActivityAbstract extends AppCompatActivity {

    protected static int StaticVar;

    protected int VarNonStatic;

    public int GetStaticVar(){
        return StaticVar;
    }

    public int GetVarNonStatic(){
        return VarNonStatic;
    }

    public void SetStaticVar(int Var){
        StaticVar = Var;
    }

    public void SetVarNonStatic(int Var){
        VarNonStatic = Var;
    }

}
