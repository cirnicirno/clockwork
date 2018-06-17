package clockwork;

public class ConsoleWorker {

    public ConsoleWorker() {

    }

    public void insert() {
        int hour;
        int min;
        NumberScanner scanner = new NumberScanner();

        while (true) {
            System.out.print("Укажите часы в 12ти-часовом формате: ");
            if (scanner.isIntNumber() && scanner.getNumber() >= 0 && scanner.getNumber() < 12) {
                System.out.print("Минуты: ");
                hour = scanner.getNumber();
                if (scanner.isIntNumber() && scanner.getNumber() >= 0 && scanner.getNumber() < 60) {
                    min = scanner.getNumber();
                    break;
                }

            }
            System.out.println("Извините, вы ввели непраивльное время!");
        }
        //запуск метода решающего непосредственно задачу с передачей ему введеных параметров
        Clock clock = new Clock();
        clock.nextAlign(hour, min);

    }

}

