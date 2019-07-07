package challenge.pkg2;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;



import org.json.JSONException;
import org.json.JSONObject;


import javax.json.JsonArray;
import org.json.JSONArray;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thushapan
 */
public class JsonReader {

  private static String readAll(Reader rd) throws IOException {
    StringBuilder sb = new StringBuilder();
    int cp;
    while ((cp = rd.read()) != -1) {
      sb.append((char) cp);
    }
    return sb.toString();
  }

  public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
    try (InputStream is = new URL(url).openStream()) {
      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
      String jsonText = readAll(rd);
      
      JSONObject json = new JSONObject(jsonText);
      
      
      
      
      
      
      
            return json;

          

    }
  }

  public static void main(String[] args) throws IOException, JSONException {
    JSONObject json = readJsonFromUrl("https://doenets.lk/result/service/AlResult/");
    System.out.println(json.toString());
    System.out.println(json.get("islandRank"));
    System.out.println(json.get("year"));
    System.out.println(json.get("districtRank"));
    System.out.println(json.get("stream"));
    System.out.println(json.get("year"));
    
    System.out.println(json.get("studentInfo"));
    
     

   
    

    JSONArray recs = (JSONArray) json.get("studentInfo");
    
    
            
   
    
    
    
    
    
   
    
    

    
  }
}
