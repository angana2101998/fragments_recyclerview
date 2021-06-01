package com.example.fragments_comm;

public class RecipeModel {
    int pic;
    String text;

    public RecipeModel(int pic, String labrador) {
        this.pic = pic;
        this.text=labrador;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

