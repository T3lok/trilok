/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mss;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
//gfgfhgjdf hhfgudfh
/**
 *
 * @author miracle
 */
public class ReadPropertiesFile {
//new commit and merge this.
    public void readPropertiesFile() {
        Properties p = new Properties();
        InputStream iStream = null;
        try {
            iStream = new FileInputStream("config.properties");

            p.load(iStream);

            System.out.println(p.getProperty("voterId"));
            System.out.println(p.getProperty("voterName"));

        } catch (IOException ex) {
            Logger.getLogger(ReadPropertiesFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (iStream != null) {
                try {
                    iStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(ReadPropertiesFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }
//wat commit
    //commmit
    public static void main(String[] args) {
        ReadPropertiesFile rpf = new ReadPropertiesFile();
        rpf.readPropertiesFile();
    }
}
