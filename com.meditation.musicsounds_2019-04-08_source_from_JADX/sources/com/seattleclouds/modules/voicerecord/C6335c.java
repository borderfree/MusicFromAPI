package com.seattleclouds.modules.voicerecord;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.content.C0452b;
import android.support.p023v7.app.C0765d.C0766a;
import android.support.p023v7.widget.C1116l;
import android.text.Html;
import android.util.Log;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.p160e.C5334b;
import com.seattleclouds.p160e.C5338d;
import com.seattleclouds.util.C6569aa;
import com.seattleclouds.util.C6569aa.C6570a;
import com.seattleclouds.util.C6598aq;
import com.seattleclouds.util.C6619m;
import com.seattleclouds.util.C6620n;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.seattleclouds.modules.voicerecord.c */
public class C6335c extends C6557s {

    /* renamed from: a */
    private ListView f22513a = null;
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public String f22514ae = null;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public boolean f22515af = false;

    /* renamed from: ag */
    private boolean f22516ag = false;

    /* renamed from: ah */
    private boolean f22517ah = false;

    /* renamed from: ai */
    private boolean f22518ai = false;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C6347b f22519b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ArrayList<Map<String, String>> f22520c = new ArrayList<>();

    /* renamed from: d */
    private String f22521d = "";

    /* renamed from: e */
    private View f22522e = null;

    /* renamed from: f */
    private boolean f22523f = true;

    /* renamed from: g */
    private boolean f22524g = true;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f22525h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f22526i = null;

    /* renamed from: com.seattleclouds.modules.voicerecord.c$a */
    private static class C6346a {

        /* renamed from: a */
        public TextView f22544a;

        private C6346a() {
            this.f22544a = null;
        }
    }

    /* renamed from: com.seattleclouds.modules.voicerecord.c$b */
    private class C6347b extends BaseAdapter {

        /* renamed from: b */
        private ArrayList<String> f22546b = new ArrayList<>();

        /* renamed from: c */
        private LayoutInflater f22547c;

        public C6347b(Context context) {
            this.f22547c = LayoutInflater.from(context);
        }

        /* renamed from: a */
        public void mo19766a() {
            this.f22546b = new ArrayList<>();
            notifyDataSetChanged();
        }

        /* renamed from: a */
        public void mo19767a(int i) {
            if (i < this.f22546b.size()) {
                this.f22546b.remove(i);
                notifyDataSetChanged();
            }
        }

        /* renamed from: a */
        public void mo19768a(String str) {
            if (this.f22546b.size() > 0 && ((String) this.f22546b.get(0)).contentEquals(C6335c.this.mo1219a(C5462k.voice_record_no_records))) {
                mo19767a(0);
            }
            this.f22546b.add(str);
            notifyDataSetChanged();
        }

        /* renamed from: b */
        public String getItem(int i) {
            return (String) this.f22546b.get(i);
        }

