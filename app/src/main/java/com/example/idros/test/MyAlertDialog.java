package com.example.idros.test;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by Bear on 12/19/2017.
 */

public class MyAlertDialog {
AlertDialog.Builder objAlertDialog;
    public void Havespace(Context context){
        objAlertDialog=new AlertDialog.Builder(context);
        objAlertDialog.setTitle("Error !!");
        objAlertDialog.setMessage("Have space"+"\n"+"Please enter your detail");
        objAlertDialog.setCancelable(false);
        objAlertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });objAlertDialog.show();
    }

}
