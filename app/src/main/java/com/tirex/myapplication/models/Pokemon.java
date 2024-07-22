package com.tirex.myapplication.models;

public class Pokemon {
    private int number;
    private String name;
    private String url;

    // Getter para url
    public String getUrl() {
        return url;
    }

    // Setter para url
    public void setUrl(String url) {
        this.url = url;
    }

    // Getter para name
    public String getName() {
        return name;
    }

    // Setter para name
    public void setName(String name) {
        this.name = name;
    }

    // Getter para number
    public int getNumber() {
        if (number == 0 && url != null) {
            // Extrae el número de la URL si number no ha sido asignado
            String[] urlPartes = url.split("/");
            number = Integer.parseInt(urlPartes[urlPartes.length - 1].replace(".png", ""));
        }
        return number;
    }

    // Setter para number
    public void setNumber(int number) {
        this.number = number;
    }
}
