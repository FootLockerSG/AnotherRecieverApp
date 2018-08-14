package sg.edu.rp.c346.anotherrecieverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AnotherBroadcastReciever extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Recieved in AnotherBroadCastReciever",
                Toast.LENGTH_LONG).show();
    }
}
