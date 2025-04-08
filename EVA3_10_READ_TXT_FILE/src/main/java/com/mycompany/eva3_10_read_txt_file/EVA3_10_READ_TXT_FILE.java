/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_10_read_txt_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class EVA3_10_READ_TXT_FILE {

    public static void main(String[] args) throws IOException {
        String ruta = "C:/Archivo/Prueba.txt.txt";
        
        try {
            readUsingFiles(ruta);//lee todo el archivo
            readUsingBufferedReader(ruta);//lee linea por linea del archivo
            readUsingFileReader(ruta);
            readUsingScanner(ruta);
        } catch (IOException ex) {
            Logger.getLogger(EVA3_10_READ_TXT_FILE.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public static void readUsingFiles(String ruta) throws IOException{
        System.out.println("LECTURA DE ARCHIVO DE TEXTO USANDO FILES");
        Path path = Paths.get(ruta);
        String contenido = Files.readString(path);
        System.out.println(contenido);
}
    public static void readUsingBufferedReader(String ruta) throws IOException{
        System.out.println("LECTURA DE ARCHIVO DE TEXTO USANDO BUFFERED READER");
        File File = new File(ruta);
        FileInputStream inStream=new FileInputStream(File);
        InputStreamReader in=new InputStreamReader(inStream);
        BufferedReader br=new BufferedReader(in);
        String linea;
        while((linea=br.readLine())!=null){
            System.out.println(linea);
        }
        br.close();
    }
    public static void readUsingFileReader(String ruta) throws FileNotFoundException, IOException{
        System.out.println("LECTURA DE ARCHIVO DE TEXTO USANDO FILE READER");
        File File = new File(ruta);
        FileReader fileReader=new FileReader(File);
        BufferedReader br=new BufferedReader(fileReader);
        String linea;
        while((linea=br.readLine())!=null){
            System.out.println(linea);
        }
        br.close();
    }
    public static void readUsingScanner(String ruta) throws FileNotFoundException{
        System.out.println("LECTURA DE ARCHIVO DE TEXTO USANDO SCANNER");
        File file = new File(ruta);
        Scanner scanner = new Scanner(file);
        String cade;
        while(scanner.hasNextLine()){
          cade=scanner.nextLine();
            System.out.println(cade);
        }
    }
}
