public class Main {
    public static void
    main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 10_000;
        int miles = service.calculate(ticketPrice); // должно получиться 500
        System.out.println("Количество начисленных миль: " + miles + " миль");
    }
}