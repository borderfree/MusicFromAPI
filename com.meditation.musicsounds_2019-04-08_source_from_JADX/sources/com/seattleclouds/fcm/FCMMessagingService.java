package com.seattleclouds.fcm;

import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.seattleclouds.util.C6645y;

public class FCMMessagingService extends FirebaseMessagingService {
    /* renamed from: a */
    public void mo16265a(RemoteMessage remoteMessage) {
        super.mo16265a(remoteMessage);
        Bundle extras = remoteMessage.mo16269a().getExtras();
        if (extras != null) {
            C6645y.m32101a(getApplicationContext(), extras);
        }
    }
}
