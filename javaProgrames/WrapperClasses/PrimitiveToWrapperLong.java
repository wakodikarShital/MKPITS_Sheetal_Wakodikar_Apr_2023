package WrapperClasses;

public class PrimitiveToWrapperLong {
            private long pLongValue= 5548578;
            private String str = "5548578";
            private int Integer = 12;
            private String str1 ="12";
            private short sShortValue = 32;
            private float fFloatValue = 32.2f;
            private String fsFloatValue = "32.2";
            private double  aDoubleValue = 3.0;
             private String  sDoubleValue = "3.0";
             private Byte bByteValue = 127;
             private boolean aBooleanValue = true;
             private String sBooleanValue = "true";
             private char cCharValue ='C';


            public Long getLongWrapperFromPrimitive(){
                return Long.valueOf(str);
            }
            public Long getLongWrapperLongFromPrimitive(){
                 return Long.valueOf(pLongValue);
             }
            public Long getParseLongWrapperStringPrimitive(){
                return Long.parseLong(str);
            }
            public int getLongBitCountOfLongFromPrimitive(){
                return Long.bitCount(pLongValue);
            }
            public Long getParseUnsignedLongFromPrimitive(){
                return Long.parseUnsignedLong(str);
            }
            public String getLongHexStringFromPrimitive(){
                return Long.toHexString(pLongValue);
            }
            public Long getlowestOneBitFromPrimitive(){
                return Long.lowestOneBit(pLongValue);
            }
    public Long getHighestOneBitFromPrimitive(){
        return Long.highestOneBit(pLongValue);
    }
    public String getToStringFromPrimitive(){
        return Long.toString(pLongValue);
    }
    public String getToOctalStringFromPrimitive(){
        return Long.toOctalString(pLongValue);
    }

//   Integer

    public Integer getIntegerFromPrimitive(){
        return java.lang.Integer.valueOf(Integer);
    }

    public Integer getIntegerBitCountFromPrimitive(){
        return java.lang.Integer.bitCount(Integer);
    }

    public String getIntegrToStringFromPrimitive(){
        return java.lang.Integer.toString(Integer);
    }
    public int getIntegerParseIntFromPrimitive(){
        return java.lang.Integer.parseInt(str1);
    }

    public String getIntegerToOctalStringFromPrimitive(){
        return java.lang.Integer.toOctalString(Integer);
    }
    public String getIntegerToHexStringFromPrimitive(){
        return java.lang.Integer.toHexString(Integer);
    }

//    Short

    public Short getShortFromPrimitive(){
        return Short.valueOf(sShortValue);
    }
    public String getShortToStringFromPrimitive(){
        return Short.toString(sShortValue);
    }
    public short getShortParseShortFromPrimitive(){
        return Short.parseShort(str1);
    }
    public short getShortBTStringFromPrimitive(){
        return Short.valueOf(str1);
    }

//    Float

    public Float getFloatFromPrimitive(){
        return Float.valueOf(fFloatValue);
    }

    public Float getFloatBTFromPrimitive(){
        return Float.valueOf(fFloatValue);
    }
    public Float getParseFloatFromPrimitive(){
        return Float.parseFloat(fsFloatValue);
    }
    public String getFloattoHexStringFromPrimitive(){
        return Float.toHexString(fFloatValue);
    }
    public String getFloatToStringFromPrimitive(){
        return Float.toString(fFloatValue);
    }
    public int getFloatToIntFromPrimitive(){
        return Float.floatToIntBits(fFloatValue);
    }
    public int getFloatToRawIntBitsFromPrimitive(){
        return Float.floatToRawIntBits(fFloatValue);
    }
    public int getFloatHashCodeFromPrimitive(){
        return Float.hashCode(fFloatValue);
    }

//    Double
    public Double getDoubleFromPrimitive(){
        return Double.valueOf(aDoubleValue);
    }
    public Double getDoubleStringFromPrimitive(){
        return Double.valueOf(sDoubleValue);
    }
    public Double getDoubleParseDoubleFromPrimitive(){
        return Double.parseDouble(sDoubleValue);
    }
    public String getDoubleToHexStringFromPrimitive(){
        return Double.toHexString(aDoubleValue);
    }
    public String getDoubleToStringFromPrimitive(){
        return Double.toString(aDoubleValue);
    }
    public int getDoubleToHashCodeFromPrimitive(){
        return Double.hashCode(aDoubleValue);
    }
    public long getDoubleToLongBitsFromPrimitive(){
        return Double.doubleToLongBits(aDoubleValue);
    }
    public long getDoubleToRawLongBitsFromPrimitive(){
        return Double.doubleToRawLongBits(aDoubleValue);
    }

