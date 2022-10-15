import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName,password;
        Scanner scanner=new Scanner(System.in);
        System.out.println("kullanıcı adınız giriniz:");
        userName= scanner.next();
        System.out.println("şifrenizi giriniz:");
        password= scanner.next();

        if(userName.equals("talas holding")&& password.equals("java123")){
            System.out.println("kullanıcı adı ve şifre doğru");
        } else if (userName.equals("talas holding") || password.equals("java123")) {
            System.out.println("kullanıcı adı veya şifre hatalı");
        }else {
            System.out.println("bilgileri yalış girdiniz tekrar deneyiniz");
        }
    }
}