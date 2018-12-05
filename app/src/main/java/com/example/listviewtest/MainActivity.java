package com.example.listviewtest;

import android.app.AlertDialog;
import android.content.Context;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class Fruit {
    private String name;
    private int imageId;
    public Fruit(String name, int imageId) {
        this.name=name;
        this.imageId=imageId;
    }
    public String getName() {
        return name;
    }
    public int getImageId() {
        return imageId;
    }
}

class FruitAdapter extends ArrayAdapter<Fruit> {
    private int resourceId;
    public FruitAdapter(Context context, int textViewResourceId, List<Fruit> objects) {
        super(context, textViewResourceId, objects);
        resourceId=textViewResourceId;
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        Fruit fruit=getItem(position);
        View view=LayoutInflater.from(getContext()).inflate(resourceId, null);
        ImageView fruitImage=(ImageView) view.findViewById(R.id.fruit_image);
        TextView fruitName=(TextView) view.findViewById(R.id.fruit_name);
        fruitImage.setImageResource(fruit.getImageId());
        fruitName.setText((fruit.getName()));
        return view;
    }
}

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        FruitAdapter adapter=new FruitAdapter(MainActivity.this, R.layout.fruit_item, fruitList);
        ListView listView=(ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    private void initFruits() {
        Fruit apple=new Fruit("Apple", R.drawable.apple);
        fruitList.add(apple);
        Fruit banana=new Fruit("Banana", R.drawable.banana);
        fruitList.add(banana);
        Fruit orange=new Fruit("Orange", R.drawable.orange);
        fruitList.add(orange);
        Fruit watermelon=new Fruit("Watermelon", R.drawable.watermelon);
        fruitList.add(watermelon);
        Fruit pear=new Fruit("Pear", R.drawable.pear);
        fruitList.add(pear);
        Fruit grape=new Fruit("Grape", R.drawable.grape);
        fruitList.add(grape);
        Fruit pineapple=new Fruit("Pineapple", R.drawable.pineapple);
        fruitList.add(pineapple);
        Fruit strawberry=new Fruit("Strawberry", R.drawable.strawberry);
        fruitList.add(strawberry);
        Fruit cherry=new Fruit("Cherry", R.drawable.cherry);
        fruitList.add(cherry);
        Fruit mango=new Fruit("Mango", R.drawable.mango);
        fruitList.add(mango);
        Fruit kiwi=new Fruit("Kiwi", R.drawable.kiwi);
        fruitList.add(kiwi);
        Fruit lemon=new Fruit("Lemon", R.drawable.lemon);
        fruitList.add(lemon);
        Fruit tomato=new Fruit("Tomato", R.drawable.tomato);
        fruitList.add(tomato);
    }

    /*private String[] data={"Apple", "Banana", "Orange", "Watermelon",
            "Pear", "Grape", "Pineapple", "Strawberry", "Cherry", "Mango", "Tomato", "Kiwi", "Lemon"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(
                MainActivity.this, android.R.layout.simple_list_item_1, data);
        ListView listView=(ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }*/
}

