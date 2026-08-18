package com.mycompany.biblioteca;

public class Material {
    protected String Code;
    protected String Title;
    protected String PublicationYear;

    public Material(String code, String title, String publicationYear) {
        this.Code = code;
        this.Title = title;
        this.PublicationYear = publicationYear;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        this.Code = code;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getPublicationYear() {
        return PublicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.PublicationYear = publicationYear;
    }
}
