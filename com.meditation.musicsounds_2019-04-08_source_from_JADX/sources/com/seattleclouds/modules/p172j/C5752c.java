package com.seattleclouds.modules.p172j;

import android.annotation.SuppressLint;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C6557s;
import com.seattleclouds.util.C6613i;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.seattleclouds.modules.j.c */
public class C5752c extends C6557s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public SeekBar f20396a;

    /* renamed from: ae */
    private Boolean f20397ae = Boolean.valueOf(false);
    /* access modifiers changed from: private */

    /* renamed from: af */
    public MediaPlayer f20398af;

    /* renamed from: ag */
    private Timer f20399ag;

    /* renamed from: ah */
    private ArrayList<C5751b> f20400ah = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public boolean f20401ai;
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public int f20402aj;

    /* renamed from: ak */
    private String f20403ak;

    /* renamed from: al */
    private String f20404al;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageButton f20405b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public WebView f20406c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Boolean f20407d = Boolean.valueOf(false);

    /* renamed from: e */
    private Boolean f20408e = Boolean.valueOf(false);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Boolean f20409f = Boolean.valueOf(false);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Boolean f20410g = Boolean.valueOf(false);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Boolean f20411h = Boolean.valueOf(false);

    /* renamed from: i */
    private Boolean f20412i = Boolean.valueOf(false);

    /* renamed from: aA */
    private void m28351aA() {
        String str;
        StringBuilder sb;
        String str2;
        try {
            this.f20398af = new MediaPlayer();
            this.f20398af.setScreenOnWhilePlaying(true);
            if (!App.f18510l) {
                if (!App.f18474G) {
                    AssetManager assets = mo1318s().getAssets();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Main/");
                    sb2.append(this.f20403ak);
                    AssetFileDescriptor openFd = assets.openFd(sb2.toString());
                    this.f20398af.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                    this.f20398af.setOnPreparedListener(new OnPreparedListener() {
                        public void onPrepared(MediaPlayer mediaPlayer) {
                            if (C5752c.this.f20402aj > 0) {
                                mediaPlayer.seekTo(C5752c.this.f20402aj);
                            }
                            C5752c.this.m28357b();
                            if (C5752c.this.f20409f.booleanValue() && C5752c.this.f20407d.booleanValue() && C5752c.this.f20401ai) {
                                C5752c.this.m28366e();
                                C5752c.this.f20405b.setImageResource(C5457f.ic_media_pause_alpha);
                            }
                            C5752c.this.f20410g = Boolean.valueOf(true);
                        }
                    });
                    this.f20398af.setOnCompletionListener(new OnCompletionListener() {
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            C5752c.this.f20405b.setImageResource(C5457f.ic_media_play_alpha);
                            C5752c.this.f20396a.setProgress(0);
                        }
                    });
                    this.f20398af.setOnSeekCompleteListener(new OnSeekCompleteListener() {
                        public void onSeekComplete(MediaPlayer mediaPlayer) {
                            C5752c.this.f20396a.setProgress(mediaPlayer.getCurrentPosition());
                        }
                    });
                    this.f20398af.prepare();
                }
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(App.m25654h());
            sb3.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
            sb3.append(this.f20403ak);
            this.f20398af.setDataSource(new FileInputStream(new File(sb3.toString())).getFD());
            this.f20398af.setOnPreparedListener(new OnPreparedListener() {
                public void onPrepared(MediaPlayer mediaPlayer) {
                    if (C5752c.this.f20402aj > 0) {
                        mediaPlayer.seekTo(C5752c.this.f20402aj);
                    }
                    C5752c.this.m28357b();
                    if (C5752c.this.f20409f.booleanValue() && C5752c.this.f20407d.booleanValue() && C5752c.this.f20401ai) {
                        C5752c.this.m28366e();
                        C5752c.this.f20405b.setImageResource(C5457f.ic_media_pause_alpha);
                    }
                    C5752c.this.f20410g = Boolean.valueOf(true);
                }
            });
            this.f20398af.setOnCompletionListener(new OnCompletionListener() {
                public void onCompletion(MediaPlayer mediaPlayer) {
                    C5752c.this.f20405b.setImageResource(C5457f.ic_media_play_alpha);
                    C5752c.this.f20396a.setProgress(0);
                }
            });
            this.f20398af.setOnSeekCompleteListener(new OnSeekCompleteListener() {
                public void onSeekComplete(MediaPlayer mediaPlayer) {
                    C5752c.this.f20396a.setProgress(mediaPlayer.getCurrentPosition());
                }
            });
            this.f20398af.prepare();
        } catch (IllegalArgumentException e) {
            e = e;
            str2 = "Karaoke";
            sb = new StringBuilder();
            str = "playSource: ";
            sb.append(str);
            sb.append(e);
            Log.e(str2, sb.toString(), e);
        } catch (IllegalStateException e2) {
            e = e2;
            str2 = "Karaoke";
            sb = new StringBuilder();
            str = "playSource: ";
            sb.append(str);
            sb.append(e);
            Log.e(str2, sb.toString(), e);
        } catch (IOException e3) {
            e = e3;
            str2 = "Karaoke";
            sb = new StringBuilder();
            str = "playSource: ";
            sb.append(str);
            sb.append(e);
            Log.e(str2, sb.toString(), e);
        } catch (Exception e4) {
            e = e4;
            str2 = "Karaoke";
            sb = new StringBuilder();
            str = "exception: ";
            sb.append(str);
            sb.append(e);
            Log.e(str2, sb.toString(), e);
        }
    }

    /* renamed from: as */
    private Boolean m28352as() {
        if (this.f20398af != null && this.f20398af.isPlaying()) {
            this.f20398af.pause();
            this.f20405b.setImageResource(C5457f.ic_media_play_alpha);
            m28354az();
        }
        return Boolean.valueOf(true);
    }

    /* renamed from: at */
    private void m28353at() {
        m28354az();
        if (this.f20399ag == null) {
            this.f20399ag = new Timer();
            this.f20399ag.schedule(new TimerTask() {
                public void run() {
                    C5752c.this.m28359c();
                }
            }, 500, 500);
        }
    }

    /* renamed from: az */
    private void m28354az() {
        if (this.f20399ag != null) {
            this.f20399ag.cancel();
            this.f20399ag = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m28357b() {
        int i;
        SeekBar seekBar;
        if (this.f20412i.booleanValue() && !this.f20397ae.booleanValue()) {
            this.f20397ae = Boolean.valueOf(true);
            if (this.f20398af != null) {
                this.f20396a.setProgress(this.f20398af.getCurrentPosition());
                this.f20396a.incrementProgressBy(100);
                seekBar = this.f20396a;
                i = this.f20398af.getDuration();
            } else {
                i = 0;
                this.f20396a.setProgress(0);
                seekBar = this.f20396a;
            }
            seekBar.setMax(i);
            this.f20396a.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
                public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                    if (seekBar.getProgress() % 500 == 0) {
                        C5752c.this.mo18428e(seekBar.getProgress());
                        C5752c.this.f20402aj = i;
                    }
                }

                public void onStartTrackingTouch(SeekBar seekBar) {
                    C5752c.this.f20411h = Boolean.valueOf(true);
                }

                public void onStopTrackingTouch(SeekBar seekBar) {
                    C5752c.this.f20411h = Boolean.valueOf(false);
                    if (C5752c.this.f20398af != null && C5752c.this.f20398af.isPlaying()) {
                        C5752c.this.f20402aj = seekBar.getProgress();
                        C5752c.this.f20398af.seekTo(C5752c.this.f20402aj);
                        C5752c.this.mo18428e(C5752c.this.f20402aj);
                    }
                }
            });
            this.f20405b.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    C5752c.this.m28364d();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m28359c() {
        if (mo1318s() != null) {
            mo1318s().runOnUiThread(new Runnable() {
                public void run() {
                    if (C5752c.this.f20398af != null && C5752c.this.f20398af.isPlaying()) {
                        if (!C5752c.this.f20411h.booleanValue()) {
                            C5752c.this.f20402aj = C5752c.this.f20398af.getCurrentPosition();
                            C5752c.this.f20396a.setProgress(C5752c.this.f20402aj);
                        }
                        C5752c.this.mo18428e(C5752c.this.f20398af.getCurrentPosition());
                    }
                }
            });
        }
    }

    /* renamed from: c */
    private void m28360c(Bundle bundle) {
        if (bundle != null) {
            this.f20402aj = bundle.getInt("STATE_CURRENT_PLAYER_POSITION", 0);
            this.f20407d = Boolean.valueOf(bundle.getBoolean("STATE_WAS_PLAYING", this.f20407d.booleanValue()));
        }
    }

    @SuppressLint({"AddJavascriptInterface", "SetJavaScriptEnabled"})
    /* renamed from: c */
    private void m28362c(String str) {
        String str2;
        String str3;
        String str4;
        this.f20406c.getSettings().setJavaScriptEnabled(true);
        String str5 = "";
        try {
            str2 = C6613i.m31991b(App.m25649e(str));
        } catch (IOException e) {
            e = e;
            str4 = "Karaoke";
            str3 = "IOException";
            Log.d(str4, str3, e);
            str2 = str5;
            this.f20406c.loadDataWithBaseURL(App.m25655h(""), str2, null, "UTF-8", null);
            this.f20406c.addJavascriptInterface(new C5750a() {
                @JavascriptInterface
                public void lineTimesParsed(String str) {
                    C5752c.this.m28365d(str);
                    C5752c.this.f20409f = Boolean.valueOf(true);
                    if (C5752c.this.f20407d.booleanValue() && C5752c.this.f20410g.booleanValue() && C5752c.this.f20401ai && C5752c.this.mo1318s() != null) {
                        C5752c.this.mo1318s().runOnUiThread(new Runnable() {
                            public void run() {
                                C5752c.this.m28366e();
                            }
                        });
                    }
                    C5752c.this.mo18428e(C5752c.this.f20396a.getProgress());
                }
            }, "karaokeJSInterface");
            this.f20406c.setWebViewClient(new WebViewClient() {
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    C5752c.this.f20406c.loadUrl("javascript:karaokeJSInterface.lineTimesParsed(getLineTimes());");
                }

                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (!str.startsWith("jumpto")) {
                        return App.m25638b(str, (Fragment) C5752c.this);
                    }
                    Log.d("Karaoke", str);
                    String substring = str.substring(str.indexOf(":") + 1);
                    if (C5752c.this.f20398af != null) {
                        C5752c.this.f20398af.seekTo(C5751b.m28343a(substring));
                    }
                    C5752c.this.mo18428e(C5751b.m28343a(substring));
                    return true;
                }
            });
        } catch (IllegalArgumentException e2) {
            e = e2;
            str4 = "Karaoke";
            str3 = "IllegalArgumentException";
            Log.d(str4, str3, e);
            str2 = str5;
            this.f20406c.loadDataWithBaseURL(App.m25655h(""), str2, null, "UTF-8", null);
            this.f20406c.addJavascriptInterface(new C5750a() {
                @JavascriptInterface
                public void lineTimesParsed(String str) {
                    C5752c.this.m28365d(str);
                    C5752c.this.f20409f = Boolean.valueOf(true);
                    if (C5752c.this.f20407d.booleanValue() && C5752c.this.f20410g.booleanValue() && C5752c.this.f20401ai && C5752c.this.mo1318s() != null) {
                        C5752c.this.mo1318s().runOnUiThread(new Runnable() {
                            public void run() {
                                C5752c.this.m28366e();
                            }
                        });
                    }
                    C5752c.this.mo18428e(C5752c.this.f20396a.getProgress());
                }
            }, "karaokeJSInterface");
            this.f20406c.setWebViewClient(new WebViewClient() {
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    C5752c.this.f20406c.loadUrl("javascript:karaokeJSInterface.lineTimesParsed(getLineTimes());");
                }

                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (!str.startsWith("jumpto")) {
                        return App.m25638b(str, (Fragment) C5752c.this);
                    }
                    Log.d("Karaoke", str);
                    String substring = str.substring(str.indexOf(":") + 1);
                    if (C5752c.this.f20398af != null) {
                        C5752c.this.f20398af.seekTo(C5751b.m28343a(substring));
                    }
                    C5752c.this.mo18428e(C5751b.m28343a(substring));
                    return true;
                }
            });
        }
        this.f20406c.loadDataWithBaseURL(App.m25655h(""), str2, null, "UTF-8", null);
        this.f20406c.addJavascriptInterface(new C5750a() {
            @JavascriptInterface
            public void lineTimesParsed(String str) {
                C5752c.this.m28365d(str);
                C5752c.this.f20409f = Boolean.valueOf(true);
                if (C5752c.this.f20407d.booleanValue() && C5752c.this.f20410g.booleanValue() && C5752c.this.f20401ai && C5752c.this.mo1318s() != null) {
                    C5752c.this.mo1318s().runOnUiThread(new Runnable() {
                        public void run() {
                            C5752c.this.m28366e();
                        }
                    });
                }
                C5752c.this.mo18428e(C5752c.this.f20396a.getProgress());
            }
        }, "karaokeJSInterface");
        this.f20406c.setWebViewClient(new WebViewClient() {
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                C5752c.this.f20406c.loadUrl("javascript:karaokeJSInterface.lineTimesParsed(getLineTimes());");
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (!str.startsWith("jumpto")) {
                    return App.m25638b(str, (Fragment) C5752c.this);
                }
                Log.d("Karaoke", str);
                String substring = str.substring(str.indexOf(":") + 1);
                if (C5752c.this.f20398af != null) {
                    C5752c.this.f20398af.seekTo(C5751b.m28343a(substring));
                }
                C5752c.this.mo18428e(C5751b.m28343a(substring));
                return true;
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m28364d() {
        if (this.f20398af == null) {
            return;
        }
        if (this.f20398af.isPlaying()) {
            m28352as();
        } else {
            m28366e();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m28365d(String str) {
        C5751b bVar;
        ArrayList<C5751b> arrayList;
        for (String split : str.split(" ")) {
            String[] split2 = split.split(",");
            switch (split2.length) {
                case 1:
                    arrayList = this.f20400ah;
                    bVar = new C5751b(split2[0], "00:00:00");
                    break;
                case 2:
                    arrayList = this.f20400ah;
                    bVar = new C5751b(split2[0], split2[1]);
                    break;
                default:
                    this.f20400ah.add(new C5751b("00:00:00", "00:00:00"));
                    continue;
            }
            arrayList.add(bVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public Boolean m28366e() {
        if (this.f20398af != null) {
            try {
                if (this.f20410g.booleanValue()) {
                    this.f20398af.start();
                    m28353at();
                    this.f20407d = Boolean.valueOf(false);
                } else {
                    this.f20398af.prepare();
                }
                this.f20398af.seekTo(this.f20402aj);
                this.f20405b.setImageResource(C5457f.ic_media_pause_alpha);
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        return Boolean.valueOf(false);
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5460i.karaoke_view, viewGroup, false);
        this.f20396a = (SeekBar) inflate.findViewById(C5458g.seekBar1);
        this.f20405b = (ImageButton) inflate.findViewById(C5458g.imageButton1);
        this.f20406c = (WebView) inflate.findViewById(C5458g.web_view);
        m28360c(bundle);
        this.f20412i = Boolean.valueOf(true);
        m28351aA();
        m28362c(this.f20404al);
        return inflate;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        this.f20402aj = 0;
        Bundle m = mo1307m();
        this.f20404al = m.getString("pageId");
        this.f20403ak = m.getString("songFile");
        this.f20407d = Boolean.valueOf(m.getBoolean("autoStart"));
        m28360c(bundle);
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        this.f20401ai = z;
        if (!z) {
            if (this.f20398af != null && this.f20410g.booleanValue()) {
                this.f20408e = Boolean.valueOf(this.f20398af.isPlaying());
            }
            m28352as();
        } else if (this.f20410g.booleanValue() && this.f20409f.booleanValue()) {
            if (this.f20407d.booleanValue() || this.f20408e.booleanValue()) {
                m28366e();
            }
        }
    }

    /* renamed from: e */
    public void mo18428e(int i) {
        for (int i2 = 0; i2 < this.f20400ah.size(); i2++) {
            if (((C5751b) this.f20400ah.get(i2)).mo18425a(i).booleanValue()) {
                WebView webView = this.f20406c;
                StringBuilder sb = new StringBuilder();
                sb.append("javascript:colorLine(");
                sb.append(i2 + 1);
                sb.append(");void(0);");
                webView.loadUrl(sb.toString());
                return;
            }
        }
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        bundle.putInt("STATE_CURRENT_PLAYER_POSITION", this.f20402aj);
        bundle.putBoolean("STATE_WAS_PLAYING", this.f20408e.booleanValue());
        super.mo1282e(bundle);
    }

    /* renamed from: i */
    public void mo1296i() {
        m28352as();
        m28354az();
        this.f20397ae = Boolean.valueOf(false);
        this.f20398af.stop();
        this.f20398af.release();
        this.f20398af = null;
        super.mo1296i();
    }
}
