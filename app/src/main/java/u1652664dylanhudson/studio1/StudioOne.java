package u1652664dylanhudson.studio1;

/**
 * Created by Dylan's PC on 17/03/26.
 */

import android.app.Application;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Class - SimpleBlog
 * Desc - This is an activity to make the actual display happen for the Firebase database stuff
 * Created by Dylan's PC on 11/03/2017.
 */

public class StudioOne extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(this);

        if (!FirebaseApp.getApps(this).isEmpty()) {

            FirebaseDatabase.getInstance().setPersistenceEnabled(true);

        }
    }

}