package com.mycompany.fileproject;

import java.util.Random;

public class UbicationArchive {
    private String fileName;
    private String path;

    public UbicationArchive() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10);
        
        fileName = "archive" + numeroAleatorio;
        path = "archives/" + fileName + ".csv";
    }
    
    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    } 
}
