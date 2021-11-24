package com.seattleclouds.modules.podcast.player;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.content.C0456d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.C6561t;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.modules.podcast.PodcastItem;
import com.seattleclouds.modules.podcast.p183b.C6091b;
import com.seattleclouds.modules.podcast.p183b.C6091b.C6092a;
import com.seattleclouds.modules.podcast.player.PodcastPlayerService.C6142a;
import com.seattleclouds.util.C6619m;
import com.seattleclouds.util.C6620n;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/* renamed from: com.seattleclouds.modules.podcast.player.c */
public class C6146c extends C6557s implements C6092a {

    /* renamed from: a */
    private ImageView f21801a;

    /* renamed from: ae */
    private Timer f21802ae;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public PodcastItem f21803af;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public Bitmap f21804ag;

    /* renamed from: ah */
    private C6091b f21805ah;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public PodcastPlayerService f21806ai;

    /* renamed from: aj */
    private boolean f21807aj;
    /* access modifiers changed from: private */

    /* renamed from: ak */
    public boolean f21808ak;

    /* renamed from: al */
    private BroadcastReceiver f21809al = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            C6146c.this.f21823d.setImageResource(C5457f.ic_media_podcast_stop_alpha);
            C6146c.this.m30025b();
        }
    };

    /* renamed from: am */
    private BroadcastReceiver f21810am = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            C6146c.this.f21823d.setImageResource(C5457f.ic_media_podcast_play_alpha);
            C6146c.this.m30027d();
        }
    };

    /* renamed from: an */
    private BroadcastReceiver f21811an = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            C6146c.this.f21823d.setImageResource(C5457f.ic_media_podcast_play_alpha);
            C6146c.this.m30027d();
        }
    };

    /* renamed from: ao */
    private BroadcastReceiver f21812ao = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            C6146c.this.m30029e();
            C6146c.this.f21826g.setVisibility(0);
        }
    };

    /* renamed from: ap */
    private BroadcastReceiver f21813ap = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            C6146c.this.m30029e();
            C6146c.this.f21826g.setVisibility(4);
        }
    };

    /* renamed from: aq */
    private BroadcastReceiver f21814aq = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
        }
    };

    /* renamed from: ar */
    private BroadcastReceiver f21815ar = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            C6146c.this.f21823d.setImageResource(C5457f.ic_media_podcast_play_alpha);
            C6146c.this.m30027d();
            C6146c.this.m30021as();
        }
    };

    /* renamed from: as */
    private BroadcastReceiver f21816as = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            C6146c.this.f21826g.setVisibility(0);
        }
    };

    /* renamed from: at */
    private BroadcastReceiver f21817at = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            C6146c.this.f21826g.setVisibility(4);
        }
    };

    /* renamed from: au */
    private BroadcastReceiver f21818au = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            C6146c.this.m30021as();
        }
    };

    /* renamed from: av */
    private BroadcastReceiver f21819av = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            C6620n.m32027a((Context) C6146c.this.mo1318s(), C5462k.podcast_player_media_error);
        }
    };

    /* renamed from: aw */
    private final ServiceConnection f21820aw = new ServiceConnection() {
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            String str;
            PodcastPlayerService podcastPlayerService;
            C6146c.this.f21806ai = ((C6142a) iBinder).mo19339a();
            C6146c.this.f21806ai.mo19312a(C6146c.this.f21803af.getAnyMediaUri(), C6146c.this.f21808ak);
            C6146c.this.f21806ai.mo19313a(C6146c.this.f21803af.title);
            if (C6146c.this.f21803af.category == null || C6146c.this.f21803af.category.length() == 0) {
                podcastPlayerService = C6146c.this.f21806ai;
                str = C6146c.this.f21803af.podcastTitle;
            } else {
                podcastPlayerService = C6146c.this.f21806ai;
                str = C6146c.this.f21803af.category;
            }
            podcastPlayerService.mo19316b(str);
            if (C6146c.this.f21804ag != null) {
                C6146c.this.f21806ai.mo19311a(C6146c.this.f21804ag);
            }
            Bundle bundle = new Bundle();
            bundle.putSerializable("ARG_PODCAST_ITEM", C6146c.this.f21803af);
            FragmentInfo fragmentInfo = new FragmentInfo(C6146c.class.getName(), bundle);
            Intent intent = new Intent(C6146c.this.mo1318s(), AudioPlayerActivity.class);
            intent.putExtra("ARG_PAGE_FRAGMENT_INFO", fragmentInfo);
            intent.addFlags(805306368);
            C6146c.this.f21806ai.mo19310a(intent);
            C6146c.this.m30029e();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C6146c.this.f21806ai = null;
            C6146c.this.m30029e();
        }
    };

    /* renamed from: b */
    private ImageView f21821b;

    /* renamed from: c */
    private ImageButton f21822c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ImageButton f21823d;

    /* renamed from: e */
    private ImageButton f21824e;

    /* renamed from: f */
    private SeekBar f21825f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ProgressBar f21826g;

    /* renamed from: h */
    private TextView f21827h;

    /* renamed from: i */
    private TextView f21828i;

    /* renamed from: a */
    private void m30019a(int i, int i2, int i3) {
        long j = (long) i;
        int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(j);
        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(j);
        this.f21827h.setText(String.format("%02d:%02d", new Object[]{Integer.valueOf(minutes), Integer.valueOf(seconds % 60)}));
        long j2 = (long) i2;
        this.f21828i.setText(String.format("- %02d:%02d", new Object[]{Integer.valueOf(((int) TimeUnit.MILLISECONDS.toMinutes(j2)) - minutes), Integer.valueOf((((int) TimeUnit.MILLISECONDS.toSeconds(j2)) - seconds) % 60)}));
        this.f21825f.setProgress(i);
        this.f21825f.setSecondaryProgress(this.f21825f.getProgress() + ((int) (((float) this.f21825f.getMax()) * (((float) i3) / 100.0f))));
    }

    /* renamed from: a */
    private void m30020a(Bitmap bitmap) {
        this.f21804ag = bitmap;
        if (this.f21806ai != null) {
            this.f21806ai.mo19311a(this.f21804ag);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: as */
    public void m30021as() {
        int i;
        int i2;
        int i3 = 0;
        if (this.f21806ai != null) {
            i3 = this.f21806ai.mo19323h();
            i2 = this.f21806ai.mo19324i();
            i = this.f21806ai.mo19325j();
        } else {
            i2 = 0;
            i = 0;
        }
        m30019a(i2, i3, i);
    }

    /* renamed from: at */
    private void m30022at() {
        mo1318s().bindService(new Intent(mo1318s(), PodcastPlayerService.class), this.f21820aw, 1);
        this.f21807aj = true;
    }

    /* renamed from: az */
    private void m30023az() {
        if (this.f21807aj) {
            mo1318s().unbindService(this.f21820aw);
            this.f21807aj = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m30025b() {
        m30027d();
        this.f21802ae = new Timer();
        this.f21802ae.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                C0367h s = C6146c.this.mo1318s();
                if (s != null) {
                    s.runOnUiThread(new Runnable() {
                        public void run() {
                            C6146c.this.m30021as();
                        }
                    });
                }
            }
        }, 0, 500);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m30027d() {
        if (this.f21802ae != null) {
            this.f21802ae.cancel();
            this.f21802ae = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m30029e() {
        int i;
        int i2;
        int i3;
        ImageButton imageButton;
        int i4;
        boolean z = false;
        if (this.f21806ai != null) {
            m30036m(true);
            z = this.f21806ai.mo19322g();
            i3 = this.f21806ai.mo19323h();
            i2 = this.f21806ai.mo19324i();
            i = this.f21806ai.mo19325j();
        } else {
            m30036m(false);
            i3 = 0;
            i2 = 0;
            i = 0;
        }
        if (z) {
            m30025b();
            imageButton = this.f21823d;
            i4 = C5457f.ic_media_podcast_stop_alpha;
        } else {
            m30027d();
            imageButton = this.f21823d;
            i4 = C5457f.ic_media_podcast_play_alpha;
        }
        imageButton.setImageResource(i4);
        this.f21825f.setMax(i3);
        this.f21825f.setProgress(i2);
        m30019a(i2, i3, i);
    }

    /* renamed from: m */
    private void m30036m(boolean z) {
        this.f21822c.setEnabled(z);
        this.f21823d.setEnabled(z);
        this.f21824e.setEnabled(z);
        this.f21825f.setEnabled(z);
    }

    /* renamed from: L */
    public void mo1202L() {
        super.mo1202L();
        m30027d();
        m30023az();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(C5460i.fragment_podcast_audio_player, viewGroup, false);
        this.f21801a = (ImageView) frameLayout.findViewById(C5458g.imageView);
        this.f21821b = (ImageView) frameLayout.findViewById(C5458g.backgroundImageView);
        this.f21822c = (ImageButton) frameLayout.findViewById(C5458g.rewindButton);
        this.f21823d = (ImageButton) frameLayout.findViewById(C5458g.playButton);
        this.f21824e = (ImageButton) frameLayout.findViewById(C5458g.fastForwardButton);
        this.f21825f = (SeekBar) frameLayout.findViewById(C5458g.seekBar);
        this.f21826g = (ProgressBar) frameLayout.findViewById(C5458g.progressBar);
        TextView textView = (TextView) frameLayout.findViewById(C5458g.detailTextView);
        TextView textView2 = (TextView) frameLayout.findViewById(C5458g.dateTextView);
        TextView textView3 = (TextView) frameLayout.findViewById(C5458g.authorTextView);
        ((TextView) frameLayout.findViewById(C5458g.titleTextView)).setText(this.f21803af.title);
        textView.setText((this.f21803af.category == null || this.f21803af.category.length() == 0) ? this.f21803af.podcastTitle : this.f21803af.category);
        if (this.f21803af.publishedDate != null) {
            textView2.setText(this.f21803af.getFormattedDate(mo1318s()));
        } else {
            textView2.setVisibility(8);
        }
        textView3.setText(this.f21803af.author);
        this.f21827h = (TextView) frameLayout.findViewById(C5458g.positionTextView);
        this.f21828i = (TextView) frameLayout.findViewById(C5458g.durationTextView);
        this.f21823d.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (!C6146c.this.f21806ai.mo19322g()) {
                    C6146c.this.f21806ai.mo19312a(C6146c.this.f21803af.getAnyMediaUri(), true);
                } else {
                    C6146c.this.f21806ai.mo19319d();
                }
            }
        });
        this.f21822c.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C6146c.this.f21806ai.mo19320e();
            }
        });
        this.f21824e.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C6146c.this.f21806ai.mo19321f();
            }
        });
        this.f21825f.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (C6146c.this.f21806ai != null && z) {
                    C6146c.this.f21806ai.mo19309a(i);
                }
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                C6146c.this.m30027d();
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                C6146c.this.m30025b();
            }
        });
        this.f21826g.setVisibility(4);
        return frameLayout;
    }

    /* renamed from: a */
    public void mo19211a(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap != null) {
            this.f21801a.setImageBitmap(bitmap);
            this.f21821b.setImageBitmap(bitmap2);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(200);
            alphaAnimation.setStartOffset(500);
            alphaAnimation.setFillAfter(true);
            this.f21801a.startAnimation(alphaAnimation);
            this.f21821b.startAnimation(alphaAnimation);
            m30020a(bitmap);
        }
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        mo1318s().setRequestedOrientation(1);
        Bundle m = mo1307m();
        if (m != null) {
            this.f21803af = (PodcastItem) m.getSerializable("ARG_PODCAST_ITEM");
            this.f21808ak = m.getBoolean("ARG_AUTO_PLAY");
        }
        mo1318s().startService(new Intent(mo1318s(), PodcastPlayerService.class));
        m30022at();
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        m30029e();
        String anyImageUrl = this.f21803af.getAnyImageUrl();
        if (anyImageUrl != null && anyImageUrl.length() > 0) {
            this.f21805ah = new C6091b(C6619m.m32014a(mo1318s(), 140.0f));
            this.f21805ah.mo19207a((C6092a) this);
            if (VERSION.SDK_INT >= 11) {
                this.f21805ah.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[]{anyImageUrl});
            } else {
                this.f21805ah.execute(new String[]{anyImageUrl});
            }
        }
        C0456d a = C0456d.m2097a((Context) mo1318s());
        C0367h s = mo1318s();
        a.mo1844a(this.f21809al, new IntentFilter(C6143a.m29999b(s)));
        a.mo1844a(this.f21810am, new IntentFilter(C6143a.m30000c(s)));
        a.mo1844a(this.f21811an, new IntentFilter(C6143a.m30001d(mo1318s())));
        a.mo1844a(this.f21812ao, new IntentFilter(C6143a.m30006i(s)));
        a.mo1844a(this.f21813ap, new IntentFilter(C6143a.m30007j(s)));
        a.mo1844a(this.f21814aq, new IntentFilter(C6143a.m30008k(s)));
        a.mo1844a(this.f21815ar, new IntentFilter(C6143a.m30012o(s)));
        a.mo1844a(this.f21816as, new IntentFilter(C6143a.m30009l(s)));
        a.mo1844a(this.f21817at, new IntentFilter(C6143a.m30010m(s)));
        a.mo1844a(this.f21818au, new IntentFilter(C6143a.m30011n(s)));
        a.mo1844a(this.f21819av, new IntentFilter(C6143a.m30005h(s)));
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (z) {
            C6561t.m31734a((Fragment) this, (CharSequence) this.f21803af.podcastTitle != null ? this.f21803af.podcastTitle : this.f21803af.title);
        }
    }

    /* renamed from: c */
    public void mo1453c() {
    }

    /* renamed from: i */
    public void mo1296i() {
        C0456d a = C0456d.m2097a((Context) mo1318s());
        a.mo1843a(this.f21809al);
        a.mo1843a(this.f21810am);
        a.mo1843a(this.f21811an);
        a.mo1843a(this.f21813ap);
        a.mo1843a(this.f21814aq);
        a.mo1843a(this.f21815ar);
        a.mo1843a(this.f21816as);
        a.mo1843a(this.f21817at);
        a.mo1843a(this.f21818au);
        a.mo1843a(this.f21819av);
        if (this.f21805ah != null) {
            this.f21805ah.cancel(true);
            this.f21805ah = null;
        }
        super.mo1296i();
    }
}
