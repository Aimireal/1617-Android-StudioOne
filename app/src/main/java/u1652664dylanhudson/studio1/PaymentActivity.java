package u1652664dylanhudson.studio1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        Button weekendcamping = (Button)this.findViewById(R.id.btn_WeekendCamping);
        weekendcamping.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent weekendcamping = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ticketmaster.co.uk/event/1F005119B0703E1E?brand=uk_reading"));
                startActivity(weekendcamping);
            }
        });

        Button weekendinstallment = (Button)this.findViewById(R.id.button_WeekendInstallment);
        weekendinstallment.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent weekendinstallment = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ticketmaster.co.uk/event/1F00513B99EF9FF8"));
                startActivity(weekendinstallment);
            }
        });

        Button fridayticket = (Button)this.findViewById(R.id.button_Friday);
        fridayticket.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent fridayticket = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ticketmaster.co.uk/event/1F005257D662C215"));
                startActivity(fridayticket);
            }
        });

        Button saturdayticket = (Button)this.findViewById(R.id.button_Saturday);
        saturdayticket.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent saturdayticket = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ticketmaster.co.uk/event/1F005257D665C221"));
                startActivity(saturdayticket);
            }
        });

        Button sundayticket = (Button)this.findViewById(R.id.button_Sunday);
        sundayticket.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent sundayticket = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ticketmaster.co.uk/event/1F005257D666C22C"));
                startActivity(sundayticket);
            }
        });

        Button camping = (Button) findViewById(R.id.button_Camping_Equipment);
        camping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent campingintent = new Intent(PaymentActivity.this,
                        CampingActivity.class);
                startActivity(campingintent);
            }
        });



    }
}
