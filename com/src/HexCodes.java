public class HexCodes{
    public enum HexCodeCharacter {
        A(10), B(11), C(12), D(13), E(14), F(15);

        private final int character;

        HexCodeCharacter(final int character) {
            this.character = character;
        }
    }

    public static String getCharacterFromValue(final int value){
        for (HexCodeCharacter code : HexCodeCharacter.values()){
            if(code.character == value){
                return code.name();
            }
        }
        return String.valueOf(value);
    }
}



