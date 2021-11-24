package com.seattleclouds.modules.podcast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class PodcastCategory implements Serializable {
    private static final long serialVersionUID = 0;
    public ArrayList<PodcastItem> items = new ArrayList<>();
    public PodcastItem lastPodcastItem;
    public String title;

    public Date getLastItemPublishDate() {
        if (this.lastPodcastItem != null) {
            return this.lastPodcastItem.publishedDate;
        }
        return null;
    }
}
