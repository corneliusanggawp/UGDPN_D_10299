package com.example.ugdpn_d_10299;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class NotificationReceiver {
    public void onReceive(Context context, Intent intent)
    {
        String message = intent.getStringExtra("toastMessage");
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }
}