package com.molps.navfrag;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecAdapter extends RecyclerView.Adapter<RecAdapter.RecViewHolder> {

    private List<String> list;

    public RecAdapter(List<String> list) {
        this.list = list;
    }

    @Override
    public RecViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.frag_item_view, parent, false);
        return new RecViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecViewHolder holder, int position) {
        holder.bindType(position);
    }

    @Override
    public int getItemCount() {
        if (list != null)
            return list.size();
        else
            return 0;
    }


    public class RecViewHolder extends RecyclerView.ViewHolder{

        private TextView nameText;

        public RecViewHolder(View itemView) {
            super(itemView);
            nameText = (TextView) itemView.findViewById(R.id.nameTextView);
        }

        public void bindType(int position) {
            nameText.setText(position + ". " + list.get(position));
        }

    }
}
