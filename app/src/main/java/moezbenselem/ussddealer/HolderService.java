package moezbenselem.ussddealer;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Moez on 23/07/2018.
 */

public class HolderService extends RecyclerView.ViewHolder {
    public static Intent intent;
    //public ImageView itemImage;
    public Button bt;
    public TextView tvService, tvNum;
    static Context context;
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

    public HolderService(View itemView, final ArrayList<String> services, final ArrayList<String> nums, final Context context) {

        super(itemView);

        try {

            this.context = context;
            bt = (Button) itemView.findViewById(R.id.call);
            tvService = (TextView) itemView.findViewById(R.id.tvService);
            tvNum = (TextView) itemView.findViewById(R.id.tvNum);
            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    Snackbar.make(v,tvService.getText() + " " +tvNum.getText(), Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                    return false;
                }
            });

            bt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Toast.makeText(context,bt.getText()+" | "+bt.getTag(),Toast.LENGTH_SHORT).show();
                    Snackbar.make(v,tvService.getText() + " " +tvNum.getText(), Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                    if (ActivityCompat.checkSelfPermission(context, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                        ActivityCompat.requestPermissions(ServicesFragment.activity,
                                new String[]{Manifest.permission.CALL_PHONE},
                                1234);
                        return;
                    }

                    intent = new Intent(Intent.ACTION_CALL);

                    intent.setData(Uri.parse("tel:" + tvNum.getText().toString()));

                    intent.putExtra("com.android.phone.force.slot", true);
                    intent.putExtra("Cdma_Supp", true);


                    //Add all slots here, according to device.. (different device require different key so put all together)

                    ArrayList<String> list = MainActivity.checkPr(OoredooFragment.activity,context);
                    if (list.size() == 2) {
                        CustomDialog2 cm = new CustomDialog2(ServicesFragment.activity);
                        cm.show();
                    } else {
                        context.startActivity(intent);
                    }


                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}