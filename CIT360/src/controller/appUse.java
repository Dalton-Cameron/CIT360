package controller;

import java.util.HashMap;

public class appUse
{
    public static void main(String[] args)
    {
        ApplicationController applicationController = new ApplicationController();

        applicationController.mapCommand("mycommand",new Speak4Handler());

        String mycommand = "mycommand";

        HashMap myData = new HashMap();
        myData.put("Data#1","It works");
        myData.put("Data#2","It worked again");

        //Access with variable
        applicationController.handleRequest(mycommand,myData);
        //Fail access
        applicationController.handleRequest("no",myData);

    }
}