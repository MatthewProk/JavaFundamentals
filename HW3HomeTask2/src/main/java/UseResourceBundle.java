
import java.util.Locale;
import java.util.Scanner;

public class UseResourceBundle {

    public static void main(String[] args) {

        languageSelection();
    }

    private static void languageSelection() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose language: \n 1.English \n 2.Russian \n Input the number: ");
        while (true) {
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                switch (i) {
                    case 1:
                        AppResources myBundle = new AppResources(new Locale("en", "US"));
                        System.out.println(myBundle.getValue("prop.key1"));
                        myBundle = new AppResources(new Locale("en", "US"));
                        System.out.println(myBundle.getValue("prop.key2"));
                        if (scanner.hasNextInt()) {
                            i = scanner.nextInt();
                            if (i == 1) {
                                myBundle = new AppResources((new Locale("en", "US")));
                                            System.out.println(myBundle.getValue("prop.key11"));
                                            break;
                            }else if(i == 2){
                                myBundle = new AppResources((new Locale("en", "US")));
                                System.out.println(myBundle.getValue("prop.key22"));
                                break;
                            }else{
                                System.out.println("There is no number!!! Choose again!");
                            }
                        }
                    case 2:
                        myBundle = new AppResources(new Locale("ru", "RU"));
                        System.out.println(myBundle.getValue("prop.key1"));
                        myBundle = new AppResources(new Locale("ru", "RU"));
                        System.out.println(myBundle.getValue("prop.key2"));
                        if (scanner.hasNextInt()) {
                            i = scanner.nextInt();
                            if (i == 1) {
                                myBundle = new AppResources((new Locale("ru", "RU")));
                                System.out.println(myBundle.getValue("prop.key11"));
                                break;
                            }else if(i == 2){
                                myBundle = new AppResources((new Locale("ru", "RU")));
                                System.out.println(myBundle.getValue("prop.key22"));
                                break;
                            }else{
                                System.out.println("There is no number!!! Choose again!");
                            }
                        }
                    default:
                        System.out.println("There is no number!!! Choose again!");
                }
            } else {
                System.out.println("You haven't input an integer!!! Input again!");
            }
        }
    }
}