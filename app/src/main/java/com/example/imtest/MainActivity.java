package com.example.imtest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rec;
    private PullZoomView zoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rec =findViewById(R.id.recyclerView);
        zoom =findViewById(R.id.pzv);
        zoom.postDelayed(new Runnable() {
            @Override
            public void run() {
                zoom.setIsParallax(true);
                zoom.setIsZoomEnable(true);
                zoom.setSensitive(1.5f);
                zoom.setZoomTime(500);
                zoom.setMaxMoveY(600);
            }
        }, 300);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rec.setLayoutManager(linearLayoutManager);
       ArrayList<String>list =  new ArrayList<>();
       for(int i=10;i<30;i++){
           list.add(i+"");
       }
        Recadapter recadapter = new Recadapter(this,list);
       rec.setAdapter(recadapter);

    }
}
