

public class HexConverter {

    public static String convertDecToHex(final int RGBValue){
        final int[] hexValue = new int[2];
        for (int i = 0; i < RGBValue; i++){
            hexValue[0]++;
            if(hexValue[0] == 16){
                hexValue[1]++;
                hexValue[0] = 0;
            }
        }
        return hexStringValue(hexValue);
    }
    private static String hexStringValue(int[] values){
        final StringBuilder hexString = new StringBuilder();
        hexString.append(checkVal(values[0]));
        hexString.append(checkVal(values[1]));
        return hexString.toString();
    }

    private static String checkVal(final int val){
        if(val == 10){
            return "A";
        }
        if(val == 11){
            return "B";
        }
        if(val == 12){
            return "C";
        }
        if(val == 13){
            return "D";
        }
        if(val == 14){
            return "E";
        }
        if(val == 15){
            return "F";
        }
        return String.valueOf(val);
    }
}
