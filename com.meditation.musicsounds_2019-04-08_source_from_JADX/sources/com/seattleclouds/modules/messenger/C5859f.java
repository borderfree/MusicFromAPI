package com.seattleclouds.modules.messenger;

import android.content.Context;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6652w;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.api.C5268b;
import com.seattleclouds.api.C5270d;
import com.seattleclouds.modules.gcmtopics.C5687b;
import com.seattleclouds.util.C6593am;
import com.seattleclouds.util.C6600as;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.messenger.f */
public class C5859f extends C6652w {
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public C5852c f20751ae;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public ArrayList<Conversation> f20752af;

    /* renamed from: ag */
    private View f20753ag;

    /* renamed from: ah */
    private View f20754ah;

    /* renamed from: ai */
    private int f20755ai;
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public boolean f20756aj = false;

    /* renamed from: ak */
    private MenuItem f20757ak;

    /* renamed from: al */
    private Bundle f20758al;

    /* renamed from: i */
    private ListView f20759i;

    /* renamed from: com.seattleclouds.modules.messenger.f$a */
    private class C5860a extends C5270d<Void, String, String> {
        public C5860a(Fragment fragment) {
            super(fragment);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo17335a(Void... voidArr) {
            C5859f.this.f20752af.clear();
            JSONArray jSONArray = C5268b.m26272a().mo17325h().getJSONArray("items");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                Conversation conversation = new Conversation();
                conversation.f20681a = jSONObject.getString("id");
                conversation.f20682b = jSONObject.getString("title");
                C5859f.this.f20752af.add(conversation);
            }
            return "ok";
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(String str) {
            if (str != null) {
                C5859f.this.f20756aj = true;
                C5859f.this.f20751ae.notifyDataSetChanged();
                C5859f.this.mo20721d();
            }
            C5859f.this.m28788a(false, true);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            C5859f.this.m28788a(true, false);
            super.onPreExecute();
            C5859f.this.mo20721d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m28788a(boolean z, boolean z2) {
        View view = z ? this.f20753ag : this.f20754ah;
        View view2 = z ? this.f20754ah : this.f20753ag;
        if (z2) {
            C6600as.m31947a(view, view2, this.f20755ai);
            return;
        }
        view.setVisibility(0);
        view2.setVisibility(8);
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle m = mo1307m();
        if (m != null) {
            this.f20758al = m.getBundle("PAGE_STYLE");
        }
        View inflate = layoutInflater.inflate(C5460i.fragment_messenger, viewGroup, false);
        C6593am.m31914a(inflate, this.f20758al);
        this.f20759i = (ListView) inflate.findViewById(16908298);
        this.f20751ae = new C5852c(mo1318s(), this.f20752af, this.f20758al);
        this.f20759i.setAdapter(this.f20751ae);
        this.f20754ah = inflate.findViewById(C5458g.content);
        this.f20753ag = inflate.findViewById(C5458g.progress);
        this.f20755ai = mo1320t().getInteger(17694720);
        if (this.f20756aj) {
            m28788a(false, false);
        } else {
            this.f20754ah.setVisibility(8);
        }
        return inflate;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        this.f20752af = new ArrayList<>();
        if (bundle != null) {
            this.f20756aj = bundle.getBoolean("dataReceived");
            this.f20752af = bundle.getParcelableArrayList("conversations");
        }
        super.mo1234a(bundle);
    }

    /* renamed from: a */
    public void mo1239a(Menu menu) {
        super.mo1239a(menu);
        this.f20757ak.setEnabled(this.f20756aj);
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        menuInflater.inflate(C5461j.messenger, menu);
        this.f20757ak = menu.findItem(C5458g.notifications_settings);
    }

    /* renamed from: a */
    public void mo1692a(ListView listView, View view, int i, long j) {
        super.mo1692a(listView, view, i, j);
        Bundle bundle = new Bundle();
        bundle.putString("ARG_CONVERSATION_ID", ((Conversation) this.f20752af.get(i)).f20681a);
        bundle.putString("ARG_CONVERSATION_TITLE", ((Conversation) this.f20752af.get(i)).f20682b);
        Bundle m = mo1307m();
        if (m != null) {
            bundle.putString("PAGE_ID", m.getString("PAGE_ID"));
            bundle.putInt("ARG_MAX_MESSAGE_LENGTH", m.getInt("ARG_MAX_MESSAGE_LENGTH", 0));
            bundle.putBundle("PAGE_STYLE", m.getBundle("PAGE_STYLE"));
        }
        App.m25620a(new FragmentInfo(C5845b.class.getName(), bundle), (Fragment) this);
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (z && !this.f20756aj) {
            new C5860a(this).execute(new Void[0]);
        }
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        if (menuItem.getItemId() != C5458g.notifications_settings) {
            return super.mo1245a(menuItem);
        }
        ArrayList arrayList = new ArrayList(this.f20752af.size());
        ArrayList arrayList2 = new ArrayList(this.f20752af.size());
        Iterator it = this.f20752af.iterator();
        while (it.hasNext()) {
            Conversation conversation = (Conversation) it.next();
            arrayList.add(conversation.f20681a);
            arrayList2.add(conversation.f20682b);
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("ARG_TOPIC_IDS", arrayList);
        bundle.putStringArrayList("ARG_TOPIC_TITLES", arrayList2);
        bundle.putString("ARG_TOPIC_TYPE", "messengerMessage");
        bundle.putString("ARG_NOTE", mo1219a(C5462k.messenger_notifications_subscription_note));
        mo1230a(App.m25603a(new FragmentInfo(C5687b.class.getName(), bundle), (Context) mo1318s()));
        return true;
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        bundle.putParcelableArrayList("conversations", this.f20752af);
        bundle.putBoolean("dataReceived", this.f20756aj);
        super.mo1282e(bundle);
    }
}
