package com.example.praktikum_tugas3;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;


import com.example.praktikum_tugas3.R;
import com.example.praktikum_tugas3.GenshinAdapter;
import com.example.praktikum_tugas3.GenshinData;
import com.example.praktikum_tugas3.GenshinModel;



public class GenshinFragment extends Fragment {
    @Nullable @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_genshin, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getActivity().setTitle("Genshin Impact Character");

        GenshinAdapter GenshinAdapter = new GenshinAdapter(GenshinData.getListData(),getContext());
        RecyclerView rvGenshin = getView().findViewById(R.id.rv_agent_list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());

        rvGenshin.setLayoutManager(layoutManager);
        rvGenshin.setHasFixedSize(true);
        rvGenshin.setAdapter(GenshinAdapter);
    }
}