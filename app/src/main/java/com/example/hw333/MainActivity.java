package com.example.hw333;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    DescriptionAdapter descriptionAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Description> descriptionList = generateDescriptionList();
        descriptionAdapter = new DescriptionAdapter(descriptionList);
        recyclerView.setAdapter(descriptionAdapter);
    }

    private List<Description> generateDescriptionList() {
        List<Description> descriptionList = new ArrayList<>();
        descriptionList.add(new Description("Description 1"));
        descriptionList.add(new Description("Description 2"));
        descriptionList.add(new Description("Description 3"));
        descriptionList.add(new Description("Description 4"));
        descriptionList.add(new Description("Description 5"));
        descriptionList.add(new Description("Description 6"));
        descriptionList.add(new Description("Description 7"));
        descriptionList.add(new Description("Description 8"));
        descriptionList.add(new Description("Description 9"));
        return descriptionList;
    }
}
