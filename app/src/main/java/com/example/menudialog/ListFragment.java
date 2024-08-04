package com.example.menudialog;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.menudialog.recycler.Item;
import com.example.menudialog.recycler.ListAdapter;

import java.util.List;
import java.util.ArrayList;


public class ListFragment extends Fragment {
    private RecyclerView recyclerView;
    private ListAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);

        // Создание списка элементов
        List<Item> items = new ArrayList<>();
        items.add(new Item("Иван", "Иванов", "8900"));
        items.add(new Item("Мария", "Петрова", "0000"));
        items.add(new Item("Мария", "Петрова", "0000"));
        items.add(new Item("Мария", "Петрова", "0000"));
        items.add(new Item("Мария", "Петрова", "0000"));
        items.add(new Item("Мария", "Петрова", "0000"));
        items.add(new Item("Мария", "Петрова", "0000"));
        items.add(new Item("Мария", "Петрова", "0000"));
        items.add(new Item("Мария", "Петрова", "0000"));
        items.add(new Item("Мария", "Петрова", "0000"));

        // Создание и установка адаптера
        adapter = new ListAdapter(items);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }

}