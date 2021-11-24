package android.support.p009v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController.Callback;
import android.media.session.MediaController.PlaybackInfo;
import android.media.session.MediaSession.QueueItem;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.session.c */
class C0544c {

    /* renamed from: android.support.v4.media.session.c$a */
    public interface C0545a {
        /* renamed from: a */
        void mo2104a();

        /* renamed from: a */
        void mo2105a(int i, int i2, int i3, int i4, int i5);

        /* renamed from: a */
        void mo2106a(Bundle bundle);

        /* renamed from: a */
        void mo2107a(CharSequence charSequence);

        /* renamed from: a */
        void mo2108a(Object obj);

        /* renamed from: a */
        void mo2109a(String str, Bundle bundle);

        /* renamed from: a */
        void mo2110a(List<?> list);

        /* renamed from: b */
        void mo2111b(Object obj);
    }

    /* renamed from: android.support.v4.media.session.c$b */
    static class C0546b<T extends C0545a> extends Callback {

        /* renamed from: a */
        protected final T f1601a;

        public C0546b(T t) {
            this.f1601a = t;
        }

        public void onAudioInfoChanged(PlaybackInfo playbackInfo) {
            this.f1601a.mo2105a(playbackInfo.getPlaybackType(), C0547c.m2532b(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        public void onExtrasChanged(Bundle bundle) {
            this.f1601a.mo2106a(bundle);
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f1601a.mo2111b(mediaMetadata);
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f1601a.mo2108a((Object) playbackState);
        }

        public void onQueueChanged(List<QueueItem> list) {
            this.f1601a.mo2110a(list);
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f1601a.mo2107a(charSequence);
        }

        public void onSessionDestroyed() {
            this.f1601a.mo2104a();
        }

        public void onSessionEvent(String str, Bundle bundle) {
            this.f1601a.mo2109a(str, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.c$c */
    public static class C0547c {
        /* renamed from: a */
        private static int m2530a(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            switch (audioAttributes.getUsage()) {
                case 1:
                case 11:
                case 12:
                case 14:
                    return 3;
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                case 13:
                    return 1;
                default:
                    return 3;
            }
        }

        /* renamed from: a */
        public static AudioAttributes m2531a(Object obj) {
            return ((PlaybackInfo) obj).getAudioAttributes();
        }

        /* renamed from: b */
        public static int m2532b(Object obj) {
            return m2530a(m2531a(obj));
        }
    }

    /* renamed from: a */
    public static Object m2521a(C0545a aVar) {
        return new C0546b(aVar);
    }
}
