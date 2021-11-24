package com.seattleclouds.modules.podcast.player;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;

/* renamed from: com.seattleclouds.modules.podcast.player.b */
public class C6144b implements OnAudioFocusChangeListener {

    /* renamed from: a */
    AudioManager f21799a;

    /* renamed from: b */
    C6145a f21800b;

    /* renamed from: com.seattleclouds.modules.podcast.player.b$a */
    public interface C6145a {
        /* renamed from: a */
        void mo19308a();

        /* renamed from: a */
        void mo19314a(boolean z);
    }

    public C6144b(Context context, C6145a aVar) {
        this.f21799a = (AudioManager) context.getSystemService("audio");
        this.f21800b = aVar;
    }

    /* renamed from: a */
    public boolean mo19340a() {
        return 1 == this.f21799a.requestAudioFocus(this, 3, 1);
    }

    /* renamed from: b */
    public boolean mo19341b() {
        return 1 == this.f21799a.abandonAudioFocus(this);
    }

    public void onAudioFocusChange(int i) {
        C6145a aVar;
        if (this.f21800b != null) {
            boolean z = true;
            if (i != 1) {
                switch (i) {
                    case -3:
                        aVar = this.f21800b;
                        break;
                    case -2:
                    case -1:
                        aVar = this.f21800b;
                        z = false;
                        break;
                }
                aVar.mo19314a(z);
            } else {
                this.f21800b.mo19308a();
            }
        }
    }
}
