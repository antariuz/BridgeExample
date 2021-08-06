import maker.impl.Lexus;
import maker.impl.Toyota;
import model.ElectricalScooter;
import model.MechanicalScooter;
import model.Scooter;

import java.util.Arrays;
import java.util.List;

public class BridgeExample {
    public static void main(String[] args) {
        List<Scooter> list = Arrays.asList(new ElectricalScooter(new Lexus()),
                new MechanicalScooter(new Toyota()), new ElectricalScooter(new Toyota()),
                new MechanicalScooter(new Lexus()));
        list.forEach(System.out::println);
    }
}
