package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Songs songs = new Songs();
        for(int i =1;i<=10;i++){
            Song song = new Song();
            song.setName("somesong"+i);
            song.setFilePath("D:\\Музыка");
            songs.addSong(song.getName(),song.getFilePath());
            System.out.println(songs.songs.get(i-1).getName());
        }
           String filePath = "D:\\songslist.txt";

                SongsFile sf = new SongsFile();

                sf.writeSongsListToFile(filePath,songs.songs);




    }
}
