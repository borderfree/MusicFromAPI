package com.seattleclouds.location.geofencing;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C6557s;

/* renamed from: com.seattleclouds.location.geofencing.b */
public class C5449b extends C6557s {
    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5460i.fragment_geofence_message, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(C5458g.text);
        Bundle m = mo1307m();
        if (m != null) {
            String string = m.getString("ARG_TITLE");
            if (string == null) {
                string = "";
            }
            String string2 = m.getString("ARG_MESSAGE");
            if (string2 == null) {
                string2 = "";
            }
            textView.setText(string2);
            mo1318s().setTitle(string);
        }
        return inflate;
    }
}
