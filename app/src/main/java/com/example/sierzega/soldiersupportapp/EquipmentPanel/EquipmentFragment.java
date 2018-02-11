package com.example.sierzega.soldiersupportapp.EquipmentPanel;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sierzega.soldiersupportapp.R;

/**
 * Created by Jakub Sierżęga on 11.02.2018.
 */

public class EquipmentFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.equipment_fragment, container, false);
        return view;
    }

}
