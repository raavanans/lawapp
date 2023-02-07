package com.example.actapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

import java.net.MalformedURLException;
import java.net.URL;

public class Casestudyactivity extends AppCompatActivity implements View.OnClickListener {



    public static final int PERMISSION_STORAGE_CODE = 1000;
    Button downloadbtn;
    PDFView pdfView;
    String urll = "https://indiankanoon.org/doc/1857950/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casestudyactivity);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        String casestudybook = getIntent().getExtras().getString("CASESTUDYBOOK");



        pdfView = findViewById(R.id.pdfview);
        pdfView.fromAsset(casestudybook).defaultPage(0).enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(this)).spacing(2).load();


        Button start = (Button) findViewById(R.id.downloadbtn);
        start.setOnClickListener(this);

    }
    
    
    @Override
    protected void onResume() {
        super.onResume();

        registerReceiver(receiver, new IntentFilter(MyIntentService.NOTIFICATION));


    }

    @Override
    protected void onPause() {
        super.onPause();

        unregisterReceiver(receiver); 
        
    }
    public void onClick(View view){

        String url = urll;
        Intent intent = new Intent(this, MyIntentService.class);
        intent.putExtra(MyIntentService.FILENAME, "A_K_Gopalan_vs_The_State_Of_Madras_Union_Of_on_19_May_1950.PDF");
        intent.putExtra(MyIntentService.URL,"https://indiankanoon.org/doc/1857950/ ");

        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
        request.setTitle("Download");
        request.setDescription("Downloading");
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,"" + System.currentTimeMillis());

        DownloadManager manager = (DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
        manager.enqueue(request);
        startService(intent);

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case PERMISSION_STORAGE_CODE: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    startService(getIntent());

                } else {
                    Toast.makeText(this, "Permission denied.", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }







    private BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            Bundle bundle = intent.getExtras();
            if(bundle != null){
                String string = bundle.getString(MyIntentService.FILEPATH);
                int resultcode = bundle.getInt(MyIntentService.RESULT);
                if(resultcode == RESULT_OK){
                    Toast.makeText(Casestudyactivity.this, "Download complete. Download URI: " + string, Toast.LENGTH_LONG).show();

                }else {
                    Toast.makeText(Casestudyactivity.this, "Download failed", Toast.LENGTH_LONG).show();

                }
            }
        }
    };

}

