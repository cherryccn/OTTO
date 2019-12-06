package com.hjy.otto.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LocationHistoryFragment extends ListFragment {

    private final List<String> LocationEvents = new ArrayList<>();
    private ArrayAdapter<String> adapter;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        adapter = new ArrayAdapter<>(Objects.requireNonNull(getActivity()),
                android.R.layout.simple_list_item_1, LocationEvents);
        setListAdapter(adapter);
    }
}
