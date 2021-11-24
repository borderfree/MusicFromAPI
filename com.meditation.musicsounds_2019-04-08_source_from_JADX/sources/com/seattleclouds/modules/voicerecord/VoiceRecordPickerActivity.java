package com.seattleclouds.modules.voicerecord;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaRecorder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p009v4.content.C0452b;
import android.support.p023v7.app.C0767e;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6348n;
import com.seattleclouds.util.C6569aa;
import com.seattleclouds.util.C6569aa.C6570a;
import com.seattleclouds.util.C6598aq;
import com.seattleclouds.util.C6620n;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import p194nl.siegmann.epublib.domain.TableOfContents;

public class VoiceRecordPickerActivity extends C6348n {

    /* renamed from: A */
    private Drawable f22442A = null;

    /* renamed from: B */
    private Drawable f22443B = null;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public long f22444C = 0;

    /* renamed from: D */
    private boolean f22445D = false;

    /* renamed from: E */
    private boolean f22446E = false;

    /* renamed from: F */
    private boolean f22447F = true;

    /* renamed from: n */
    private boolean f22448n = false;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f22449o = false;

    /* renamed from: p */
    private boolean f22450p = false;

    /* renamed from: q */
    private boolean f22451q = false;

    /* renamed from: r */
    private boolean f22452r = false;

    /* renamed from: s */
    private String f22453s = "";

    /* renamed from: t */
    private String f22454t = null;

    /* renamed from: u */
    private String f22455u = null;

    /* renamed from: v */
    private ImageButton f22456v = null;

    /* renamed from: w */
    private ImageButton f22457w = null;

    /* renamed from: x */
    private TextView f22458x = null;

    /* renamed from: y */
    private MediaRecorder f22459y = null;

    /* renamed from: z */
    private Timer f22460z = null;

