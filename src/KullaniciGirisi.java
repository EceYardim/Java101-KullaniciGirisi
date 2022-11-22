import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, Password, chose, newPassword;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız:");
        userName = inp.nextLine();

        System.out.print("Şifreniz:");
        Password = inp.nextLine();
        if (userName.equals("patika") && Password.equals("java123")) {
            System.out.print("Hoşgeldiniz!");
        } else {
            System.out.println("Hatalı şifre girdiniz, Şifrenizi sıfırlamak istermisiniz ? (evet / hayır)");
            chose = inp.nextLine();
            if (chose.equals("evet")) {
                System.out.println("Yeni Şifre Oluşturunuz:");
                newPassword = inp.nextLine();
                if (newPassword.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre Oluşturuldu.");
                }
            } else {
                System.out.println("İyi Günler Dileriz!");
            }
        }
    }
    }
