package com.home.project.homeWork4;
public class Player {
    private String location;
    private String userName;
    private Player(PlayerBuilder playerBuilder){
        location = playerBuilder.location;
        userName = playerBuilder.userName;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public static class PlayerBuilder {
        private final String location;
        private final String userName;

        public PlayerBuilder(String location, String userName){
            this.location = location;
            this.userName = userName;
        }

        public Player registration() {
            return new Player(this);
        }
    }
}

