package com.somitsolutions.training.android.musicservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MusicPlayerStatusBroadcastReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context arg0, Intent arg1) {
		// TODO Auto-generated method stub
		if(MusicServiceClient.getMusicPlayerClientActivityContext()!=null){
			Toast.makeText( MusicServiceClient.getMusicPlayerClientActivityContext(), "Thank you for listening... Hope you have enjoyed...", Toast.LENGTH_LONG).show();
		}
		
	}

}
