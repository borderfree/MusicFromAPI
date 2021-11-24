package com.google.android.exoplayer2;

public final class IllegalSeekPositionException extends IllegalStateException {
    public final long positionMs;
    public final C2717q timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(C2717q qVar, int i, long j) {
        this.timeline = qVar;
        this.windowIndex = i;
        this.positionMs = j;
    }
}
