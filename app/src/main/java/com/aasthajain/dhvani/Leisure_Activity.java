package com.aasthajain.dhvani;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Leisure_Activity extends AppCompatActivity {
    ListView listView;
    TextView textView;
    TextToSpeech t1;
    ListAdapter listAdapter;
    String ListItemsName[] = new String[]{
            "Playing",
             "Reading",
" Watching TV",
"Shopping",
             "Painting",
"Music",

    };

    Integer ImageName[] = {
            R.drawable.playing,
            R.drawable.reading,
            R.drawable.watchingtv,
            R.drawable.shopping,
            R.drawable.painting,
            R.drawable.music,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leisure_);
        ListView listView = (ListView) findViewById(R.id.LeisureList);
        TextView textView = (TextView) findViewById(R.id.textView2);
        listAdapter = new ListAdapter(Leisure_Activity.this , ListItemsName, ImageName);

        listView.setAdapter(listAdapter);


        t1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) ;
                t1.setLanguage(Locale.US);
            }

        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = listAdapter.getItem(position);
                String toSpeak=ListItemsName[position];
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                Toast.makeText(getApplicationContext(), value, Toast.LENGTH_SHORT).show();

            }
        });
    }
    public void onPause(){
        if (t1!=null){
            t1.stop();
            t1.shutdown();

        }
        super.onPause();

    }
}
