import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;


public class ToyStore {
    PriorityQueue<Toy> toys;

    public ToyStore() {
        toys = new PriorityQueue<>(20, new Comparator<Toy>() {
            @Override
            public int compare(Toy toy1, Toy toy2) {
                return toy2.getWeight() - toy1.getWeight();
                //return (toy2.getWeight() <= toy2.getWeight()) ? -1 : 0;
            }
        });
    }

    public void addToy(Toy toy) {
        toys.offer(toy);
    }

    public Toy playToys() {
        if (!toys.isEmpty()) {
            Toy prizeToy = toys.remove();

            try {
                FileWriter writer = new FileWriter("prize_toys.txt", true);
                writer.write(prizeToy + "\n");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return prizeToy;

        }
        return null;
    }

    public void printAvailableToys() {
        if (toys.isEmpty()) {
            System.out.println("Доступных игрушек нет");
            return;
        }

        for (Toy toy : toys) {
            System.out.println(toy);
        }
    }
}
