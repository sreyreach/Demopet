package com.sreyreach_sem.demopet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Model> main_list;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_list = new ArrayList<>();
        recyclerView = findViewById(R.id.logo);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        main_list.add(new Model(R.drawable.coka, "COKA", "2years older", "male", "$200"));
        main_list.add(new Model(R.drawable.chily, "CHILY", "1years old", "female", "$150"));
        main_list.add(new Model(R.drawable.coka, "KAPI", "2years old", "male", "$200"));
        main_list.add(new Model(R.drawable.panda,"PADA","2years old","male","$199"));
        main_list.add(new Model(R.drawable.pity,"PITY","1years old","female","$89"));
        main_list.add(new Model(R.drawable.raka,"RAKA","1.5years old","male","$139"));
        main_list.add(new Model(R.drawable.mimi,"MIMI","1years old","female","$200"));
        main_list.add(new Model(R.drawable.roky,"ROKY","1years old","male","$199"));
        main_list.add(new Model(R.drawable.freim,"FREIM","7 month","male","$159"));



        adapter = new CustomAdater(main_list,getApplicationContext());
        recyclerView.setAdapter(adapter);

    }
}
