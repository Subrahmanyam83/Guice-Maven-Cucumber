package test;
import com.fasterxml.jackson.databind.util.JSONWrappedObject;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.junit.*;
import java.io.IOException;

public class MyTest {

    @Test
    public void getActiveSessions() throws IOException {

        String url = "http://selenium.baplc.com:4444/wd/hub/sessions";

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);
        HttpResponse response = client.execute(request);
        String responseBody = EntityUtils.toString(response.getEntity());

        JSONObject jsonObject = new JSONObject(responseBody);
        System.out.println(jsonObject.getJSONObject("value").get("message"));

    }
}
