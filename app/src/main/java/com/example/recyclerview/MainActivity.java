package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyDecoration;
import Adapter.number;
import Adapter.numberAdapter;

public class MainActivity extends AppCompatActivity {
    private List<number>mList = new ArrayList<>();
    private List<String> mData = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberAdapter adapter = new numberAdapter(mList);
        init();
        initData();
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new MyDecoration(this, MyDecoration.VERTICAL_LIST));
    }
    private void initData(){
        mData = new ArrayList<String>();
        for (int i = 0; i < 20; i++){
            mData.add("Item" + i);
        }
    }

    private void init(){
        for(int i = 0;i<100;i++){
            number number1 = new number();
            number1.num = i;
            mList.add(number1);
        }
    }
}