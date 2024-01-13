package com.elias;

public class MainLauncher {

    public static void main(String[] args){


        //somehow the vm complains when we are not launcher the fx appliaction from another main.
        // thus, we are using another main method to call the main application.
        Main.main(args);


    }



}
