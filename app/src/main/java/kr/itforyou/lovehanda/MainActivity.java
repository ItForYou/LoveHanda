package kr.itforyou.lovehanda;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.StrictMode;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.GeolocationPermissions;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import java.lang.reflect.Method;




public class MainActivity extends AppCompatActivity {
    LinearLayout webLayout;
    RelativeLayout networkLayout;
    public static WebView webView;

    Button replayBtn;
    ProgressBar loadingProgress;
    public static boolean execBoolean = true;

    boolean isIndex = true;
    private final int AUDIO_RECORED_REQ_CODE=1500,SNS_REQ_CODE=2000;
    String firstUrl = "";
    final int REQUEST_IMAGE_CODE = 1010;
    Context mContext;
    Activity mActivity;

    private Uri cameraImageUri;
    public static String no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent startIntent = new Intent(MainActivity.this,SplashActivity.class);
        startActivityForResult(startIntent,1000);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK&&requestCode==1000){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.domain)));
            startActivity(intent);
            finish();
        }
    }
}