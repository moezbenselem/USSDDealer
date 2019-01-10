package moezbenselem.ussddealer;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TTFragment extends Fragment {


    public static Activity activity;
    ArrayList<Button> listBt;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {


        try {
            activity = getActivity();
            listBt = new ArrayList<>();
            recyclerView =
                    (RecyclerView) getView().findViewById(R.id.recyclerView);

            layoutManager = new GridLayoutManager(getContext(), 2);
            recyclerView.setLayoutManager(layoutManager);


            Button bt1 = new Button(getContext());
        bt1.setText("MENU PRINCIPALE");
        bt1.setTag("*100");
        Button bt2 = new Button(getContext());
        bt2.setText("solde");
        bt2.setTag("*122");
        Button bt3 = new Button(getContext());
        bt3.setText("suivi forfait");
        bt3.setTag("*122*2");
        Button bt4 = new Button(getContext());
        bt4.setText("ACTIVATION \nINTERNET");
        bt4.setTag("*140");


        Button bt5 = new Button(getContext());
        bt5.setText("sos solde");
        bt5.setTag("*150");
            Button bt6 = new Button(getContext());
            bt6.setText("MON NUMERO");
            bt6.setTag("*146");


            Button bt7 = new Button(getContext());
            bt7.setText("transfert crédit");
            bt7.setTag("*133");

        Button bt8 = new Button(getContext());
        bt8.setText("activation double");
        bt8.setTag("*130*1");
        Button bt9 = new Button(getContext());
        bt9.setText("activation \nbinetna");
        bt9.setTag("*130*2");
        Button bt10 = new Button(getContext());
        bt10.setText("ACTIVATION BEST");
        bt10.setTag("*130*3");
        Button bt11 = new Button(getContext());
        bt11.setText("ACTIVATION \nSIGOUNDA");
        bt11.setTag("*130*6");
        Button bt12 = new Button(getContext());
        bt12.setText("fidélite kelma");
        bt12.setTag("*111");
        Button bt13 = new Button(getContext());
        bt13.setText("mobidinar");
        bt13.setTag("*104");

        Button bt14 = new Button(getContext());
        bt14.setText("SERVICE TFADHAL");
        bt14.setTag("*112");
        Button bt15 = new Button(getContext());
        bt15.setText("APPEL \nEN CONFéRENCE");
        bt15.setTag("*115");
        Button bt16 = new Button(getContext());
        bt16.setText("ACTIVATION \nROAMING");
        bt16.setTag("*117*1");
        Button bt17 = new Button(getContext());
        bt17.setText("SMS KALLEMNI");
        bt17.setTag("*124*1");
        Button bt18 = new Button(getContext());
        bt18.setText("KALLEMNI");
        bt18.setTag("*124");
            Button bt19 = new Button(getContext());
            bt19.setText("forfait messagét");
            bt19.setTag("*118");

            Button bt20 = new Button(getContext());
            bt20.setText("code puk");
            bt20.setTag("*153");
        Button bt21 = new Button(getContext());
        bt21.setText("SERVICE \nTABBA3NI");
        bt21.setTag("*149");

            Button bt22 = new Button(getContext());
            bt22.setText("SERVICE \nMDINAR");
            bt22.setTag("*166");
            Button bt23 = new Button(getContext());
            bt23.setText("ACTIVATION \nDOUBLE APPEL");
            bt23.setTag("*43");




        listBt.add(bt1);
        listBt.add(bt2);
        listBt.add(bt3);
        listBt.add(bt4);
        listBt.add(bt5);
        listBt.add(bt6);
        listBt.add(bt7);
        listBt.add(bt8);
        listBt.add(bt9);
        listBt.add(bt10);
        listBt.add(bt11);
        listBt.add(bt12);
        listBt.add(bt13);
        listBt.add(bt14);

        listBt.add(bt15);
        listBt.add(bt16);

        listBt.add(bt17);
        listBt.add(bt18);
        listBt.add(bt19);
        listBt.add(bt20);
        listBt.add(bt21);
            listBt.add(bt22);
            listBt.add(bt23);
        adapter = new RecyclerButton(listBt, getContext());
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
        return inflater.inflate(R.layout.fragment_tt, container, false);
    }

}
