# Gson uses generic type information stored in a class file when working with fields. Proguard
# removes such information by default, so configure it to keep all of it.
-keepattributes Signature

# For using GSON @Expose annotation
-keepattributes *Annotation*

# Application classes that will be serialized/deserialized over Gson
#-keep class com.google.gson.examples.android.model.** { *; }
-keep class ie.imobile.extremepush.api.model.** { *; }

# Recommended settings for other dependencies
-keep class com.loopj.android.** { *; }
-keep interface com.loopj.android.** { *; }
-keepclassmembers class ** {
@com.squareup.otto.Subscribe public *;
@com.squareup.otto.Produce public *;
}

# Required for inapp and inbox functionality
-keepclassmembers class * {
 @android.webkit.JavascriptInterface <methods>;
}

# Required for inbox functionality
-keepattributes JavascriptInterface
-keep public class ie.imobile.extremepush.ui.InboxActivity$InboxInterface
-keep public class * implements ie.imobile.extremepush.ui.InboxActivity$InboxInterface
-keepclassmembers class ie.imobile.extremepush.ui.InboxActivity$InboxInterface {
 <methods>;
}

# Required if building your app with Android 23 or lower
-dontwarn ie.imobile.extremepush.ui.PopupDialog
-dontwarn ie.imobile.extremepush.ui.WebViewActivity