package com.seattleclouds.modules.podcast;

import android.content.Context;
import android.net.Uri;
import android.text.format.DateFormat;
import java.io.Serializable;
import java.util.Date;

public class PodcastItem implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private transient Uri f21534a;
    public String author;

    /* renamed from: b */
    private transient Uri f21535b;
    public String category;
    public Date downloadDate;
    public String error;
    public String imageUrl;
    public String length;
    public String link;
    public String mediaUrlString;
    public String podcastImageUrl;
    public String podcastTitle;
    public String podcastUrl;
    public String posterUrl;
    public Date publishedDate;
    public String summary;
    public String title;
    public String type;

    /* renamed from: a */
    private boolean m29694a(PodcastItem podcastItem) {
        if (!this.mediaUrlString.equalsIgnoreCase(podcastItem.mediaUrlString)) {
            return false;
        }
        if (this.publishedDate == null || podcastItem.publishedDate == null) {
            return true;
        }
        return this.publishedDate.equals(podcastItem.publishedDate);
    }

    public boolean equals(Object obj) {
        return obj instanceof PodcastItem ? m29694a((PodcastItem) obj) : super.equals(obj);
    }

    public String getAnyImageUrl() {
        return (this.imageUrl == null || this.imageUrl.length() <= 0) ? this.podcastImageUrl : this.imageUrl;
    }

    public Uri getAnyMediaUri() {
        if (getMediaUri() == null) {
            updateMediaUri();
        }
        return getLocalUri() != null ? getLocalUri() : getMediaUri();
    }

    public String getFormattedDate(Context context) {
        if (this.publishedDate == null || context == null) {
            return null;
        }
        return DateFormat.getDateFormat(context).format(this.publishedDate);
    }

    public Uri getLocalUri() {
        if (this.f21535b == null) {
            this.f21535b = C6139g.m29948a(this);
        }
        return this.f21535b;
    }

    public Uri getMediaUri() {
        if (this.f21534a == null) {
            this.f21534a = Uri.parse(this.mediaUrlString);
        }
        return this.f21534a;
    }

    public String getPosterUrl() {
        return this.posterUrl;
    }

    public int hashCode() {
        return this.publishedDate != null ? this.mediaUrlString.hashCode() ^ this.publishedDate.hashCode() : this.mediaUrlString.hashCode();
    }

    public boolean isDownloaded() {
        return getLocalUri() != null;
    }

    public void updateMediaUri() {
        this.f21535b = null;
    }
}
