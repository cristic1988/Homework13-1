import Models.Androids;
import Models.iPhones;
import service.LinuxOS;
import service.Smartphones;
import service.iOS;

public class Phones {
    public static void main(String[] args) {
        Smartphones Samsung = new Androids();
        Samsung.sms();Samsung.call();Samsung.internet();
        System.out.println();

        Smartphones Apple = new iPhones();
        Apple.sms();Apple.call();Apple.internet();
        System.out.println();

        Androids Sony = new Androids();
        Sony.sms();Sony.call();Sony.internet();
        System.out.println();

        iPhones i6 = new iPhones();
        i6.call();i6.internet();i6.sms();
        System.out.println();

        LinuxOS Redmi = new Androids();
        Redmi.loadOS();
        System.out.println();

        iOS X8 = new iPhones();
        X8.loadiOS();
        System.out.println();
    }
}
