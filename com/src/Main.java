import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] arg) {
        Main main = new Main();
        main.run();

    }

    private void run(){
        final List<Color> inputColor = new ArrayList<>();
        inputColor.add(new Color(255,255,255));
        inputColor.add(new Color(0,0,0));
        inputColor.add(new Color(255,0,0));
        final List<String> hexColors = convertToHex(inputColor);
        for (String output : hexColors){
            System.out.println(output);
        }
    }

    private List<String> convertToHex(List<Color> listOfColors){
        final List<String> convertedColors = new ArrayList<>();
        for(Color color : listOfColors ){
            final StringBuilder hexCode = new StringBuilder();
            hexCode.append("#");
            hexCode.append(HexConverter.convertDecToHex(color.getRed()));
            hexCode.append(HexConverter.convertDecToHex(color.getGreen()));
            hexCode.append(HexConverter.convertDecToHex(color.getBlue()));
            convertedColors.add(hexCode.toString());
        }
        return convertedColors;
    }
}
