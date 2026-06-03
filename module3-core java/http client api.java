import java.net.http.*;
import java.net.URI;

public class HttpDemo {

    public static void main(String[] args) throws Exception {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request =
            HttpRequest.newBuilder()
                .uri(new URI("https://api.github.com"))
                .build();

        HttpResponse<String> response =
            client.send(request,
                HttpResponse.BodyHandlers.ofString());

        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}