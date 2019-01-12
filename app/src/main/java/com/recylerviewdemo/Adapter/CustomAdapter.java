package com.recylerviewdemo.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.recylerviewdemo.MainActivity;
import com.recylerviewdemo.R;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    ArrayList<String> stringArrayList;

    public CustomAdapter(Context context, ArrayList<String> personNames) {
        this.context = context;
        this.stringArrayList = personNames;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.person_name, parent, false);
        return new Item(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((Item) holder).name.setText(stringArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return stringArrayList.size();
    }

    public class Item extends RecyclerView.ViewHolder {
        TextView name;

        public Item(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.textView);
        }
    }
}
