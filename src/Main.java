
public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();

        toyStore.addToy(new Toy(1, "Мишка",10));
        toyStore.addToy(new Toy(2, "Лошадка", 5));
        toyStore.addToy(new Toy(3, "Машинка", 7));
        toyStore.addToy(new Toy(4, "Машинка", 20));
        toyStore.addToy(new Toy(5, "Слоник", 50));
        toyStore.addToy(new Toy(6, "Зайчик", 1));
        toyStore.addToy(new Toy(7, "Машинка", 33));
        toyStore.addToy(new Toy(8, "Мишка", 18));
        toyStore.addToy(new Toy(9, "Котик", 20));
        toyStore.addToy(new Toy(10, "Трактор", 12));
        toyStore.addToy(new Toy(11, "Рыбка", 12));
        toyStore.addToy(new Toy(12, "Машинка", 45));

        System.out.println("Игрушки в магазине:");
        toyStore.printAvailableToys();
        System.out.println();

        System.out.println("Розыгрыш игрушек:");
        System.out.println(toyStore.playToys());
        System.out.println(toyStore.playToys());
        System.out.println(toyStore.playToys());
        System.out.println(toyStore.playToys());
        System.out.println(toyStore.playToys());
        System.out.println(toyStore.playToys());
        System.out.println(toyStore.playToys());
        System.out.println(toyStore.playToys());
        System.out.println(toyStore.playToys());
        System.out.println(toyStore.playToys());
        System.out.println();

        System.out.println("Игрушки в магазине после розыгрышев:");
        toyStore.printAvailableToys();
    }
}
