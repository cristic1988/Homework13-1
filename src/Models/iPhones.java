package Models;

import service.Smartphones;
import service.iOS;

public class iPhones implements Smartphones, iOS {

    @Override
    public void call() {


        System.out.println("Calling from iPhone...");

    }
    @Override
    public void sms() {

        System.out.println("Sending SMS from iPhone...");

    }


    @Override
    public void internet() {

        System.out.println("Browsing internet from iPhone...");

    }

    @Override
    public void loadiOS() {

        System.out.println("Downloading iOS for iPhone...");

    }

}
