package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;

import com.google.gson.Gson;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listview;
    private List<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Gson gson=new Gson();
        listview = (ListView) findViewById(R.id.listview);
        try {
            URL url= new URL("");
            HttpURLConnection http= (HttpURLConnection) url.openConnection();
            if(http.getResponseCode()==200);
        } catch (IOException e) {
            e.printStackTrace();
        }
        list=new ArrayList<>();
        EventBus b=EventBus.getDefault();
        b.register(this);
        for (int i = 0; i < 100; i++) {
            list.add("我亭神有"+(i+1)+"个小JJ");
        }
        new PopupWindow(null,200,200,true);

        listview.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list));
    }
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void a(String a){

    }

}
