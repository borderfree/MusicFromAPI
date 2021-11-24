package com.seattleclouds.modules.moduleidplaceholder;

import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.seattleclouds.C6352p;
import com.seattleclouds.C6557s;
import com.seattleclouds.modules.moduleidplaceholder.C5864b.C5865a;
import com.seattleclouds.modules.moduleidplaceholder.C5864b.C5866b;
import com.seattleclouds.modules.moduleidplaceholder.C5864b.C5867c;
import com.seattleclouds.modules.moduleidplaceholder.C5864b.C5868d;

/* renamed from: com.seattleclouds.modules.moduleidplaceholder.a */
public class C5862a extends C6557s {
    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        mo20294d(C5868d.moduleidplaceholder_my_fragment_title);
        View inflate = layoutInflater.inflate(C5866b.moduleidplaceholder_fragment_module, viewGroup, false);
        final Bundle m = mo1307m();
        ((TextView) inflate.findViewById(C5865a.moduleidplaceholder_custom_string)).setText(m.getString("ARG_TEST_STRING"));
        ((ImageView) inflate.findViewById(C5865a.moduleidplaceholder_image)).setImageDrawable(C6352p.m30857a().mo19790a(m.getString("ARG_IMAGE_NAME")));
        ((Button) inflate.findViewById(C5865a.moduleidplaceholder_button)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C6352p.m30857a().mo19791a(m.getString("ARG_PAGE_TO_OPEN"), C5862a.this);
            }
        });
        return inflate;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        mo1283e(true);
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        menuInflater.inflate(C5867c.moduleidplaceholder_my_menu, menu);
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        if (menuItem.getItemId() != C5865a.moduleidplaceholder_done) {
            return super.mo1245a(menuItem);
        }
        C6352p.m30857a().mo19792a((Fragment) this);
        return true;
    }
}
