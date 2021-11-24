package com.bumptech.glide.load.p042a;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.a.n */
public class C1289n extends C1287l<InputStream> {

    /* renamed from: a */
    private static final UriMatcher f4524a = new UriMatcher(-1);

    static {
        f4524a.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        f4524a.addURI("com.android.contacts", "contacts/lookup/*", 1);
        f4524a.addURI("com.android.contacts", "contacts/#/photo", 2);
        f4524a.addURI("com.android.contacts", "contacts/#", 3);
        f4524a.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        f4524a.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public C1289n(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: a */
    private InputStream m6815a(ContentResolver contentResolver, Uri uri) {
        return Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    /* renamed from: c */
    private InputStream m6816c(Uri uri, ContentResolver contentResolver) {
        int match = f4524a.match(uri);
        if (match != 1) {
            if (match == 3) {
                return m6815a(contentResolver, uri);
            }
            if (match != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri lookupContact = Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            return m6815a(contentResolver, lookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public InputStream mo5927b(Uri uri, ContentResolver contentResolver) {
        InputStream c = m6816c(uri, contentResolver);
        if (c != null) {
            return c;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("InputStream is null for ");
        sb.append(uri);
        throw new FileNotFoundException(sb.toString());
    }

    /* renamed from: a */
    public Class<InputStream> mo5924a() {
        return InputStream.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5926a(InputStream inputStream) {
        inputStream.close();
    }
}
