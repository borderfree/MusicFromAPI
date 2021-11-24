package com.seattleclouds.modules.messenger;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.widget.SwipeRefreshLayout.C0674b;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6348n;
import com.seattleclouds.C6652w;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.api.C5267a;
import com.seattleclouds.api.C5268b;
import com.seattleclouds.api.C5270d;
import com.seattleclouds.p160e.C5338d;
import com.seattleclouds.util.C6578ag;
import com.seattleclouds.util.C6593am;
import com.seattleclouds.util.C6600as;
import com.seattleclouds.util.C6611g;
import com.seattleclouds.widget.MultiSwipeRefreshLayout;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.messenger.b */
public class C5845b extends C6652w {

    /* renamed from: ae */
    private View f20705ae;

    /* renamed from: af */
    private View f20706af;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public EditText f20707ag = null;

    /* renamed from: ah */
    private Button f20708ah;

    /* renamed from: ai */
    private MenuItem f20709ai;

    /* renamed from: aj */
    private MenuItem f20710aj;
    /* access modifiers changed from: private */

    /* renamed from: ak */
    public C5856e f20711ak;
    /* access modifiers changed from: private */

    /* renamed from: al */
    public List<C5855d> f20712al = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: am */
    public String f20713am = "";

    /* renamed from: an */
    private String f20714an;
    /* access modifiers changed from: private */

    /* renamed from: ao */
    public boolean f20715ao = false;

    /* renamed from: ap */
    private int f20716ap;
    /* access modifiers changed from: private */

    /* renamed from: aq */
    public boolean f20717aq = false;
    /* access modifiers changed from: private */

    /* renamed from: ar */
    public int f20718ar;

    /* renamed from: as */
    private boolean f20719as = false;
    /* access modifiers changed from: private */

    /* renamed from: at */
    public int f20720at = 1;
    /* access modifiers changed from: private */

    /* renamed from: au */
    public int f20721au;
    /* access modifiers changed from: private */

    /* renamed from: av */
    public boolean f20722av = false;
    /* access modifiers changed from: private */

    /* renamed from: aw */
    public boolean f20723aw = false;
    /* access modifiers changed from: private */

    /* renamed from: ax */
    public MultiSwipeRefreshLayout f20724ax;

    /* renamed from: ay */
    private Bundle f20725ay;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ListView f20726i;

    /* renamed from: com.seattleclouds.modules.messenger.b$a */
    private class C5850a extends C5270d<Void, String, String> {

        /* renamed from: b */
        private String f20732b = "";

