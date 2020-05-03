/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickynote;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hadi
 */
public class FileIO {
    private final String path = System.getProperty("user.home") + "/.SimpleStickyNotes/";
    private final File noteData;
    private final String filePath = this.path + "data.dt";
    private Properties prop;

    public FileIO() {
        new File(path).mkdirs();
        noteData = new File(filePath);
        prop = new Properties();
        createNewFiles();
    }
    
    private void createNewFiles(){
        if(!noteData.exists()){
            try {
                noteData.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getMessage());
            }
        }
    }
    
    public void setProperty(String key, String value){
        prop.put(key, value);
        try {
            prop.store(new FileWriter(noteData), null);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public String getProperty(String key){
        try {
            prop.load(new FileReader(noteData));
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return prop.getProperty(key);
    }
    
    public Properties loadProperties(){
        try {
            prop.load(new FileReader(noteData));
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return prop;
    }
    
    public void writeFile(String data){
        try {
            try (FileWriter writer = new FileWriter(noteData, false)) {
                writer.write(data);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public String readFile(){
        String data = "";
        try {
            data = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return data;
    }
    
}
