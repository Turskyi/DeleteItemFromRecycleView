package com.example.commonmistakes;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        TestAdapter adapter = new TestAdapter();
        recyclerView.setAdapter(adapter);
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("2222");
        list.add("333");
        list.add("444");
        list.add("555");
        list.add("666");
        list.add("777");
        list.add("888");
        list.add("999");
        list.add("000");
        list.add("12");
        list.add("133");
        list.add("1444");
        list.add("155");
        adapter.setStringList(list);
    }
}
