package com.example.naveengaur.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

    public class MainActivity extends AppCompatActivity {
    private static  final  String myurl="https://hixel-server-prototype.herokuapp.com/companydata?ticker=goog";
    private String response="";
    private JSONObject obj;
    private ArrayList<String> elements=new ArrayList<>();
    private ArrayList<String> XBRL=new ArrayList<>();
    private ArrayList<String> ratio=new ArrayList<>();
    protected static Thread thread;
    protected BufferedReader reader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        elements.add("ticker");
        elements.add("name");
        elements.add("cik");
        XBRL.add("InventoryNet");
        XBRL.add("AssetsCurrent");
        XBRL.add("CashAndCashEquivalentsAtCarryingValue");
        XBRL.add("Assets");
        XBRL.add("Liabilities");
        XBRL.add("LiabilitiesCurrent");
        XBRL.add("LiabilitiesAndStockholdersEquity");
        ratio.add("Current Ratio");
        ratio.add("Quick Ratio");
        ratio.add("Cash Ratio");
        ratio.add("Debt-to-Equity Ratio");
        ratio.add("Long Term Debt-to-Equity Ratio");






        update();


    }
    protected  void update()
    {
        thread=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    URL url = new URL(myurl);

                    reader = new BufferedReader(new InputStreamReader(url.openStream()));
                    StringBuilder stringBuilder = new StringBuilder();
                    String line;
                    String response = new String();

                    for (String l; (l = reader.readLine()) != null; response += l) ;
                    Log.d("Response", response);


                    //String  response="";


                    JSONObject obj = new JSONObject(response);
                    JSONObject identifiers = obj.getJSONObject("identifiers");


                     //String myResponse = identifiers.getString("ticker");
                      for(String element:elements ) {
                          String myResponse=identifiers.getString(element);
                          Log.d(element+"------", myResponse);
                      }

                    JSONObject xbrlElements = obj.getJSONObject("xbrlElements");

                    //String myResponse2 = xbrlElements.getString("InventoryNet");

                    for(String xbrl:XBRL) {
                        String myResponse2=xbrlElements.getString(xbrl);
                        if(myResponse2.equalsIgnoreCase("null")){
                            // Set the element to 0
                        }

                        Log.d(xbrl+"-------", myResponse2);
                    }

                    JSONObject ratios=obj.getJSONObject("ratios");
                    for(String r:ratio)
                    {
                        String myResponse3=ratios.getString(r);
                        Log.d( r+"---",myResponse3);
                    }


                }
                catch (JSONException e) {
                    e.printStackTrace();
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        });
        thread.start();
    }

}

