package moezbenselem.ussddealer;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ServicesFragment extends Fragment {

    public static Activity activity;
    ArrayList<String> listServices,listNums;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        try {
            activity = getActivity();
            listServices = new ArrayList<>();
            listNums = new ArrayList<>();
            recyclerView =
                    (RecyclerView) getView().findViewById(R.id.recyclerService);

            layoutManager = new LinearLayoutManager(getContext());
            recyclerView.setLayoutManager(layoutManager);

            listServices.add("SAMU");
            listServices.add("POLICE");
            listServices.add("GARDE NATIONALE");
            listServices.add("PROTECTION CIVILE");
            listServices.add("SERVICE CLIENT TT");
            listServices.add("SERVICE CLIENT ORANGE");
            listServices.add("SERVICE CLIENT OOREDOO");

            listNums.add("190");
            listNums.add("197");
            listNums.add("193");
            listNums.add("198");
            listNums.add("1298");
            listNums.add("1150");
            listNums.add("1111");


            adapter = new RecyclerService(listServices,listNums, getContext());
            recyclerView.setAdapter(adapter);
        }catch (Exception e){
            e.printStackTrace();
        }



        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_services, container, false);
    }

}
