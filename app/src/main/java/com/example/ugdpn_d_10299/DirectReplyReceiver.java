package com.example.ugdpn_d_10299;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.core.app.RemoteInput;

public class DirectReplyReceiver extends BroadcastReceiver {

    public void onReceive(Context context, Intent intent)
    {
        String message = intent.getStringExtra("toastMessage");
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
        Bundle remoteInput = RemoteInput.getResultsFromIntent(intent);

        if (remoteInput !=null){
            CharSequence replyText = remoteInput.getCharSequence("key_text_reply");
            Message jawab = new Message(replyText,null);
            MainActivity.MESSAGES.add(jawab);

            MainActivity.sendChannel5Notification(context);
        }
    }
}