    /* renamed from: c */
    private void m30735c(boolean z) {
        if (!z) {
            Intent intent = new Intent();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f22454t);
            sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
            sb.append(this.f22455u);
            intent.putExtra("filePath", sb.toString());
            intent.putExtra("savePath", this.f22454t);
            intent.putExtra("recordName", this.f22455u);
            setResult(-1, intent);
        } else {
            setResult(0);
        }
        this.f22447F = z;
        finish();
    }

    /* renamed from: n */
    private void m30737n() {
        if (!m30744w()) {
            if (getPackageManager().hasSystemFeature("android.hardware.microphone") || Integer.parseInt(VERSION.SDK) <= 7) {
                this.f22456v.setImageDrawable(this.f22442A);
                this.f22456v.setEnabled(true);
                this.f22457w.setEnabled(false);
                this.f22444C = 0;
                this.f22458x.setText("00:00:00");
                StringBuilder sb = new StringBuilder();
                sb.append(this.f22454t);
                sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
                sb.append(this.f22455u);
                String sb2 = sb.toString();
                if (this.f22459y != null) {
                    this.f22459y.reset();
                    this.f22459y.release();
                    this.f22459y = null;
                }
                this.f22459y = new MediaRecorder();
                this.f22459y.setAudioSource(1);
                if (this.f22452r) {
                    this.f22459y.setOutputFormat(2);
                    this.f22459y.setAudioEncoder(3);
                } else {
                    this.f22459y.setOutputFormat(1);
                    this.f22459y.setAudioEncoder(1);
                }
                this.f22459y.setOutputFile(sb2);
                try {
                    this.f22459y.prepare();
                    this.f22446E = true;
                } catch (Exception e) {
                    this.f22446E = false;
                    Log.d("SCVoiceRecordPicker", "Exception", e);
                }
                return;
            }
            this.f22456v.setEnabled(false);
            this.f22457w.setEnabled(false);
            Toast.makeText(this, getResources().getString(C5462k.voicerecord_picker_no_michrophone_message), 1).show();
            this.f22446E = false;
        }
    }

    /* renamed from: q */
    private void m30738q() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f22454t);
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append(this.f22455u);
        File file = new File(sb.toString());
        if (file.exists()) {
            file.delete();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m30739r() {
        if (this.f22449o) {
            try {
                this.f22459y.stop();
            } catch (RuntimeException e) {
                Log.e("recorderstop", e.toString());
            }
        }
        this.f22451q = true;
        this.f22449o = false;
        m30742u();
        this.f22457w.setEnabled(false);
        this.f22456v.setEnabled(false);
        if (this.f22445D) {
            m30735c(false);
        }
        if (!isFinishing()) {
            invalidateOptionsMenu();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m30740s() {
        if (!m30744w()) {
            this.f22449o = true;
            this.f22451q = false;
            m30741t();
            if (this.f22459y == null) {
                m30737n();
            }
            this.f22459y.start();
            this.f22457w.setEnabled(true);
            this.f22456v.setEnabled(false);
            invalidateOptionsMenu();
        }
    }

    /* renamed from: t */
    private void m30741t() {
        if (this.f22460z == null) {
            this.f22460z = new Timer();
            this.f22460z.schedule(new TimerTask() {
                public void run() {
                    VoiceRecordPickerActivity.this.f22444C = VoiceRecordPickerActivity.this.f22444C + 500;
                    VoiceRecordPickerActivity.this.runOnUiThread(new Runnable() {
                        public void run() {
                            VoiceRecordPickerActivity.this.mo16842m();
                        }
                    });
                }
            }, 500, 500);
        }
    }

    /* renamed from: u */
    private void m30742u() {
        if (this.f22460z != null) {
            this.f22460z.cancel();
            this.f22460z.purge();
            this.f22460z = null;
        }
    }

    /* renamed from: v */
    private void m30743v() {
        if (this.f22450p) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{this.f22453s});
            intent.setType("audio/x-wav");
            StringBuilder sb = new StringBuilder();
            sb.append(this.f22454t);
            sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
            sb.append(this.f22455u);
            intent.putExtra("android.intent.extra.STREAM", C6598aq.m31937a(new File(sb.toString())));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Voice record from ");
            sb2.append(App.f18524z);
            intent.putExtra("android.intent.extra.SUBJECT", sb2.toString());
            startActivity(intent);
            return;
        }
        C6620n.m32034a((Context) this, "Info", "Can not send voice record from internal storage.");
    }

    /* renamed from: w */
    private boolean m30744w() {
        if (!C6569aa.m31796a()) {
            return false;
        }
        boolean z = C0452b.m2065b((Context) this, "android.permission.RECORD_AUDIO") == 0;
        if (!z) {
            C6569aa.m31795a((C0767e) this, 34, "android.permission.RECORD_AUDIO", new int[]{C5462k.feedback_permission_microphone_rational, C5462k.feedback_permission_microphone_required_toast});
        }
        return !z;
    }

    @SuppressLint({"DefaultLocale"})
    /* renamed from: a */
    public String mo19732a(long j) {
        String format = String.format("%%0%dd", new Object[]{Integer.valueOf(2)});
        long j2 = j / 1000;
        String format2 = String.format(format, new Object[]{Long.valueOf(j2 % 60)});
        String format3 = String.format(format, new Object[]{Long.valueOf((j2 % 3600) / 60)});
        String format4 = String.format(format, new Object[]{Long.valueOf(j2 / 3600)});
        StringBuilder sb = new StringBuilder();
        sb.append(format4);
        sb.append(":");
        sb.append(format3);
        sb.append(":");
        sb.append(format2);
        return sb.toString();
    }

    /* renamed from: m */
    public void mo16842m() {
        ImageButton imageButton;
        Drawable drawable;
        if (this.f22444C - ((long) ((int) this.f22444C)) == 0) {
            if (this.f22456v.getDrawable() == this.f22442A) {
                imageButton = this.f22456v;
                drawable = this.f22443B;
            } else {
                imageButton = this.f22456v;
                drawable = this.f22442A;
            }
            imageButton.setImageDrawable(drawable);
        }
        this.f22458x.setText(mo19732a(this.f22444C));
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"SimpleDateFormat"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5460i.voicerecord_picker_view);
        setResult(0);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f22448n = extras.getBoolean("sendonly");
            this.f22453s = extras.getString("emailToSend");
            this.f22455u = extras.getString("recordName");
            this.f22454t = extras.getString("recordName");
            this.f22445D = extras.getBoolean("recordOnOpen", false);
            this.f22452r = extras.getBoolean("calledFromFeedbackFragment", false);
        }
        if (this.f22454t == null || this.f22454t.length() == 0) {
            if (App.m25663l()) {
                this.f22454t = App.m25661k();
                this.f22450p = true;
            } else {
                this.f22454t = App.m25665m();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f22454t);
            sb.append("/VoiceRecords");
            this.f22454t = sb.toString();
            File file = new File(this.f22454t);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        if (this.f22455u == null || this.f22455u.length() == 0) {
            String format = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(new Date());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(format);
            sb2.append(".wav");
            this.f22455u = sb2.toString();
        }
        if (this.f22453s == null) {
            this.f22453s = "";
        }
        this.f22458x = (TextView) findViewById(C5458g.vrl_time_label);
        this.f22456v = (ImageButton) findViewById(C5458g.vrl_record_button);
        this.f22456v.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (!VoiceRecordPickerActivity.this.f22449o) {
                    VoiceRecordPickerActivity.this.m30740s();
                }
            }
        });
        this.f22457w = (ImageButton) findViewById(C5458g.vrl_stoprecord_button);
        this.f22457w.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (VoiceRecordPickerActivity.this.f22449o) {
                    VoiceRecordPickerActivity.this.m30739r();
                }
            }
        });
        this.f22457w.setEnabled(false);
        this.f22442A = getResources().getDrawable(C5457f.vr_record);
        this.f22443B = getResources().getDrawable(C5457f.vr_record_stop);
        m30737n();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C5461j.voicerecord_picker_menu, menu);
        if (this.f22448n) {
            menu.findItem(C5458g.vrl_menu_use).setTitle(C5462k.send_voicerecord);
        }
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        if (this.f22447F) {
            m30738q();
        }
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C5458g.vrl_menu_use) {
            if (this.f22448n) {
                m30743v();
            } else {
                m30735c(false);
            }
            return true;
        } else if (itemId == C5458g.vrl_menu_retake) {
            if (this.f22459y != null) {
                this.f22459y.reset();
            }
            this.f22451q = false;
            m30737n();
            invalidateOptionsMenu();
            return true;
        } else if (itemId != C5458g.vrl_menu_cancel) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            m30738q();
            m30735c(true);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        if (this.f22449o && this.f22459y != null) {
            m30739r();
        }
        super.onPause();
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        if (this.f22449o) {
            menu.findItem(C5458g.vrl_menu_retake).setEnabled(false);
            menu.findItem(C5458g.vrl_menu_retake).setVisible(false);
        } else {
            menu.findItem(C5458g.vrl_menu_retake).setEnabled(true);
            menu.findItem(C5458g.vrl_menu_retake).setVisible(true);
        }
        if (!this.f22451q) {
            menu.findItem(C5458g.vrl_menu_retake).setEnabled(false);
            menu.findItem(C5458g.vrl_menu_retake).setVisible(false);
            menu.findItem(C5458g.vrl_menu_use).setEnabled(false);
            menu.findItem(C5458g.vrl_menu_use).setVisible(false);
        } else {
            menu.findItem(C5458g.vrl_menu_use).setEnabled(true);
            menu.findItem(C5458g.vrl_menu_use).setVisible(true);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 34) {
            if (!C6569aa.m31801a(strArr, iArr, "android.permission.RECORD_AUDIO")) {
                new Handler(Looper.myLooper()).postDelayed(new Runnable() {
                    public void run() {
                        C6570a.m31804a(false, C5462k.feedback_permission_microphone_denied).mo1448a(VoiceRecordPickerActivity.this.mo1469g(), "permissionDialog");
                    }
                }, 400);
            } else {
                Toast.makeText(this, C5462k.common_permission_granted, 0).show();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        if (this.f22445D && this.f22446E) {
            m30740s();
        }
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        if (this.f22459y != null) {
            this.f22459y.release();
            this.f22459y = null;
        }
        super.onStop();
    }
}
