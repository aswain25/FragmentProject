package com.example.admin.fragmentproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.transition.Slide;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CarsFragment extends Fragment {


    private ListView carsView;

    public CarsFragment() {
        // Required empty public constructor
        setEnterTransition(new Slide(Gravity.RIGHT));
        setExitTransition(new Slide(Gravity.LEFT));
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cars, container, false);
        carsView = view.findViewById(R.id.carListView);
        carsView.setAdapter(AppModel.adapter);
        return view;
    }

}
