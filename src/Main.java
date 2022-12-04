public class Main {

    public static void main(String[] args) {

        // Переменная для цены:
        int price = 1000;
        // Переменная для расчета стоимости за 1 милю:
        int milesPrice = 100;
        // Формула для расчета миль:
        int miles = price / milesPrice;

        System.out.println("Ваши мили с покупки составят: " + miles + " миль" );

    }
}