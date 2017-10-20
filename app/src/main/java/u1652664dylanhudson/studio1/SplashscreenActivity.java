package u1652664dylanhudson.studio1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashscreenActivity extends AppCompatActivity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        Handler splashHandler=new Handler();
        splashHandler.postDelayed(this, 3500);
    }


    @Override
    public void run(){
        Intent intent = new Intent (SplashscreenActivity.this, MainActivity.class);
        SplashscreenActivity.this.startActivity(intent);
        finish();
    }
}

