package com.mycompany.biblioteca;

public class Material {

    private String code, title, datePublic;

    public Material(String code, String title, String datePublic) {
        this.code = code;
        this.title = title;
        this.datePublic = datePublic;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDatePublic() {
        return datePublic;
    }

    public void setDatePublic(String datePublic) {
        this.datePublic = datePublic;
    }

}
