package u1652664dylanhudson.studio1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CampingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camping);

        Button gooutdoors = (Button)this.findViewById(R.id.buttonBuyOne);
        gooutdoors.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent gooutdoors = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gooutdoors.co.uk/expert-advice/tent-buying-guide"));
                startActivity(gooutdoors);
            }
        });

        Button mountainwarehouse = (Button)this.findViewById(R.id.buttonBuyTwo);
        mountainwarehouse.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent mountainwarehouse = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mountainwarehouse.com/expert-advice/tent-buying-guide"));
                startActivity(mountainwarehouse);
            }
        });

        Button halfords = (Button)this.findViewById(R.id.buttonBuyThree);
        halfords.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent halfords = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.halfords.com/camping-leisure/camping/tents"));
                startActivity(halfords);
            }
        });

        Button tent2hire = (Button)this.findViewById(R.id.buttonHireOne);
        tent2hire.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent tent2hire = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.tent2hire.co.uk/"));
                startActivity(tent2hire);
            }
        });

        Button pichup = (Button)this.findViewById(R.id.buttonHireTwo);
        pichup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent pichup = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.pitchup.com/rent-a-tent/"));
                startActivity(pichup);
            }
        });

        Button campinggearhire = (Button)this.findViewById(R.id.buttonHireThree);
        campinggearhire.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent campinggearhire = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.campinggearhire.co.uk/"));
                startActivity(campinggearhire);
            }
        });


    }
}
