package com.example.netclanexplorer.Fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.netclanexplorer.ExploreAdapter;
import com.example.netclanexplorer.ExploreModal;
import com.example.netclanexplorer.R;

import java.util.ArrayList;
import java.util.List;


public class ExploreFragment extends Fragment {
    private RecyclerView recyclerView;
    Context context;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_explore, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));

        List<ExploreModal> dataList = generateExplore(); // Implement this method to create your data list
        ExploreAdapter exploreAdapter = new ExploreAdapter(dataList, this);
        recyclerView.setAdapter(exploreAdapter);
        return view;
    }



    // Method to generate dummy data for testing
    private List<ExploreModal> generateExplore() {
        List<ExploreModal> dataList = new ArrayList<>();

        // Add your data here
        dataList.add(new ExploreModal(R.drawable.img, "Namratha Duvvuru", "Hydrabad|Undergraduate Student", "within 100m", "Cofee|Business|Friends", "Hi Community i am open to new connection"));
        dataList.add(new ExploreModal(R.drawable.img, "Ramesh", "Hydrabad|Undergraduate Student", "within 100m", "Cofee|Business|Friends", "Hi Community i am open to new connection"));
        dataList.add(new ExploreModal(R.drawable.img, "Krishna", "Hydrabad|Undergraduate Student", "within 100m", "Cofee|Business|Friends", "Hi Community i am open to new connection"));

        dataList.add(new ExploreModal(R.drawable.img, "AnilKumar", "Hydrabad|Undergraduate Student", "within 100m", "Cofee|Business|Friends", "Hi Community i am open to new connection"));
        dataList.add(new ExploreModal(R.drawable.img, "Raju", "Hydrabad|Undergraduate Student", "within 100m", "Cofee|Business|Friends", "Hi Community i am open to new connection"));
        // Add more items as needed
        dataList.add(new ExploreModal(R.drawable.img, "Nandha", "Hydrabad|Undergraduate Student", "within 100m", "Cofee|Business|Friends", "Hi Community i am open to new connection"));
        dataList.add(new ExploreModal(R.drawable.img, "Dinesh", "Hydrabad|Undergraduate Student", "within 100m", "Cofee|Business|Friends", "Hi Community i am open to new connection"));

        return dataList;
    }



    }



