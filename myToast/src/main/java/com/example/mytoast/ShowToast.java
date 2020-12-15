package com.example.mytoast;

import android.content.Context;
import android.widget.Toast;

public class ShowToast {

    public static void tampilToast(String text, Context context){
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }

}