        public C5850a(Fragment fragment) {
            super(fragment);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo17335a(Void... voidArr) {
            JSONObject c = C5268b.m26272a().mo17314c(C5845b.this.f20713am, this.f20732b);
            C5855d dVar = new C5855d();
            dVar.f20738a = c.getString("id");
            dVar.f20739b = this.f20732b;
            C5267a c2 = C5268b.m26272a().mo17313c();
            dVar.f20740c = c2.mo17289a();
            dVar.f20741d = c2.mo17291b();
            dVar.f20742e = new Date();
            C5845b.this.f20712al.add(dVar);
            return "ok";
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(String str) {
            if (str != null) {
                C5845b.this.m28756au();
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
            this.f20732b = C5845b.this.f20707ag.getText().toString();
            C5845b.this.f20707ag.setText("");
        }
    }

    /* renamed from: com.seattleclouds.modules.messenger.b$b */
    private class C5851b extends C5270d<Void, String, String> {
        public C5851b(Fragment fragment) {
            super(fragment);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo17335a(Void... voidArr) {
            ArrayList arrayList = new ArrayList();
            JSONObject b = C5268b.m26272a().mo17310b(C5845b.this.f20713am, String.valueOf(C5845b.this.f20720at));
            C5845b.this.f20721au = b.getInt("totalItems");
            C5845b.this.f20720at = C5845b.this.f20720at + C5845b.this.f20721au;
            JSONArray jSONArray = b.getJSONArray("items");
            boolean z = false;
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                C5855d dVar = new C5855d();
                dVar.f20738a = jSONObject.getString("id");
                dVar.f20739b = jSONObject.getString("text");
                JSONObject jSONObject2 = jSONObject.getJSONObject("user");
                dVar.f20740c = jSONObject2.getString("id");
                dVar.f20741d = jSONObject2.getString("displayName");
                String string = jSONObject.getString("createdDate");
                try {
                    dVar.f20742e = C5268b.m26276a(string);
                } catch (ParseException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error parsing date: ");
                    sb.append(string);
                    Log.w("ConversationFragment", sb.toString());
                }
                arrayList.add(dVar);
            }
            C5845b bVar = C5845b.this;
            if (C5845b.this.f20721au < 30) {
                z = true;
            }
            bVar.f20723aw = z;
            if (C5845b.this.f20722av) {
                if (!C5845b.this.f20712al.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList(C5845b.this.f20712al);
                    C5845b.this.f20712al.clear();
                    arrayList.addAll(arrayList2);
                }
                return "ok";
            }
            C5845b.this.f20712al.clear();
            C5845b.this.f20712al.addAll(arrayList);
            return "ok";
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(String str) {
            if (!C5845b.this.f20722av) {
                if (str != null) {
                    C5845b.this.m28756au();
                    C5845b.this.f20724ax.setEnabled(true);
                }
                C5845b.this.m28752a(false, true);
                return;
            }
            C5845b.this.f20724ax.setRefreshing(false);
            if (str != null) {
                C5845b.this.f20711ak.notifyDataSetChanged();
                if (C5845b.this.f20721au > 0) {
                    C5845b.this.f20726i.setSelection(C5845b.this.f20721au);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (!C5845b.this.f20722av) {
                C5845b.this.m28752a(true, false);
            }
            super.onPreExecute();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m28752a(boolean z, boolean z2) {
        this.f20717aq = z;
        View view = z ? this.f20706af : this.f20705ae;
        View view2 = z ? this.f20705ae : this.f20706af;
        if (z2) {
            C6600as.m31947a(view, view2, this.f20716ap);
            return;
        }
        view.setVisibility(0);
        view2.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: as */
    public void m28754as() {
        if (this.f20711ak.getCount() > 0) {
            this.f20726i.setSelection(this.f20711ak.getCount() - 1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: at */
    public void m28755at() {
        startActivityForResult(App.m25603a(new FragmentInfo(C5838a.class.getName(), new Bundle()), (Context) mo1318s()), 1001);
    }

    /* access modifiers changed from: private */
    /* renamed from: au */
    public void m28756au() {
        this.f20719as = true;
        this.f20711ak.notifyDataSetChanged();
        m28754as();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle m = mo1307m();
        if (m != null) {
            this.f20713am = m.getString("ARG_CONVERSATION_ID");
            this.f20718ar = m.getInt("ARG_MAX_MESSAGE_LENGTH", 255);
            if (this.f20718ar < 20 || this.f20718ar > 255) {
                this.f20718ar = 255;
            }
            this.f20714an = m.getString("ARG_CONVERSATION_TITLE");
            this.f20725ay = m.getBundle("PAGE_STYLE");
        }
        boolean z = false;
        View inflate = layoutInflater.inflate(C5460i.fragment_messenger_conversation, viewGroup, false);
        C6593am.m31914a(inflate, this.f20725ay);
        C6593am.m31914a(inflate.findViewById(C5458g.new_message_container), this.f20725ay);
        this.f20726i = (ListView) inflate.findViewById(16908298);
        this.f20711ak = new C5856e(mo1318s(), this.f20712al, this.f20725ay);
        this.f20726i.setAdapter(this.f20711ak);
        this.f20705ae = inflate.findViewById(C5458g.content);
        this.f20705ae.setVisibility(8);
        this.f20706af = inflate.findViewById(C5458g.progress);
        this.f20726i.setOnTouchListener(new OnTouchListener() {
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    C6600as.m31944a((Activity) C5845b.this.mo1318s(), (View) C5845b.this.f20707ag);
                }
                return false;
            }
        });
        this.f20724ax = (MultiSwipeRefreshLayout) inflate.findViewById(C5458g.swipe_refresh);
        C5338d o = ((C6348n) mo1318s()).mo19778o();
        this.f20724ax.setColorSchemeColors(o.mo17546c(mo1318s()));
        this.f20724ax.setSwipeableChildren(16908298, 16908292);
        this.f20724ax.setOnRefreshListener(new C0674b() {
            /* renamed from: a */
            public void mo2774a() {
                C5845b.this.mo18599e();
            }
        });
        this.f20724ax.setEnabled(false);
        this.f20707ag = (EditText) inflate.findViewById(C5458g.message_input);
        C6593am.m31915a((TextView) this.f20707ag, this.f20725ay);
        this.f20707ag.setOnTouchListener(new OnTouchListener() {
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    if (!C5845b.this.f20715ao) {
                        C5845b.this.m28755at();
                    } else {
                        C5845b.this.m28754as();
                    }
                }
                return false;
            }
        });
        this.f20708ah = (Button) inflate.findViewById(C5458g.send_button);
        this.f20708ah.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (!C5845b.this.f20715ao) {
                    C5845b.this.m28755at();
                } else if (C5845b.this.f20715ao && C5845b.this.f20707ag.getText().toString().trim().length() > 0 && !C5845b.this.f20717aq) {
                    int length = C5845b.this.f20707ag.getText().toString().length();
                    if (length > C5845b.this.f20718ar) {
                        Toast.makeText(C5845b.this.mo1318s(), C5845b.this.mo1220a(C5462k.messenger_message_too_long, Integer.valueOf(length), Integer.valueOf(C5845b.this.f20718ar)), 1).show();
                        return;
                    }
                    new C5850a(C5845b.this).execute(new Void[0]);
                }
            }
        });
        this.f20708ah.setCompoundDrawablesWithIntrinsicBounds(C6611g.m31974a((Context) mo1318s(), C5457f.ic_action_send_alpha, mo1453c().mo17546c(mo1318s())), null, null, null);
        this.f20716ap = mo1320t().getInteger(17694721);
        if (C5268b.m26272a().mo17313c() != null) {
            z = true;
        }
        this.f20715ao = z;
        mo20721d();
        mo20720b(this.f20714an);
        return inflate;
    }

    /* renamed from: a */
    public void mo1222a(int i, int i2, Intent intent) {
        if (i == 1001 && i2 == -1 && intent != null) {
            this.f20715ao = true;
            intent.getStringExtra("userId");
            String stringExtra = intent.getStringExtra("displayName");
            C0367h s = mo1318s();
            Toast.makeText(s, s.getString(C5462k.messenger_signed_in_as, new Object[]{stringExtra}), 1).show();
            mo20721d();
            return;
        }
        super.mo1222a(i, i2, intent);
    }

    /* renamed from: a */
    public void mo1239a(Menu menu) {
        this.f20709ai.setEnabled(this.f20715ao);
        this.f20709ai.setVisible(this.f20715ao);
        this.f20710aj.setEnabled(!this.f20715ao);
        this.f20710aj.setVisible(!this.f20715ao);
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        menuInflater.inflate(C5461j.messenger_conversation, menu);
        this.f20710aj = menu.findItem(C5458g.sign_in);
        this.f20709ai = menu.findItem(C5458g.sign_out);
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (z && !this.f20719as) {
            this.f20722av = false;
            new C5851b(this).execute(new Void[0]);
        }
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C5458g.sign_in) {
            m28755at();
            return true;
        } else if (itemId != C5458g.sign_out) {
            return super.mo1245a(menuItem);
        } else {
            this.f20715ao = false;
            Toast.makeText(mo1318s(), C5462k.messenger_signed_out, 0).show();
            C5268b.m26272a().mo17324g();
            mo20721d();
            C6578ag.m31843c();
            return true;
        }
    }

    /* renamed from: e */
    public void mo18599e() {
        if (!this.f20723aw) {
            this.f20722av = true;
            new C5851b(this).execute(new Void[0]);
            return;
        }
        this.f20724ax.setRefreshing(false);
        this.f20724ax.setEnabled(false);
    }
}
