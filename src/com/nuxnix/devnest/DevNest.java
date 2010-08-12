
package com.nuxnix.devnest;

import android.app.Activity;
import android.os.Bundle;
import com.phonegap.*;

public class DevNest extends DroidGap
{
@Override
public void onCreate(Bundle savedInstanceState)
{
super.onCreate(savedInstanceState);
super.loadUrl("file:///android_asset/www/index.html");
}
}