        public int getCount() {
            return this.f22546b.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C6346a aVar;
            if (view == null) {
                view = this.f22547c.inflate(C5460i.voicerecord_list_item, viewGroup, false);
                aVar = new C6346a();
                aVar.f22544a = (TextView) view.findViewById(C5458g.vrl_label);
                view.setTag(aVar);
            } else {
                aVar = (C6346a) view.getTag();
            }
            aVar.f22544a.setText((CharSequence) this.f22546b.get(i));
            return view;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m30793a(String str, String str2, String str3, ArrayList<String> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putString("ARGS_HOSTNAME", str);
        bundle.putString("ARGS_USERNAME", str2);
        bundle.putString("ARGS_PASSWORD", str3);
        bundle.putStringArrayList("ARGS_FILES", arrayList);
        App.m25619a(new FragmentInfo(C6327b.class.getName(), bundle), (Activity) mo1318s());
    }

    /* renamed from: a */
    private void m30794a(ArrayList<String> arrayList) {
        final C1116l lVar;
        final C1116l lVar2;
        final C1116l lVar3;
        LinearLayout linearLayout = new LinearLayout(mo1318s());
        linearLayout.setOrientation(1);
        int a = C6619m.m32014a(mo1318s(), 8.0f);
        int a2 = C6619m.m32014a(mo1318s(), 16.0f);
        linearLayout.setPadding(a2, a, a2, a);
        C5338d ax = mo20291ax();
        if (this.f22525h == null || this.f22525h.length() == 0) {
            C1116l lVar4 = new C1116l(mo1318s());
            if (ax != null) {
                C5334b.m26771a(ax, (EditText) lVar4);
            }
            lVar4.setInputType(16);
            lVar4.setHint(C5462k.voicerecordlist_ftp_hostname);
            linearLayout.addView(lVar4);
            lVar = lVar4;
        } else {
            lVar = null;
        }
        if (this.f22526i == null || this.f22526i.length() == 0) {
            C1116l lVar5 = new C1116l(mo1318s());
            if (ax != null) {
                C5334b.m26771a(ax, (EditText) lVar5);
            }
            lVar5.setHint(C5462k.voicerecordlist_ftp_username);
            linearLayout.addView(lVar5);
            lVar2 = lVar5;
        } else {
            lVar2 = null;
        }
        if (this.f22514ae == null || this.f22514ae.length() == 0) {
            C1116l lVar6 = new C1116l(mo1318s());
            if (ax != null) {
                C5334b.m26771a(ax, (EditText) lVar6);
            }
            lVar6.setInputType(129);
            lVar6.setHint(C5462k.voicerecordlist_ftp_password);
            linearLayout.addView(lVar6);
            lVar3 = lVar6;
        } else {
            lVar3 = null;
        }
        C0766a aVar = new C0766a(mo1318s());
        aVar.mo3047a(C5462k.voicerecordlist_ftp_credentials);
        aVar.mo3062b((View) linearLayout);
        int i = C5462k.voicerecordlist_ftp_next;
        final ArrayList<String> arrayList2 = arrayList;
        C63459 r5 = new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                C6335c.this.m30793a(lVar == null ? C6335c.this.f22525h : lVar.getText().toString(), lVar2 == null ? C6335c.this.f22526i : lVar2.getText().toString(), lVar3 == null ? C6335c.this.f22514ae : lVar3.getText().toString(), arrayList2);
            }
        };
        aVar.mo3048a(i, (OnClickListener) r5);
        aVar.mo3061b(C5462k.voicerecordlist_ftp_cancel, (OnClickListener) null);
        aVar.mo3068c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m30795a(File[] fileArr) {
        String k = App.m25661k();
        StringBuilder sb = new StringBuilder();
        sb.append(k);
        sb.append("/VoiceRecords");
        String sb2 = sb.toString();
        for (File file : fileArr) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
            sb3.append(file.getName());
            File file2 = new File(sb3.toString());
            try {
                mo19755a(file, file2);
                file.delete();
                HashMap hashMap = new HashMap();
                hashMap.put("recordName", file2.getName());
                hashMap.put("filePath", file2.getAbsolutePath());
                this.f22520c.add(hashMap);
                this.f22519b.mo19768a(file2.getName());
            } catch (IOException e) {
                Log.d("SCVoiceRecordList", "Exception", e);
            }
        }
    }

