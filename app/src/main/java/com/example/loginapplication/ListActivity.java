package com.example.loginapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    RecyclerView rv_lists;
    AdapterClass adapterClass;
    ArrayList<ModelClass>modelClasses;
    LinearLayoutManager linearLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        rv_lists=findViewById(R.id.rv_list);
        initData();
        setAdapter();
    }

    private void setAdapter() {
        linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        rv_lists.setLayoutManager(linearLayoutManager);
        adapterClass=new AdapterClass(modelClasses);
        rv_lists.setAdapter(adapterClass);
    }

    private void initData() {
        //get data from data base
        modelClasses=new ArrayList<>();
        String name;
        modelClasses.add(new ModelClass(R.drawable.man2, "Sasindu Dias","Galle"));
        modelClasses.add(new ModelClass(R.drawable.girl1, "Heshani Kalpani","Matara"));
        modelClasses.add(new ModelClass(R.drawable.man3, "Bhagya Ravishanka","Battaramulla"));
        modelClasses.add(new ModelClass(R.drawable.girl2, "Upeka Imalsha","Colombo"));
        modelClasses.add(new ModelClass(R.drawable.man4, "Mihindu Navod","Kandy"));
        modelClasses.add(new ModelClass(R.drawable.girl3, "Delmi Gavisha","Ambalangoda"));
        modelClasses.add(new ModelClass(R.drawable.man5, "Yasiru Dias","Galle"));
        modelClasses.add(new ModelClass(R.drawable.girl4, "Windy Perera","Colombo"));
    }
}