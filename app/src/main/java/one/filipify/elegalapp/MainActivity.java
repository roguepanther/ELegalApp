package one.filipify.elegalapp;

import androidx.appcompat.app.AppCompatActivity;
import static ie.imobile.extremepush.PushConnector.isXpushMessage;
import static ie.imobile.extremepush.PushConnector.mPushConnector;
import ie.imobile.extremepush.PushConnector;

import android.os.Bundle;
import android.view.Menu;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String tester = "1234";
        int newInt = Integer.parseInt(tester);

        PushConnector.mPushConnector.setUser("Alex");
        PushConnector.mPushConnector.hitEvent("filip_test_event");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        PushConnector.mPushConnector.inflateInboxMenuItem(menu, this);
        return true;
    }
}