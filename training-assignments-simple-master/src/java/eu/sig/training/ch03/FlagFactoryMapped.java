package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlagFactoryMapped {

    // tag::getFlag[]
    private static Map<Nationality, List<Color>> flags = new
            HashMap<Nationality, List<Color>>();

    static {
        flags.put(Nationality.DUTCH, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
        flags.put(Nationality.GERMAN, Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW));
        flags.put(Nationality.BELGIAN, Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED));
        flags.put(Nationality.ITALIAN, Arrays.asList(Color.GREEN, Color.WHITE, Color.RED));
    }

    public List<Color> getFlagColors(Nationality nationality) {
        List<Color> colors = flags.get(nationality);
        return colors != null ? colors : Arrays.asList(Color.GRAY);
    }
    // end::getFlag[]
}