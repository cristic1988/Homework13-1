package Models;

import service.LinuxOS;
import service.Smartphones;

public class Androids implements Smartphones, LinuxOS {

    @Override
    public void call() {


        System.out.println("Calling from Android...");

    }
    @Override
    public void sms() {

        System.out.println("Sending SMS from Android...");

    }


    @Override
    public void internet() {

        System.out.println("Browsing internet from Android...");

    }

    @Override
    public void loadOS() {

        System.out.println("Downloading LinuxOS for Android...");

    }

}
