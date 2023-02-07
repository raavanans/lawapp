package com.example.actapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {



        String status = checkinternet.getNetworkInfo(context);
        if(status.equals("connected")){
            Toast.makeText(context,"Internet connected",Toast.LENGTH_LONG).show();;
        }
        else if (status.equals("disconnected")){
            Toast.makeText(context,"Internet disconnected",Toast.LENGTH_LONG).show();;
        }

    }

}