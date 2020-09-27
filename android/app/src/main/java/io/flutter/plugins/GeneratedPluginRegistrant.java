package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import com.example.appsettings.AppSettingsPlugin;
import dev.gilder.tom.apple_sign_in.AppleSignInPlugin;
import io.flutter.plugins.connectivity.ConnectivityPlugin;
import com.dsi.facebook_audience_network.FacebookAudienceNetworkPlugin;
import io.flutter.plugins.firebaseadmob.FirebaseAdMobPlugin;
import io.flutter.plugins.firebaseanalytics.FirebaseAnalyticsPlugin;
import io.flutter.plugins.firebaseauth.FirebaseAuthPlugin;
import io.flutter.plugins.firebase.core.FirebaseCorePlugin;
import io.flutter.plugins.firebase.database.FirebaseDatabasePlugin;
import io.flutter.plugins.firebasemessaging.FirebaseMessagingPlugin;
import com.roughike.facebooklogin.facebooklogin.FacebookLoginPlugin;
import io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin;
import com.fuyumi.flutterstatusbarcolor.flutterstatusbarcolor.FlutterStatusbarcolorPlugin;
import com.flutter_webview_plugin.FlutterWebviewPlugin;
import io.flutter.plugins.googlemaps.GoogleMapsPlugin;
import io.flutter.plugins.googlesignin.GoogleSignInPlugin;
import com.lyokone.location.LocationPlugin;
import com.vanethos.notification_permissions.NotificationPermissionsPlugin;
import com.onesignal.flutter.OneSignalPlugin;
import io.flutter.plugins.pathprovider.PathProviderPlugin;
import fr.skyost.rate_my_app.RateMyAppPlugin;
import flutter.plugins.screen.screen.ScreenPlugin;
import io.flutter.plugins.share.SharePlugin;
import io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin;
import com.tekartik.sqflite.SqflitePlugin;
import name.avioli.unilinks.UniLinksPlugin;
import io.flutter.plugins.urllauncher.UrlLauncherPlugin;
import io.flutter.plugins.videoplayer.VideoPlayerPlugin;
import creativecreatorormaybenot.wakelock.WakelockPlugin;
import io.flutter.plugins.webviewflutter.WebViewFlutterPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    AppSettingsPlugin.registerWith(registry.registrarFor("com.example.appsettings.AppSettingsPlugin"));
    AppleSignInPlugin.registerWith(registry.registrarFor("dev.gilder.tom.apple_sign_in.AppleSignInPlugin"));
    ConnectivityPlugin.registerWith(registry.registrarFor("io.flutter.plugins.connectivity.ConnectivityPlugin"));
    FacebookAudienceNetworkPlugin.registerWith(registry.registrarFor("com.dsi.facebook_audience_network.FacebookAudienceNetworkPlugin"));
    FirebaseAdMobPlugin.registerWith(registry.registrarFor("io.flutter.plugins.firebaseadmob.FirebaseAdMobPlugin"));
    FirebaseAnalyticsPlugin.registerWith(registry.registrarFor("io.flutter.plugins.firebaseanalytics.FirebaseAnalyticsPlugin"));
    FirebaseAuthPlugin.registerWith(registry.registrarFor("io.flutter.plugins.firebaseauth.FirebaseAuthPlugin"));
    FirebaseCorePlugin.registerWith(registry.registrarFor("io.flutter.plugins.firebase.core.FirebaseCorePlugin"));
    FirebaseDatabasePlugin.registerWith(registry.registrarFor("io.flutter.plugins.firebase.database.FirebaseDatabasePlugin"));
    FirebaseMessagingPlugin.registerWith(registry.registrarFor("io.flutter.plugins.firebasemessaging.FirebaseMessagingPlugin"));
    FacebookLoginPlugin.registerWith(registry.registrarFor("com.roughike.facebooklogin.facebooklogin.FacebookLoginPlugin"));
    FlutterAndroidLifecyclePlugin.registerWith(registry.registrarFor("io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin"));
    FlutterStatusbarcolorPlugin.registerWith(registry.registrarFor("com.fuyumi.flutterstatusbarcolor.flutterstatusbarcolor.FlutterStatusbarcolorPlugin"));
    FlutterWebviewPlugin.registerWith(registry.registrarFor("com.flutter_webview_plugin.FlutterWebviewPlugin"));
    GoogleMapsPlugin.registerWith(registry.registrarFor("io.flutter.plugins.googlemaps.GoogleMapsPlugin"));
    GoogleSignInPlugin.registerWith(registry.registrarFor("io.flutter.plugins.googlesignin.GoogleSignInPlugin"));
    LocationPlugin.registerWith(registry.registrarFor("com.lyokone.location.LocationPlugin"));
    NotificationPermissionsPlugin.registerWith(registry.registrarFor("com.vanethos.notification_permissions.NotificationPermissionsPlugin"));
    OneSignalPlugin.registerWith(registry.registrarFor("com.onesignal.flutter.OneSignalPlugin"));
    PathProviderPlugin.registerWith(registry.registrarFor("io.flutter.plugins.pathprovider.PathProviderPlugin"));
    RateMyAppPlugin.registerWith(registry.registrarFor("fr.skyost.rate_my_app.RateMyAppPlugin"));
    ScreenPlugin.registerWith(registry.registrarFor("flutter.plugins.screen.screen.ScreenPlugin"));
    SharePlugin.registerWith(registry.registrarFor("io.flutter.plugins.share.SharePlugin"));
    SharedPreferencesPlugin.registerWith(registry.registrarFor("io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin"));
    SqflitePlugin.registerWith(registry.registrarFor("com.tekartik.sqflite.SqflitePlugin"));
    UniLinksPlugin.registerWith(registry.registrarFor("name.avioli.unilinks.UniLinksPlugin"));
    UrlLauncherPlugin.registerWith(registry.registrarFor("io.flutter.plugins.urllauncher.UrlLauncherPlugin"));
    VideoPlayerPlugin.registerWith(registry.registrarFor("io.flutter.plugins.videoplayer.VideoPlayerPlugin"));
    WakelockPlugin.registerWith(registry.registrarFor("creativecreatorormaybenot.wakelock.WakelockPlugin"));
    WebViewFlutterPlugin.registerWith(registry.registrarFor("io.flutter.plugins.webviewflutter.WebViewFlutterPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
