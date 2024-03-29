import br.com.Conradostr.Models.Game;
import br.com.Conradostr.Models.InfoGame;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        var reading = new Scanner(System.in);

        System.out.println("Informe o id do jogo: ");
        var id = reading.nextLine();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.cheapshark.com/api/1.0/games?id="+ id))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

      var json = response.body();

      try {
          var gson = new Gson();
          var myGame = gson.fromJson(json, InfoGame.class);
          var game = new Game(myGame);
          System.out.println(game);
      } catch (Exception e) {
          System.out.println("*** Id invalido ***");
          System.out.println(e.getMessage());

      }


    }
}