package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.net.URL;

public class AndroidHTTPConnection {

    public static void main(String[] args) throws IOException{

        //opens a connection to web address and prints the html to the console
        URL slickdeals = new URL("https://www.slickdeals.net/");
        URLConnection connection = slickdeals.openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String string = reader.readLine();
        while (string != null){
            System.out.println(string);
            string = reader.readLine();
        }



        //A bad web address

        //Invalid web site address
        try{
            URL slickdeals2 = new URL("https://www.slickdeals.com/");
            URLConnection connection2 = slickdeals2.openConnection();
            BufferedReader reader2 = new BufferedReader(new InputStreamReader(connection2.getInputStream()));

        } catch (Exception e){
        System.out.println("Invalid web address");
        }



        //NASTY PATH

        //nothing is printed because there is no loop to read the entire thing
        URL steepCheap = new URL("http://www.steepandcheap.com/");
        URLConnection connection3 = steepCheap.openConnection();
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(connection3.getInputStream()));
        String string3 = reader3.readLine();
        System.out.println(string3);



        //NASTY PATH

        //bad extension
        try {
            URL steepCheap2 = new URL("http://www.steepandcheap.com/myextension/");
            URLConnection connection4 = steepCheap2.openConnection();
            BufferedReader reader4 = new BufferedReader(new InputStreamReader(connection4.getInputStream()));
        } catch (Exception e){
            System.out.println("This is not a valid web extension");
        }



        //NASTY PATH

        //null as website
        try {
            URL nullURL = new URL(null);
            URLConnection connection4 = nullURL.openConnection();
            BufferedReader reader4 = new BufferedReader(new InputStreamReader(connection4.getInputStream()));
            String string4 = reader4.readLine();
            System.out.println(string4);

        } catch (Exception e){
            System.out.println("Null was entered.");
        }
}}
//null as website