    /* renamed from: a */
    private void m30796a(final File[] fileArr, boolean z) {
        if (z) {
            C0766a aVar = new C0766a(mo1318s());
            aVar.mo3063b((CharSequence) mo1219a(C5462k.voicerecordlist_copy_internal_records)).mo3056a(false).mo3055a((CharSequence) mo1219a(C5462k.yes), (OnClickListener) new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    C6335c.this.m30795a(fileArr);
                }
            }).mo3064b((CharSequence) mo1219a(C5462k.f19440no), (OnClickListener) new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    C6335c.this.m30801b(fileArr);
                    dialogInterface.cancel();
                }
            });
            aVar.mo3065b().show();
            return;
        }
        m30801b(fileArr);
    }

    /* renamed from: as */
    private void m30798as() {
        m30812m(this.f22516ag);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m30801b(File[] fileArr) {
        for (File file : fileArr) {
            HashMap hashMap = new HashMap();
            hashMap.put("recordName", file.getName());
            hashMap.put("filePath", file.getAbsolutePath());
            this.f22520c.add(hashMap);
            this.f22519b.mo19768a(file.getName());
        }
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3, types: [int] */
    /* JADX WARNING: type inference failed for: r2v4, types: [int] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], int, ?[boolean, int, float, short, byte, char]]
      uses: [boolean, ?[int, byte, short, char], ?[int, short, byte, char], int]
      mth insns count: 49
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m30803c() {
        /*
            r8 = this;
            com.seattleclouds.modules.voicerecord.c$3 r0 = new com.seattleclouds.modules.voicerecord.c$3
            r0.<init>()
            boolean r1 = com.seattleclouds.App.m25663l()
            r2 = 0
            if (r1 == 0) goto L_0x005e
            java.lang.String r1 = com.seattleclouds.App.m25661k()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = "/VoiceRecords"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.io.File r3 = new java.io.File
            r3.<init>(r1)
            boolean r1 = r3.exists()
            if (r1 == 0) goto L_0x005d
            java.io.File[] r1 = r3.listFiles(r0)
            int r3 = r1.length
        L_0x0031:
            if (r2 >= r3) goto L_0x005d
            r4 = r1[r2]
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.String r6 = "recordName"
            java.lang.String r7 = r4.getName()
            r5.put(r6, r7)
            java.lang.String r6 = "filePath"
            java.lang.String r7 = r4.getAbsolutePath()
            r5.put(r6, r7)
            java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> r6 = r8.f22520c
            r6.add(r5)
            com.seattleclouds.modules.voicerecord.c$b r5 = r8.f22519b
            java.lang.String r4 = r4.getName()
            r5.mo19768a(r4)
            int r2 = r2 + 1
            goto L_0x0031
        L_0x005d:
            r2 = 1
        L_0x005e:
            java.lang.String r1 = com.seattleclouds.App.m25665m()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = "/VoiceRecords"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.io.File r3 = new java.io.File
            r3.<init>(r1)
            boolean r1 = r3.exists()
            if (r1 == 0) goto L_0x0088
            java.io.File[] r0 = r3.listFiles(r0)
            int r1 = r0.length
            if (r1 <= 0) goto L_0x0088
            r8.m30796a(r0, r2)
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.voicerecord.C6335c.m30803c():void");
    }

    /* renamed from: d */
    private void m30805d() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f22520c.iterator();
        while (it.hasNext()) {
            arrayList.add(((Map) it.next()).get("filePath"));
        }
        m30794a(arrayList);
    }

    /* renamed from: e */
    private void m30807e() {
        Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
        intent.setType("audio/x-wav");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{this.f22521d});
        String str = "Voice records: <br />";
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < this.f22520c.size(); i2++) {
            String str2 = (String) ((Map) this.f22520c.get(i2)).get("recordName");
            StringBuilder sb = new StringBuilder();
            sb.append(App.m25661k());
            sb.append("/VoiceRecords/");
            sb.append(str2);
            File file = new File(sb.toString());
            if (file.exists()) {
                i++;
                arrayList.add(C6598aq.m31937a(file));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(i);
                sb2.append(". ");
                sb2.append(str2);
                sb2.append("<br />");
                str = sb2.toString();
            } else {
                z = true;
            }
        }
        intent.putExtra("android.intent.extra.TEXT", Html.fromHtml(str).toString());
        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        mo1230a(Intent.createChooser(intent, null));
        if (z) {
            C6620n.m32034a((Context) mo1318s(), mo1219a(C5462k.info), mo1219a(C5462k.voicerecordlist_not_send_voice_record_from_internal_storage));
        }
    }

    /* renamed from: e */
    private void m30808e(int i) {
        String str = (String) ((Map) this.f22520c.get(i)).get("recordName");
        String str2 = (String) ((Map) this.f22520c.get(i)).get("filePath");
        StringBuilder sb = new StringBuilder();
        sb.append(App.m25661k());
        sb.append("/VoiceRecords/");
        sb.append(str);
        if (new File(sb.toString()).exists()) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{this.f22521d});
            intent.setType("audio/x-wav");
            intent.putExtra("android.intent.extra.STREAM", C6598aq.m31937a(new File(str2)));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Voice record from ");
            sb2.append(App.f18524z);
            intent.putExtra("android.intent.extra.SUBJECT", sb2.toString());
            mo1230a(intent);
            return;
        }
        Toast.makeText(mo1318s(), mo1219a(C5462k.voicerecordlist_record_cannot_be_attached), 0).show();
    }

    /* renamed from: f */
    private void m30809f(int i) {
        String str = (String) ((Map) this.f22520c.get(i)).get("filePath");
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        m30794a(arrayList);
    }

    /* renamed from: g */
    private void m30810g(final int i) {
        C0766a aVar = new C0766a(mo1318s());
        aVar.mo3063b((CharSequence) mo1219a(C5462k.voicerecordlist_delete_this_item)).mo3056a(false).mo3055a((CharSequence) mo1219a(C5462k.yes), (OnClickListener) new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                if (new File((String) ((Map) C6335c.this.f22520c.get(i)).get("filePath")).delete()) {
                    C6335c.this.f22520c.remove(i);
                    C6335c.this.f22519b.mo19767a(i);
                    if (C6335c.this.f22520c.size() == 0) {
                        C6335c.this.f22519b.mo19768a(C6335c.this.mo1219a(C5462k.voice_record_no_records));
                    }
                }
            }
        }).mo3064b((CharSequence) mo1219a(C5462k.f19440no), (OnClickListener) new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        aVar.mo3065b().show();
    }

    /* renamed from: h */
    private boolean m30811h(int i) {
        if (C6569aa.m31796a()) {
            switch (i) {
                case 32:
                    boolean z = C0452b.m2065b((Context) mo1318s(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
                    if (!z) {
                        C6569aa.m31791a((Fragment) this, 32, "android.permission.WRITE_EXTERNAL_STORAGE", new int[]{C5462k.voicerecord_permission_rationale_write_external_storage, C5462k.voicerecord_permission_write_external_storage_required_toast});
                    }
                    return !z;
                case 33:
                    boolean z2 = C0452b.m2065b((Context) mo1318s(), "android.permission.RECORD_AUDIO") == 0;
                    if (!z2) {
                        C6569aa.m31791a((Fragment) this, 33, "android.permission.RECORD_AUDIO", new int[]{C5462k.voicerecord_permission_audio_record_rational, C5462k.voicerecord_permission_audio_record_toast});
                    }
                    return !z2;
            }
        }
        return false;
    }

    /* renamed from: m */
    private void m30812m(boolean z) {
        if (!m30811h(33) && !m30811h(32) && !this.f22515af) {
            this.f22515af = true;
            Intent intent = new Intent(mo1318s(), VoiceRecordPickerActivity.class);
            intent.putExtra("recordOnOpen", z);
            startActivityForResult(intent, 2);
        }
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f22522e = layoutInflater.inflate(C5460i.voicerecord_list_view, viewGroup, false);
        mo1450b();
        return this.f22522e;
    }

    /* renamed from: a */
    public void mo1222a(int i, int i2, Intent intent) {
        super.mo1222a(i, i2, intent);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            public void run() {
                C6335c.this.f22515af = false;
            }
        }, 1000);
        if (i == 2 && i2 == -1) {
            if (this.f22520c.size() == 0) {
                this.f22519b.mo19767a(0);
            }
            String string = intent.getExtras().getString("recordName");
            String string2 = intent.getExtras().getString("filePath");
            HashMap hashMap = new HashMap();
            hashMap.put("recordName", string);
            hashMap.put("filePath", string2);
            this.f22520c.add(hashMap);
            this.f22519b.mo19768a(string);
        }
    }

    /* renamed from: a */
    public void mo1224a(int i, String[] strArr, int[] iArr) {
        switch (i) {
            case 32:
                if (!C6569aa.m31801a(strArr, iArr, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                    new Handler(Looper.myLooper()).postDelayed(new Runnable() {
                        public void run() {
                            C6570a.m31804a(false, C5462k.voicerecord_permission_write_external_storage_denied).mo1448a(C6335c.this.mo1318s().mo1469g(), "permissionDialog");
                        }
                    }, 400);
                } else {
                    Toast.makeText(mo1318s(), C5462k.common_permission_granted, 0).show();
                }
                return;
            case 33:
                if (!C6569aa.m31801a(strArr, iArr, "android.permission.RECORD_AUDIO")) {
                    new Handler(Looper.myLooper()).postDelayed(new Runnable() {
                        public void run() {
                            C6570a.m31804a(false, C5462k.voicerecord_permission_audio_record_denied).mo1448a(C6335c.this.mo1318s().mo1469g(), "permissionDialog");
                        }
                    }, 400);
                } else {
                    Toast.makeText(mo1318s(), C5462k.common_permission_granted, 0).show();
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(C5461j.voicerecord_list_menu, menu);
        if (!this.f22524g) {
            menu.findItem(C5458g.share_by_ftp).setVisible(false);
            menu.findItem(C5458g.voicerecordlist_send_all).setShowAsAction(1);
        }
        if (!this.f22523f) {
            menu.findItem(C5458g.voicerecordlist_send_all).setVisible(false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo19755a(File file, File file2) {
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        byte[] bArr = new byte[1024];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read > 0) {
                fileOutputStream.write(bArr, 0, read);
            } else {
                fileInputStream.close();
                fileOutputStream.close();
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (z) {
            this.f22520c = new ArrayList<>();
            this.f22519b.mo19766a();
            m30803c();
            if (this.f22520c.size() == 0) {
                this.f22519b.mo19768a(mo1219a(C5462k.voice_record_no_records));
            }
            if (this.f22518ai && !this.f22515af) {
                m30812m(true);
                this.f22518ai = false;
            }
        }
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C5458g.new_voicerecord) {
            m30798as();
            return true;
        } else if (itemId == C5458g.voicerecordlist_send_all) {
            m30807e();
            return true;
        } else if (itemId != C5458g.voicerecordlist_send_all_by_ftp) {
            return super.mo1245a(menuItem);
        } else {
            m30805d();
            return true;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r3v6, types: [boolean] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v6, types: [int] */
    /* JADX WARNING: type inference failed for: r2v7, types: [int] */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], int]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], boolean, ?[int, byte, short, char], ?[int, short, byte, char], int]
      mth insns count: 71
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1450b() {
        /*
            r8 = this;
            com.seattleclouds.modules.voicerecord.c$b r0 = new com.seattleclouds.modules.voicerecord.c$b
            android.support.v4.app.h r1 = r8.mo1318s()
            r0.<init>(r1)
            r8.f22519b = r0
            android.view.View r0 = r8.f22522e
            int r1 = com.seattleclouds.C5451m.C5458g.voicerecor_list
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ListView r0 = (android.widget.ListView) r0
            r8.f22513a = r0
            android.widget.ListView r0 = r8.f22513a
            com.seattleclouds.modules.voicerecord.c$b r1 = r8.f22519b
            r0.setAdapter(r1)
            android.widget.ListView r0 = r8.f22513a
            r1 = 1
            r0.setLongClickable(r1)
            android.widget.ListView r0 = r8.f22513a
            r2 = 0
            r0.setSaveEnabled(r2)
            android.widget.ListView r0 = r8.f22513a
            com.seattleclouds.modules.voicerecord.c$1 r3 = new com.seattleclouds.modules.voicerecord.c$1
            r3.<init>()
            r0.setOnItemClickListener(r3)
            android.widget.ListView r0 = r8.f22513a
            r8.mo1241a(r0)
            android.os.Bundle r0 = r8.mo1307m()
            if (r0 == 0) goto L_0x009e
            java.lang.String r3 = "emailToSend"
            java.lang.String r3 = r0.getString(r3)
            r8.f22521d = r3
            java.lang.String r3 = r8.f22521d
            if (r3 != 0) goto L_0x004f
            java.lang.String r3 = ""
            r8.f22521d = r3
        L_0x004f:
            java.lang.String r3 = "recordOnOpen"
            boolean r3 = r0.getBoolean(r3, r2)
            java.lang.String r4 = "SHARE_OPTIONS"
            java.lang.String r4 = r0.getString(r4)
            if (r4 == 0) goto L_0x0091
            java.lang.String r5 = "ftpOnly"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x006a
            r8.f22523f = r2
            r8.f22524g = r1
            goto L_0x0091
        L_0x006a:
            r8.f22523f = r2
            r8.f22524g = r2
            java.lang.String r5 = "\\|"
            java.lang.String[] r4 = r4.split(r5)
            int r5 = r4.length
        L_0x0075:
            if (r2 >= r5) goto L_0x0091
            r6 = r4[r2]
            java.lang.String r7 = "email"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x0084
            r8.f22523f = r1
            goto L_0x008e
        L_0x0084:
            java.lang.String r7 = "ftp"
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L_0x008e
            r8.f22524g = r1
        L_0x008e:
            int r2 = r2 + 1
            goto L_0x0075
        L_0x0091:
            boolean r2 = r8.f22524g
            if (r2 == 0) goto L_0x009d
            java.lang.String r2 = "FTP_HOSTNAME"
            java.lang.String r2 = r0.getString(r2)
            r8.f22525h = r2
        L_0x009d:
            r2 = r3
        L_0x009e:
            if (r2 == 0) goto L_0x00ab
            java.lang.String r3 = "ARG_IS_ROOT_FRAGMENT"
            boolean r0 = r0.containsKey(r3)
            if (r0 != 0) goto L_0x00ab
            r8.f22516ag = r1
            goto L_0x00ad
        L_0x00ab:
            r8.f22518ai = r2
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.voicerecord.C6335c.mo1450b():void");
    }

    /* renamed from: b */
    public boolean mo1271b(MenuItem menuItem) {
        AdapterContextMenuInfo adapterContextMenuInfo = (AdapterContextMenuInfo) menuItem.getMenuInfo();
        int itemId = menuItem.getItemId();
        if (itemId == C5458g.share) {
            m30808e(adapterContextMenuInfo.position);
            return true;
        } else if (itemId == C5458g.share_by_ftp) {
            m30809f(adapterContextMenuInfo.position);
            return true;
        } else if (itemId != C5458g.delete) {
            return false;
        } else {
            m30810g(adapterContextMenuInfo.position);
            return true;
        }
    }

    /* renamed from: d */
    public void mo1278d(Bundle bundle) {
        super.mo1278d(bundle);
        if (bundle != null) {
            this.f22515af = bundle.getBoolean("isCallRecord", false);
            this.f22517ah = bundle.getBoolean("mRotation", false);
        }
        if (!this.f22515af && this.f22516ag && !this.f22517ah) {
            m30812m(this.f22516ag);
        }
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        super.mo1282e(bundle);
        bundle.putBoolean("isCallRecord", this.f22515af);
        bundle.putBoolean("mRotation", true);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        mo1318s().getMenuInflater().inflate(C5461j.voicerecord_list_context_menu, contextMenu);
        if (!this.f22524g) {
            contextMenu.removeItem(C5458g.share_by_ftp);
        }
        if (!this.f22523f) {
            contextMenu.removeItem(C5458g.share);
        }
    }
}
