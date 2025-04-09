/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_11_escritura;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class EVA3_11_ESCRITURA {

    public static void main(String[] args) {
        String ruta="C:/Archivo/Prueba.txt.txt";
        try {
            writeUsingFiles(ruta,"Prueba de escritura de archivos usando Files: Creado por Jesus Meza");
            writeUsingFileWriter(ruta,"Prueba de escritura de archivos usando FileWriter: Creado por Jesus Meza");
            writeUsingBufferedWriter(ruta);
        } catch (IOException ex) {
            Logger.getLogger(EVA3_11_ESCRITURA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void writeUsingFiles(String ruta,String datos) throws IOException{
        Path path=Paths.get(ruta+"archivoFiles.txt");
        Files.write(path, datos.getBytes());
    }
    public static void writeUsingFileWriter(String ruta, String datos) throws IOException{
        File file=new File(ruta+"archivoFileWriter.txt");
        FileWriter fileWriter=new FileWriter(file);
        fileWriter.write(datos);
        fileWriter.close();
    }
    public static void writeUsingBufferedWriter(String ruta) throws IOException{
        File file=new File(ruta+"archivoBufferedWriter.txt");
        FileWriter fileWriter=new FileWriter(file);
        BufferedWriter bw=new BufferedWriter(fileWriter);
        
        for (int i = 0; i < 10; i++) {
            bw.write(i+":"+"Datos usando Buffered Writer!!");
            bw.write("\n");
        }
        bw.close();
    }
    
}
