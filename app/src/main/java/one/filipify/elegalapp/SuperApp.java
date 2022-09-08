package one.filipify.elegalapp;

import android.app.Application;
import static ie.imobile.extremepush.PushConnector.isXpushMessage;
import static ie.imobile.extremepush.PushConnector.mPushConnector;
import ie.imobile.extremepush.PushConnector;

public class SuperApp extends Application {
    public void onCreate() {
        super.onCreate();

        new PushConnector.Builder("oPogRGwrSE3tB5oAo7ynFTG2UY0ch8uh", "914533146877")
                .turnOnDebugLogs(true)
                .setDeliveryReceiptsEnabled(true)
                .setInboxEnabled(true)
                .requestNotificationPermission(true)
                .setEnableLocations(true)
                .create(this);
    }
}
