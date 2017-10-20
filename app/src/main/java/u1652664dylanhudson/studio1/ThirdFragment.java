package u1652664dylanhudson.studio1;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class ThirdFragment extends android.support.v4.app.Fragment {

    Button b;
    VideoView video;

    public static ThirdFragment newInstance(int instance) {
        Bundle args = new Bundle();
        args.putInt("argsInstance", instance);
        ThirdFragment thirdFragment = new ThirdFragment();
        thirdFragment.setArguments(args);
        return thirdFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View ThirdFragmentView = inflater.inflate(R.layout.fragment_third, container, false);

        video =(VideoView)ThirdFragmentView.findViewById(R.id.trailerView);
        video.setKeepScreenOn(true);
        video.setVideoPath("android.resource://" + getActivity().getPackageName() + "/" + R.raw.test);
        video.start();
        video.requestFocus();

        b = (Button)ThirdFragmentView.findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent video = new Intent(Intent.ACTION_VIEW, Uri.parse("http:/www.bbc.co.uk/programmes/b007xt4m"));
                startActivity(video);
            }
        });

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }
}