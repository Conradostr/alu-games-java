package br.com.Conradostr.Models;

public record InfoApiShark(String title, String thumb) {
    @Override
    public String toString() {
        return "InfoApiShark{" +
                "title='" + title + '\'' +
                ", thumb='" + thumb + '\'' +
                '}';
    }
}
