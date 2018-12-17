package com.example.shimazakishota.broadcastreciver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.widget.Toast;

public class TimezoneBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent){
        Toast.makeText(context,"タイムゾーンが変化しました",Toast.LENGTH_LONG).show();

    }
}
