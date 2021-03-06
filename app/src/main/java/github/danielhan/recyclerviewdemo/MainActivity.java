package github.danielhan.recyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerview;
    private MyAdapter myAdapter;
    private List<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerview.addItemDecoration(new LinearItemDecoration(this, LinearItemDecoration.VERTICAL,30));
        for (int i = 0; i < 50; i++) {
            list.add(i + "");
        }
        myAdapter = new MyAdapter(list);
        recyclerview.setAdapter(myAdapter);
    }
}
