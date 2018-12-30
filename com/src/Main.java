import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] arg) {
        new Main();
    }

    private Main(){
        run();
    }

    private void run(){

        final List<String> hexColors = convertToHex(getColors());
        for (String output : hexColors){
            System.out.println(output);
        }
    }

    private List<Color> getColors(){
        final List<Color> inputColor = new ArrayList<>();
        inputColor.add(new Color(255,255,255));
        inputColor.add(new Color(2,154,17));
        inputColor.add(new Color(255,0,16));
        return inputColor;
    }

    private List<String> convertToHex(List<Color> listOfColors){
        final List<String> convertedColors = new ArrayList<>();
        for(Color color : listOfColors ){
            final StringBuilder hexValueColor = new StringBuilder();
            hexValueColor.append("#");
            hexValueColor.append(HexConverter.convertDecToHex(color.getRed()));
            hexValueColor.append(HexConverter.convertDecToHex(color.getGreen()));
            hexValueColor.append(HexConverter.convertDecToHex(color.getBlue()));
            convertedColors.add(hexValueColor.toString());
        }
        return convertedColors;
    }
}
