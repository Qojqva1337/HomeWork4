public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");

        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        int client = 0;
        if (clientDeviceYear < 2015 && client == 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            if (clientDeviceYear < 2015 && client == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                if (clientDeviceYear == 2015 && client == 0) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    if (clientDeviceYear == 2015 && client == 1) {
                        System.out.println("Установите версию приложения для Android по ссылке");
                    }
                }

                }

            }






    }
}