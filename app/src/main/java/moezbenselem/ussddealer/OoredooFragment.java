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
public class OoredooFragment extends Fragment {


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
            bt1.setText("Solde");
            bt1.setTag("*100");
            Button bt2 = new Button(getContext());
            bt2.setText("OTLOBNI");
            bt2.setTag("*123");
            Button bt3 = new Button(getContext());
            bt3.setText("TRANSFERT \nCREDIT");
            bt3.setTag("*120");
            Button bt4 = new Button(getContext());
            bt4.setText("MENU PRINCIPALE");
            bt4.setTag("*145");
            Button bt5 = new Button(getContext());
            bt5.setText("INFO APPELS");
            bt5.setTag("*146");
            Button bt6 = new Button(getContext());
            bt6.setText("SAMMA3NI");
            bt6.setTag("*150");
            Button bt7 = new Button(getContext());
            bt7.setText("MON NUMERO");
            bt7.setTag("*177");
            Button bt8 = new Button(getContext());
            bt8.setText("POINTS MERCI");
            bt8.setTag("*111");
            Button bt9 = new Button(getContext());
            bt9.setText("TRANSFERT \nPOINTS MERCI");
            bt9.setTag("*192");
            Button bt10 = new Button(getContext());
            bt10.setText("MENU MIGRATION");
            bt10.setTag("*140");
            Button bt11 = new Button(getContext());
            bt11.setText("SMS ILLIMITE");
            bt11.setTag("*131");
            Button bt12 = new Button(getContext());
            bt12.setText("SMS MAX");
            bt12.setTag("*121");
            Button bt13 = new Button(getContext());
            bt13.setText("FORFAIT INTERNET");
            bt13.setTag("*124");

            Button bt14 = new Button(getContext());
            bt14.setText("PARAM INTERNET");
            bt14.setTag("*124*6");
            Button bt15 = new Button(getContext());
            bt15.setText("ROAMING DATA");
            bt15.setTag("*125");
            Button bt16 = new Button(getContext());
            bt16.setText("FORFAIT INTERNATIONAL");
            bt16.setTag("*155");
            Button bt17 = new Button(getContext());
            bt17.setText("FACEBOOK USSD");
            bt17.setTag("*103");
            Button bt18 = new Button(getContext());
            bt18.setText("FACEBOOK SMS");
            bt18.setTag("*161");
            Button bt19 = new Button(getContext());
            bt19.setText("MOBIFLOUS");
            bt19.setTag("*112");
            Button bt20 = new Button(getContext());
            bt20.setText("NWIMER");
            bt20.setTag("*118");
            Button bt21 = new Button(getContext());
            bt21.setText("SERVICE BACKUP");
            bt21.setTag("*144");



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
        return inflater.inflate(R.layout.fragment_ooredoo, container, false);
    }

}
