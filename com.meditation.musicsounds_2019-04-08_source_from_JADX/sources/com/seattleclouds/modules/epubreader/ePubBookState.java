package com.seattleclouds.modules.epubreader;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p194nl.siegmann.epublib.domain.Book;
import p194nl.siegmann.epublib.domain.Resource;

public class ePubBookState implements Serializable {
    private static final long serialVersionUID = 0;
    public String baseUrl;
    public Book book;
    public int currentIndex = -13;
    public int error;
    public ArrayList<Guide> guideList = new ArrayList<>();
    public boolean hasCoverImage;
    public int lastIndex = -13;
    public int maxIndex = 0;
    public String resourcesPath;

    public class Guide implements Serializable {
        private static final long serialVersionUID = 0;
        private String href = "";
        private String title = "";

        public Guide(String str, String str2) {
            setTitle(str);
            setHref(str2);
        }

        public String getHref() {
            return this.href;
        }

        public String getTitle() {
            return this.title;
        }

        public void setHref(String str) {
            this.href = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }
    }

    public void addGuide(String str, String str2) {
        this.guideList.add(new Guide(str, str2));
    }

    public Bitmap getCoverImage() {
        if (!(this.book == null || this.book.getCoverImage() == null)) {
            try {
                return BitmapFactory.decodeStream(this.book.getCoverImage().getInputStream());
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public String getPageRelativePath(int i) {
        return ((Resource) this.book.getContents().get(i)).getHref();
    }
}
