package p194nl.siegmann.epublib.domain;

import java.io.Serializable;
import p194nl.siegmann.epublib.util.C6725c;

/* renamed from: nl.siegmann.epublib.domain.GuideReference */
public class GuideReference extends TitledResourceReference implements Serializable {
    public static String ACKNOWLEDGEMENTS = "acknowledgements";
    public static String BIBLIOGRAPHY = "bibliography";
    public static String COLOPHON = "colophon";
    public static String COPYRIGHT_PAGE = "copyright-page";
    public static String COVER = "cover";
    public static String DEDICATION = "dedication";
    public static String EPIGRAPH = "epigraph";
    public static String FOREWORD = "foreword";
    public static String GLOSSARY = "glossary";
    public static String INDEX = "index";
    public static String LOI = "loi";
    public static String LOT = "lot";
    public static String NOTES = "notes";
    public static String PREFACE = "preface";
    public static String TEXT = "text";
    public static String TITLE_PAGE = "title-page";
    public static String TOC = "toc";
    private static final long serialVersionUID = -316179702440631834L;
    private String type;

    public GuideReference(Resource resource) {
        this(resource, null);
    }

    public GuideReference(Resource resource, String str) {
        super(resource, str);
    }

    public GuideReference(Resource resource, String str, String str2) {
        this(resource, str, str2, null);
    }

    public GuideReference(Resource resource, String str, String str2, String str3) {
        super(resource, str2, str3);
        this.type = C6725c.m32421a(str) ? str.toLowerCase() : null;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }
}
