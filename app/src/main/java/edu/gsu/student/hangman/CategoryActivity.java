package edu.gsu.student.hangman;

import android.content.Intent;
import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import butterknife.OnClick;

public class CategoryActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView categoryList;
    String[] category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        categoryList = (ListView) findViewById(R.id.list_category);

        getCategory();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,  android.R.id.text1, category);

        categoryList.setAdapter(adapter);
        categoryList.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "Category: " + category[position], Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, GameActivity.class);
        intent.putExtra("Category", category[position]);
        startActivity(intent);
    }


    private void getCategory() {
        AssetManager words = getAssets();
        category = null;
        try {
            category = words.list("words");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
