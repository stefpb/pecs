package de.upb.fsln12.pecs;

import android.os.Bundle;
import org.apache.cordova.*;

public class PecsActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //super.loadUrl("file:///android_asset/www/index.html");
        super.loadUrl("http://pecs.herokuapp.com/");
    }
}