package com.awake.kenyanaddressbook;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Tab3 extends Fragment {

    public Tab3(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.activity_tab3,container,false);
        RecyclerView rv = (RecyclerView) v.findViewById(R.id.rv_recycler_view3);
        rv.setHasFixedSize(true);
        MyAdapter adapter = new MyAdapter(new String[]{"test e", "test o", "test three", "test four", "test five" , "test six" , "test seven"});
        rv.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);
        return v;
    }
}
