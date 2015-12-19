package wangtrakul.sirapopb.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private ListView trafficListView;
    private Button ABOUTMEButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();

        //Button Controller
        buttonControl();

    } //Main Method





    private void buttonControl() {
        ABOUTMEButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Sound Effect
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.phonton1);
                buttonMediaPlayer.start();
                //Intent WebView
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://youtu.be/mSgf8hZw4fg"));

                startActivity(objIntent);
            } //event

        });
    }

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        ABOUTMEButton = (Button) findViewById(R.id.button);


    }

} //Main Class
