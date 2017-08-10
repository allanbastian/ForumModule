package com.adgvit.allan.forum;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by Allan on 08-08-2017.
 */

public class ForumRecyclerAdapter extends RecyclerView.Adapter<ForumRecyclerAdapter.MyViewHolder>{

    LayoutInflater inflater;
    List<ForumItem> data = Collections.emptyList();

    public ForumRecyclerAdapter(Context context, List<ForumItem> data) {
        inflater = LayoutInflater.from(context);
        this.data = data;
    }

    @Override
    public ForumRecyclerAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.forum_row_layout, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ForumRecyclerAdapter.MyViewHolder holder, int position) {
        ForumItem current = data.get(position);
        holder.cards.setVisibility(View.VISIBLE);
        holder.ques.setText(current.ques);
        holder.upVote.setVisibility(View.VISIBLE);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        CardView cards;
        TextView ques;
        ImageButton upVote;

        public MyViewHolder(View itemView) {
            super(itemView);
            cards = (CardView) itemView.findViewById(R.id.cards);
            ques = (TextView) itemView.findViewById(R.id.forumQues);
            upVote = (ImageButton) itemView.findViewById(R.id.upVote);
        }
    }
}
