import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1: Cafe");
        System.out.println("2: Trà sữa");
        System.out.println("3: Trà chanh");
        System.out.println("4: Siro đá bào");
        System.out.println("0: Exit");
        System.out.println("Bạn muốn order gì??");

        while (true){
            int input = scanner.nextInt();
            switch (input){
                case 1:{
                    System.out.println("1: Cafe đá");
                    System.out.println("2: Cafe sữa đá");
                    System.out.println("3: Cafe sữa nóng");
                    System.out.println("4: Cafe đen đá");
                    System.out.println("5: Cafe đen nóng");
                    System.out.println("6: Bạc sỉu nóng");
                    System.out.println("7: Bạc sỉu đá");
                }
                case 2:{
                    System.out.println("1: Trà sữa bạc hà");
                    System.out.println("2: Trà sữa kiwi");
                    System.out.println("3: Trà sữa nho");
                    System.out.println("4: Trà sữa dâu");
                    System.out.println("5: Trà sữa socola");
                    System.out.println("6: Trà sữa trân châu đen");
                    System.out.println("7: Trà sữa trân châu trắng");
                    System.out.println("8: Trà sữa chanh dây");
                    break;
                }
                case 3:{
                    System.out.println("1: Trà chanh");
                    System.out.println("2: Trà tắc mật ong");
                    System.out.println("3: Trà đào cam xả");
                    System.out.println("4: Trà xanh gongcha ");
                    break;
                }
                case 4:{
                    System.out.println("1. Siro nho");
                    System.out.println("2. Siro đào");
                    System.out.println("3. Siro cam");
                    System.out.println("4. Siro dâu");
                    System.out.println("5. Siro kiwi");
                    System.out.println("6. Siro việt quất");
                    System.out.println("7. Siro bạc hà");
                    break;
                }
                case 0:{
                    System.exit(0);
                    break;
                }
                default:{
                    System.out.println("Bạn chưa chọn hoặc lựa chọn không có trong menu");
                }
            }
        }
    }
}
