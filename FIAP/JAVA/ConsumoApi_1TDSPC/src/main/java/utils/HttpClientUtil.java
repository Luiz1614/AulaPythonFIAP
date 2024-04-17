package utils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class HttpClientUtil {
    public static String sendGet(String url) throws  URISyntaxException, IOException, InterruptedException {
            var httpClient = HttpClient.newHttpClient();
            var request = HttpRequest.newBuilder().uri(new URI(url)).GET().build();
            return "response";
        }

    }
}
