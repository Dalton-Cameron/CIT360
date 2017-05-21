package test;

import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.JSONOutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;



@WebServlet(name = "TestServlet", urlPatterns = {"/test"})
public class TestServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HashMap myMap = new HashMap();

        myMap.put("Arizona", "928");
        myMap.put("Idaho", "208");
        myMap.put("Utah", "801");


//        JSONObject jsonObject = new JSONObject(map);


        File fileOne = new File("fileOne.txt");

        FileInputStream fileIn = new FileInputStream(fileOne);
        FileOutputStream fileOut = new FileOutputStream(fileOne);

        JSONInputStream inFromClient = new JSONInputStream(fileIn);
        JSONOutputStream outToClient = new JSONOutputStream(fileOut);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.println("<h1>Test</h1>");
//        out.flush();

    }
}