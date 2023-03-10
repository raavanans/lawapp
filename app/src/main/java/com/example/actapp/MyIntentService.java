package com.example.actapp;

import android.app.IntentService;
import android.content.Intent;
import android.os.Environment;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;


public class MyIntentService<publishResult> extends IntentService {

    private int result = Casestudyactivity.RESULT_CANCELED;
    public static final String URL = "urlpath";
    public static final String FILENAME = "filename";
    public static final String FILEPATH = "filepath";
    public static final String RESULT = "result";
    public static final String NOTIFICATION = "service receiver";



    public MyIntentService() {
        super("MyIntentService");
    }




    @Override
    protected void onHandleIntent(Intent intent) {


        String urlPath = intent.getStringExtra(URL);
        String filename = intent.getStringExtra(FILENAME);
        File output = new File(Environment.getExternalStorageDirectory(),filename);
        if(output.exists()){
            output.delete();
        }
        InputStream stream = null;
        FileOutputStream fos = null;
        try{

            URL url = new URL(urlPath);
            stream = url.openConnection().getInputStream();
            InputStreamReader reader = new InputStreamReader(stream);
            fos = new FileOutputStream(output.getPath());
            int next = -1;
            while ((next = reader.read()) != -1){
                fos.write(next);
            }
            result = Casestudyactivity.RESULT_OK;

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(stream  != null){
                try{
                    stream.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

        publishResults(output.getAbsolutePath(),result);
    }
    private void publishResults(String outputPath,int result){
        Intent intent = new Intent(NOTIFICATION);
        intent.putExtra(FILEPATH,outputPath);
        intent.putExtra(RESULT,result);
        sendBroadcast(intent);

    }

}