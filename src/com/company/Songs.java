package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by KaPLu on 23.05.2017.
 */
public class Songs {
    public ArrayList<Song> songs = new ArrayList<>();

    public void addSong (String name,String filePath){
        Song song = new Song();
        song.setName(name);
        song.setFilePath(filePath);
        songs.add(song);
    }

    public void delSong (String name,String filePath){
        Song song = new Song();
        song.setName(name);
        song.setFilePath(filePath);
        songs.remove(song);
    }

    public  ArrayList<Song> getMixed(){
        ArrayList<Song> mixedList = new ArrayList<>();
        if(songs.isEmpty()){
            return mixedList;
        }
        ArrayList<Song> tempList = songs;
        for(Song song:songs){
            tempList.add(song);

        }


        Random random = new Random();
        while(!tempList.isEmpty()){
            int index = random.nextInt(tempList.size());
            mixedList.add(tempList.get(index));
            tempList.remove(index);
        }

        return mixedList;

    }


}
