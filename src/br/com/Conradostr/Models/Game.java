package br.com.Conradostr.Models;


public class Game {
    private String title;
    private String thamb;

    public Game(InfoGame infoGame){
        this.title = infoGame.info().title();
        this.thamb = infoGame.info().thumb();
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", tamb='" + thamb + '\'' +
                '}';
    }
}
