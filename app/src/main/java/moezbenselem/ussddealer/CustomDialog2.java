package moezbenselem.ussddealer;

import android.app.Activity;
import android.app.Dialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.ActivityCompat;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import org.json.JSONObject;

import java.text.DecimalFormat;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by Moez on 30/04/2018.
 */

public class CustomDialog2  extends Dialog implements
        android.view.View.OnClickListener {

    Boolean isDual = false;
    SharedPreferences sharedPreferences;
    public Activity c;
    public Dialog d;
    public static String APPID = "32e71b2392320fed5d6d5117214377ff";
    public Button s1, s2;
    String[] simSlotName = {
            "extra_asus_dial_use_dualsim",
            "com.android.phone.extra.slot",
            "slot",
            "simslot",
            "sim_slot",
            "subscription",
            "Subscription",
            "phone",
            "com.android.phone.DialingMode",
            "simSlot",
            "slot_id",
            "simId",
            "simnum",
            "phone_type",
            "slotId",
            "slotIdx"
    };

    public CustomDialog2(Activity a) {
        super(a);
        // TODO Auto-generated constructor stub
        this.c = a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_layout);
        s1 = (Button) findViewById(R.id.btn_s1);
        s2 = (Button) findViewById(R.id.btn_s2);
        s1.setText(MainActivity.listSim.get(0));
        s2.setText(MainActivity.listSim.get(1));
        s1.setOnClickListener(this);
        s2.setOnClickListener(this);
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getContext());

    }

    @Override
    public void onClick(View v) {

        try {
            switch (v.getId()) {
                case R.id.btn_s1:
                    for (String s : simSlotName) {
                        HolderService.intent.putExtra(s, 0);
                    }
                    getContext().startActivity(HolderService.intent);
                    dismiss();
                    break;
                case R.id.btn_s2:
                    for (String s : simSlotName) {
                        HolderService.intent.putExtra(s, 1);
                    }
                    getContext().startActivity(HolderService.intent);
                    dismiss();
                    break;
                default:
                    break;
            }
            dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
