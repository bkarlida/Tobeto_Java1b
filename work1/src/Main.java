public class Main {
    public static void main(String[] args) {
        String arr_direct = "";
        double dollar_yesterday = 27.98;
        boolean dolar_in = false;
        double dollar_today = 29.98;
        int turn = 22;
        System.out.println("Hello World");
        String middleText = "is may be interested";
        String underText = "term time";
        System.out.println(middleText);
        System.out.println(underText);
        if (dollar_today < dollar_yesterday) {
            arr_direct = "down";
            System.out.println(arr_direct);
        } else if (dollar_today > dollar_yesterday) {
            arr_direct = "up";
        } else {
            arr_direct = "equal";
            System.out.println(arr_direct);
        }
        String[] credits = {"Hızlı Kredi", "Maaşını Halkbanktan Alanlar", "Mutlu Emekli"};

        for (int i = 0; i < credits.length; i++) {
            System.out.println(credits[i]);
        }
    }
}