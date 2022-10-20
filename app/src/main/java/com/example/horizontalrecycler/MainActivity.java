package com.example.horizontalrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView mList;
    List<KR> appList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mList = findViewById(R.id.list);
        appList = new ArrayList<>();

        appList.add(new KR(R.drawable.w,"W(Double)"));
        appList.add(new KR(R.drawable.zio,"Zio"));
        appList.add(new KR(R.drawable.exaid,"Ex-aid"));
        appList.add(new KR(R.drawable.build,"Build"));
        appList.add(new KR(R.drawable.decade,"Decade"));
        appList.add(new KR(R.drawable.kabuto,"Kabuto"));

        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mList.setLayoutManager(manager);

        Adapter adaptor = new Adapter(this,appList);
        mList.setAdapter(adaptor);


    }
}