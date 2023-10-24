import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int totalPrice = 0;
        Shoes shoes = new Shoes();
        Dress dress = new Dress();
        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen isminizi giriniz");
        shoes.setName(scan.nextLine());
        System.out.println("lütfen ayakkabı numaranızı giriniz");
        shoes.setFootNumber(scan.nextDouble());
        System.out.println("lütfen ayakkabı türü seçiniz");
        System.out.println("1.sport / 2.bot / 3.kundura");
        shoes.setId(scan.nextInt());
        if (shoes.getId() == 1)
        {
            shoes.setId(1);
            shoes.setType("sport");
            totalPrice += 100;
        }
        else if (shoes.getId() == 2)
        {
            shoes.setId(2);
            shoes.setType("bot");
            totalPrice += 250;
        }
        else if (shoes.getId() == 3)
        {
            shoes.setId(3);
            shoes.setType("kundura");
            totalPrice += 300;
        }
        else
            System.out.println("geçerli numarayı giriniz");
        System.out.println("lütfen elbise türü giriniz");
        System.out.println("1.t-shirt / 2.pantolon / 3.ceket");
        dress.setId(scan.nextInt());
        if (dress.getId() == 1)
        {
            dress.setDresType("t_shirt");
            totalPrice += 150;
        }
        else if (dress.getId() == 2)
        {
            dress.setDresType("pantolon");
            totalPrice += 325;
        }
        else if (dress.getId() == 3)
        {
            dress.setDresType("ceket");
            totalPrice += 550;
        }
        else
            System.out.println("geçerli numarayı giriniz");

        dress.setPrice(totalPrice);
        System.out.println("---SİPARİŞİNİZ---");
        System.out.println("İSİM = " + shoes.getName());
        System.out.println("Kıyafet türü = " + dress.getDresType());
        System.out.println("Ayakkabınız = " + shoes.getType());
        System.out.println("Ayakkabı numaranız " + shoes.getFootNumber());
        System.out.println("fiyatınız = " + dress.getPrice());

    }

}
