package com.adgvit.allan.forum;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Allan on 08-08-2017.
 */

public class UserFrag extends android.support.v4.app.Fragment {

    private RecyclerView recyclerView;
    private UserRecyclerAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.frag_user, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler);
        adapter = new UserRecyclerAdapter(getActivity(), getData());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    private List<UserItem> getData() {
        //GET request
        return null;
    }
}
