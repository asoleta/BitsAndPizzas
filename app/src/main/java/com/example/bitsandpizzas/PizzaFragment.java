package com.example.bitsandpizzas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PizzaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PizzaFragment extends ListFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                inflater.getContext(),
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.pizzas));
            setListAdapter(adapter);
            return inflater.inflate(R.layout.fragment_pizza, container, false);
    }

}