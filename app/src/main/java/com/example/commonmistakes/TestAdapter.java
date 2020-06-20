package com.example.commonmistakes;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.TextViewHolder> implements View.OnClickListener {

    private final ArrayList<String> arrayList = new ArrayList<>();

    public void setStringList (ArrayList<String> list){
        arrayList.clear();
        arrayList.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TextViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemView itemView = new ItemView(parent.getContext());
        return new TextViewHolder(itemView);
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public void onBindViewHolder(@NonNull TextViewHolder holder, int position) {
        holder.bind(arrayList.get(position), position);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    @Override
    public void onClick(View view) {

        final int position = (int) view.getTag();
        new AlertDialog.Builder(view.getContext())
                .setMessage("Dialog item" + arrayList.get(position))
                .setNegativeButton("Cancel", null)
                .setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        arrayList.remove(position);
                        notifyDataSetChanged();
                    }
                }).create().show();

    }

    class TextViewHolder extends RecyclerView.ViewHolder {

        private ItemView itemView;

        TextViewHolder(ItemView itemView) {

            super(itemView);
            this.itemView = itemView;
        }

        void bind(String text, int position) {    //
            TextView textView = itemView.findViewById(R.id.textView);
            textView.setText(text);
            textView.setTag(position);
            textView.setOnClickListener(TestAdapter.this);
        }
    }
}
