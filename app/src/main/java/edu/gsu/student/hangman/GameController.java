package edu.gsu.student.hangman;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by milto on 4/7/2017.
 */

public class GameController extends BaseActivity {
    String category;
    String word;
    Context mContext;
    String gameWord;
    String[] wordArray;
    String[] gameArray;
    boolean win = false;
    int wrong = 0;

    public GameController (Context context, String category) {
        this.category = category;
        this.mContext = context;
        init();
    }

    private void init(){
        selectWord();
        word2gamwArray();
        parseGameWord();
    }

    public String getWord(){
        return word;
    }

    public String getGameWord(){
        return gameWord;
    }

    private void parseGameWord(){
        gameWord = "";
        for(int i = 0; i < gameArray.length; i++) {
            gameWord += gameArray[i] + " ";
        }
    }

    private void word2gamwArray(){
        wordArray = word.split("(?!^)");
        gameArray = new String[wordArray.length];
        for(int i = 0; i < wordArray.length; i++) {
            if(!wordArray[i].equals(" ")){
                gameArray[i] = "_";
            }else{
                gameArray[i] = " ";
            }
        }
    }

    public boolean letterSelected(String letter){
        boolean contain = false;

        for(int i = 0; i < wordArray.length; i++){
            if(letter.equals(wordArray[i])){
                gameArray[i] = letter;
                contain = true;
            }
        }

        parseGameWord();
        boolean containMissingLetter = false;
        for(int i = 0; i < gameArray.length; i++){
            if(gameArray[i].equals("_")){
                containMissingLetter = true;
            }
        }
        if(!containMissingLetter){
            win = true;
        }

        return contain;
    }

    public boolean getWin(){
        return win;
    }

    private void selectWord(){
        ArrayList<String> words = new ArrayList<>();
        String location = "words/"+category;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(
                    new InputStreamReader(mContext.getAssets().open(location), "UTF-8"));

            // do reading, usually loop until end of file reading
            String mLine;
            while ((mLine = reader.readLine()) != null) {
                if(!mLine.equals("")){
                    words.add(mLine);
                }
            }
        } catch (IOException e) {
            //log the exception
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    //log the exception
                }
            }
        }
        Random randomizer = new Random();
        this.word = words.get(randomizer.nextInt(words.size())).toUpperCase();
    }
}
