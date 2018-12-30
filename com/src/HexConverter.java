public class HexConverter {

    public static String convertDecToHex(final int RGBValue){
        int firstCharacter = RGBValue / 16;
        int secondCharacter = RGBValue % 16;
        return hexStringValue(firstCharacter,secondCharacter);
    }
    private static String hexStringValue(int firstCharacter, int secondCharacter){
        final StringBuilder hexString = new StringBuilder();
        hexString.append(HexCodes.getCharacterFromValue(firstCharacter));
        hexString.append(HexCodes.getCharacterFromValue(secondCharacter));
        return hexString.toString();
    }
}