    public boolean getDoubleIsFiniteFromPrimitive(){
        return Double.isFinite(aDoubleValue);
    }
    public boolean getDoubleIsInFiniteFromPrimitive(){
        return Double.isInfinite(aDoubleValue);
    }
    public double getlongBitsToDoubleFromPrimitive(){
        return Double.longBitsToDouble(pLongValue);
    }

//    Byte
        public byte getByteFromPrimitive(){
            return Byte.valueOf(bByteValue);
        }
    public byte getParseByteFromPrimitive(){
        return Byte.parseByte(str1);
    }
    public byte getByteDecodeFromPrimitive(){
        return Byte.decode(str1);
    }
    public int getByteHashCodeFromPrimitive(){
        return Byte.hashCode(bByteValue);
    }
    public int getByteToUnsignedIntFromPrimitive(){
        return Byte.toUnsignedInt(bByteValue);
    }
    public String getByteToStringFromPrimitive(){
        return Byte.toString(bByteValue);
    }
    public long getByteToUnsignedLongFromPrimitive(){
        return Byte.toUnsignedLong(bByteValue);
    }

//    Boolean
    public Boolean getBooleanValueOfFromPrimitive(){
    return Boolean.valueOf(aBooleanValue );
    }
    public Boolean getBooleanValueOfStringFromPrimitive(){
        return Boolean.valueOf(sBooleanValue);
    }
    public Boolean getBooleanFromPrimitive(){
        return Boolean.getBoolean(sBooleanValue );
    }
    public String getBooleanValueToStringFromPrimitive() {
        return Boolean.toString(aBooleanValue);
    }
    public boolean getParseBooleanFromPrimitive() {
        return Boolean.parseBoolean(sBooleanValue);
    }

//    Character
    public Character getCharValueOfFromPrimitive() {
        return Character.valueOf(cCharValue);
    }
    public Character getCharToLowerCaseFromPrimitive() {
        return Character.toLowerCase(cCharValue);
    }
    public Character getCharToUpperCaseFromPrimitive() {
        return Character.toUpperCase(cCharValue);
    }
    public Character getCharToTitleCaseFromPrimitive() {
        return Character.toTitleCase(cCharValue);
    }
    public Character getCharReverseBytesFromPrimitive() {
        return Character.reverseBytes(cCharValue);
    }
    public Boolean getCharIsSpaceCharFromPrimitive() {
        return Character.isSpaceChar(cCharValue);
    }
    public Boolean getCharIsDefinedFromPrimitive() {
        return Character.isDefined(cCharValue);
    }
    public Boolean getCharIsDigitFromPrimitive() {
        return Character.isDigit(cCharValue);
    }
    public Boolean getCharIsHighSurrogateFromPrimitive() {
        return Character.isHighSurrogate(cCharValue);
    }
    public Boolean getCharIsIdentifierIgnorableFromPrimitive() {
        return Character.isIdentifierIgnorable(cCharValue);
    }
    public Boolean getCharIsISOControlFromPrimitive() {
        return Character.isISOControl(cCharValue);
    }
    public Boolean getIsJavaIdentifierPartFromPrimitive() {
        return Character.isJavaIdentifierPart(cCharValue);
    }
    public Boolean getIsUnicodeIdentifierStartFromPrimitive() {
        return Character.isUnicodeIdentifierStart(cCharValue);
    }
    public Boolean getIsJavaIdentifierStartFromPrimitive() {
        return Character.isJavaIdentifierStart(cCharValue);
    }
    public Boolean getIsLetterOrDigitFromPrimitive() {
        return Character.isLetterOrDigit(cCharValue);
    }
    public Boolean getIsLowerCaseFromPrimitive() {
        return Character.isLowerCase(cCharValue);
    }
    public int getIsGetNumericValueFromPrimitive() {
        return Character.getNumericValue(cCharValue);
    }
    public int getIsGetTypeValueFromPrimitive() {
        return Character.getType(cCharValue);
    }
    public int getIsGetHashCodeFromPrimitive() {
        return Character.hashCode(cCharValue);
    }

























}
