package com.seattleclouds.modules.videolist;

import android.util.Xml;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: com.seattleclouds.modules.videolist.c */
public class C6320c {

    /* renamed from: a */
    private static final String f22441a = null;

    /* renamed from: a */
    private List<VideoFile> m30726a(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, f22441a, "pageConfig");
        List<VideoFile> list = null;
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("videoitems")) {
                    list = m30727b(xmlPullParser);
                } else {
                    m30729d(xmlPullParser);
                }
            }
        }
        return list;
    }

    /* renamed from: b */
    private List<VideoFile> m30727b(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, f22441a, "videoitems");
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("videoitem")) {
                    arrayList.add(m30728c(xmlPullParser));
                } else {
                    m30729d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, f22441a, "videoitems");
        return arrayList;
    }

    /* renamed from: c */
    private VideoFile m30728c(XmlPullParser xmlPullParser) {
        long j;
        xmlPullParser.require(2, f22441a, "videoitem");
        String attributeValue = xmlPullParser.getAttributeValue(null, "uid") != null ? xmlPullParser.getAttributeValue(null, "uid") : "";
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "title") != null ? xmlPullParser.getAttributeValue(null, "title") : "";
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "image_thmb") != null ? xmlPullParser.getAttributeValue(null, "image_thmb") : "";
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "file_url") != null ? xmlPullParser.getAttributeValue(null, "file_url") : "";
        String attributeValue5 = xmlPullParser.getAttributeValue(null, "file_size");
        if (attributeValue5 == null) {
            attributeValue5 = "0";
        }
        try {
            j = Long.parseLong(attributeValue5);
        } catch (NumberFormatException unused) {
            j = 0;
        }
        String attributeValue6 = xmlPullParser.getAttributeValue(null, "file_modified_date");
        if (attributeValue6 == null) {
            attributeValue6 = "NA";
        }
        String str = attributeValue6;
        xmlPullParser.next();
        xmlPullParser.require(3, f22441a, "videoitem");
        VideoFile videoFile = new VideoFile(attributeValue, attributeValue2, attributeValue3, attributeValue4, j, str);
        return videoFile;
    }

    /* renamed from: d */
    private void m30729d(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (i != 0) {
                switch (xmlPullParser.next()) {
                    case 2:
                        i++;
                        break;
                    case 3:
                        i--;
                        break;
                }
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public List<VideoFile> mo19731a(InputStream inputStream) {
        try {
            XmlPullParser newPullParser = Xml.newPullParser();
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            newPullParser.setInput(inputStream, null);
            newPullParser.nextTag();
            return m30726a(newPullParser);
        } finally {
            inputStream.close();
        }
    }
}
