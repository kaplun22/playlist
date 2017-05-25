package com.company;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by KaPLu on 23.05.2017.
 */
public class SongsFile {

    public  void writeSongsListToFile(String filePath, ArrayList<Song> songs) {

        File file = new File(filePath);

        String textToWrite ="";


        for (Song song :songs){
            textToWrite += song.getName()+" "+ song.getFilePath()+"\n";
        }

        for (Song song : songs) {
            try {
                FileWriter fw = new FileWriter(file);
                fw.write(textToWrite);
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            catch (IndexOutOfBoundsException i){
                i.printStackTrace();
            }
        }
    }

        public String getSongsListFromFile(String filePath){
            String songAsText="";

            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader(filePath));

            String line;
                while ((line = br.readLine())!=null){
                    songAsText +=line;
                    br.close();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return songAsText;
    }

    }

