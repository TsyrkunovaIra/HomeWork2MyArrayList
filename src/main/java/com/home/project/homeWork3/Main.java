package com.home.project.homeWork3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        String[] oceans = {"тихий", " атлантический", "индийский "};
        String[]countries = {"США", " Индия", "ЮАР "};
        String[] continents = {"Сереная Америка","Евразия ","Африка "};

        World world = new World(oceans, continents,countries);

        FileOutputStream outputStream = new FileOutputStream("I:\\ДЗ\\save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(world);
        objectOutputStream.close();



        try {
            FileWriter writer = new FileWriter("homeWork3.txt");
            writer.write("Java");
            writer.close();
        }catch (IOException e){
            System.out.println("exception");
            e.printStackTrace();
        }







    }



    }

