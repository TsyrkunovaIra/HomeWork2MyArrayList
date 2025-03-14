package com.home.project.homeWork4;

public class Gamer implements User {
    private String nickName;

    public Gamer(String nikName, Game game){
        this.nickName = nikName;
        game.registerUser(this);
    }

    @Override
    public void update(String game) {

    }
}
