package com.example.admin.fragmentproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.transition.Slide;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddCarFragment extends Fragment {


    private EditText teModel;
    private EditText etBrand;
    private EditText etYear;
    private Button btnAdd;

    public AddCarFragment() {
        // Required empty public constructor
        setEnterTransition(new Slide(Gravity.RIGHT));
        setExitTransition(new Slide(Gravity.LEFT));
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_car, container, false);
        teModel = view.findViewById(R.id.etModel);
        etBrand = view.findViewById(R.id.etBrand);
        etYear = view.findViewById(R.id.etYear);
        btnAdd = view.findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                AppModel.cars.add(new Car(teModel.getText().toString(), etBrand.getText().toString(), etYear.getText().toString()));
                AppModel.adapter.notifyDataSetChanged();
            }
        });
        return view;
    }

}
