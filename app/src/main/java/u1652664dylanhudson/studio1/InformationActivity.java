package u1652664dylanhudson.studio1;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        Button essentials = (Button)this.findViewById(R.id.btn_essentials);
        essentials.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent essentials = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.readingfestival.com/information/essentials"));
                startActivity(essentials);
            }
        });

        Button arena = (Button)this.findViewById(R.id.btn_arena);
        arena.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent arena = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.readingfestival.com/information/arena"));
                startActivity(arena);
            }
        });

        Button personalsaftey = (Button)this.findViewById(R.id.btn_personalsaftey);
        personalsaftey.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent personalsaftey = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.readingfestival.com/information/personal-safety"));
                startActivity(personalsaftey);
            }
        });

        Button volunteer = (Button)this.findViewById(R.id.btn_volunteer);
        volunteer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent volunteer = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.readingfestival.com/information/volunteer"));
                startActivity(volunteer);
            }
        });

        Button wheretostay = (Button)this.findViewById(R.id.btn_wheretostay);
        wheretostay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent wheretostay = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.readingfestival.com/information/camping"));
                startActivity(wheretostay);
            }
        });

        Button accesscustomers = (Button)this.findViewById(R.id.btn_accesscustomers);
        accesscustomers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent accesscustomers = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.readingfestival.com/information/disabled-customers"));
                startActivity(accesscustomers);
            }
        });
    }
}
