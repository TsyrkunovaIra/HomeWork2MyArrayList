package com.home.project.homeWork4;
import java.util.ArrayList;
import java.util.List;
public class GameWorld implements Game{
    private List<User> users;
    private String newsGame;
    public GameWorld(){
        users = new ArrayList<>();
    }
    public void setNewsGame(String news) {
        this.newsGame = news;
        notifyGame();
    }
    @Override
    public void registerUser(User user) {
        users.add(user);
    }
    @Override
    public void removeUser(User user) {
        users.remove(user);
    }
    @Override
    public void notifyGame() {
        for (User user : users)
            user.update(newsGame);
    }
}
