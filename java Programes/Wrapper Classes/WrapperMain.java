package WrapperClasses;

public class WrapperMain {
    public static void main(String[] args) {
        PrimitiveToWrapperLong primitiveToWrapperLong = new PrimitiveToWrapperLong();
        System.out.println("---------------------------------------Long--------------------------------------------");
        System.out.println("string to long(Value of)" + " " + "= " + primitiveToWrapperLong.getLongWrapperFromPrimitive());
        System.out.println("long value" + " " + "= " +  primitiveToWrapperLong.getLongWrapperLongFromPrimitive());
        System.out.println("string to parse long"+ " " + "= " +  primitiveToWrapperLong.getParseLongWrapperStringPrimitive());
        System.out.println("Bit Count Of Long"+ " " + "= " + primitiveToWrapperLong.getLongBitCountOfLongFromPrimitive());
        System.out.println("ParseUnsignedLong to String"+ " "+ " = " + primitiveToWrapperLong.getParseUnsignedLongFromPrimitive());
        System.out.println("toHexString to long" + " " +" = "+ primitiveToWrapperLong.getLongHexStringFromPrimitive());
        System.out.println("lowestOneBit to long"+" "+ " = " + primitiveToWrapperLong.getlowestOneBitFromPrimitive());
        System.out.println("HighestOneBit to long"+" "+ " = " + primitiveToWrapperLong.getHighestOneBitFromPrimitive());
        System.out.println("toString to long"+" "+ " = " + primitiveToWrapperLong.getToStringFromPrimitive());
        System.out.println("toOctalString to long"+" "+ " = " + primitiveToWrapperLong.getToOctalStringFromPrimitive());

        System.out.println("----------------------------------------Integer----------------------------------------------");
        System.out.println("valueOf to Integer"+" "+ " = " + primitiveToWrapperLong.getIntegerFromPrimitive());
        System.out.println("bitCount Integer"+" "+ " = " + primitiveToWrapperLong.getIntegerBitCountFromPrimitive());
        System.out.println("toString Integer"+" "+ " = " + primitiveToWrapperLong.getIntegrToStringFromPrimitive());
        System.out.println("parseInt Integer"+" "+ " = " + primitiveToWrapperLong.getIntegerParseIntFromPrimitive());
        System.out.println("octalString Integer"+" "+ " = " + primitiveToWrapperLong.getIntegerToOctalStringFromPrimitive());
        System.out.println("toHexString Integer"+" "+ " = " + primitiveToWrapperLong.getIntegerToHexStringFromPrimitive());

        System.out.println("------------------------------------------Short-------------------------------------------------");
        System.out.println("valueOf to short"+" "+ " = " + primitiveToWrapperLong.getShortFromPrimitive());
        System.out.println("toString short"+" "+ " = " + primitiveToWrapperLong.getShortToStringFromPrimitive());
        System.out.println("parseShort "+" "+ " = " + primitiveToWrapperLong.getShortParseShortFromPrimitive());
        System.out.println("Short value get back to string valueOf short"+" "+ " = " + primitiveToWrapperLong.getShortBTStringFromPrimitive());


        System.out.println("------------------------------------------Float-------------------------------------------------");

        System.out.println("valueOf to float"+" "+ " = " + primitiveToWrapperLong.getFloatFromPrimitive());
        System.out.println("Float value get back to string valueOf float"+" "+ " = " + primitiveToWrapperLong.getFloatBTFromPrimitive());
        System.out.println(" parseShort  "+" "+ " = " + primitiveToWrapperLong.getParseFloatFromPrimitive());
        System.out.println("toHexString  Float"+" "+ " = " + primitiveToWrapperLong.getFloattoHexStringFromPrimitive());
        System.out.println("toString Float"+" "+ " = " + primitiveToWrapperLong.getFloatToStringFromPrimitive());
        System.out.println("floatToInt Float"+" "+ " = " + primitiveToWrapperLong.getFloatToIntFromPrimitive());
        System.out.println("floatToRawInt Float"+" "+ " = " + primitiveToWrapperLong.getFloatToRawIntBitsFromPrimitive());
        System.out.println("hashCode Float"+" "+ " = " + primitiveToWrapperLong.getFloatHashCodeFromPrimitive());

        System.out.println("------------------------------------------Double-------------------------------------------------");
        System.out.println("valueOf to double"+" "+ " = " + primitiveToWrapperLong.getDoubleFromPrimitive());
        System.out.println("Float value get back to string valueOf float"+" "+ " = " + primitiveToWrapperLong.getDoubleStringFromPrimitive());
        System.out.println(" parseDouble  "+" "+ " = " + primitiveToWrapperLong.getDoubleParseDoubleFromPrimitive());
        System.out.println("toHexString  Double"+" "+ " = " + primitiveToWrapperLong.getDoubleToHexStringFromPrimitive());
        System.out.println("toString Double"+" "+ " = " + primitiveToWrapperLong.getDoubleToStringFromPrimitive());
        System.out.println("hashCode Double"+" "+ " = " + primitiveToWrapperLong.getDoubleToHashCodeFromPrimitive());
        System.out.println("doubleToLongBits Double"+" "+ " = " + primitiveToWrapperLong.getDoubleToLongBitsFromPrimitive());
        System.out.println("doubleToRawLongBits Double"+" "+ " = " + primitiveToWrapperLong.getDoubleToRawLongBitsFromPrimitive());
        System.out.println("IsFinite Double"+" "+ " = " + primitiveToWrapperLong.getDoubleIsFiniteFromPrimitive());
        System.out.println("IsInFinite Double"+" "+ " = " + primitiveToWrapperLong.getDoubleIsInFiniteFromPrimitive());
        System.out.println("longBitsToDouble"+" "+ " = " + primitiveToWrapperLong.getlongBitsToDoubleFromPrimitive());

        System.out.println("------------------------------------------Byte-------------------------------------------------");
        System.out.println("valueOf"+" "+ " = " + primitiveToWrapperLong.getByteFromPrimitive());
        System.out.println("parseByte"+" "+ " = " + primitiveToWrapperLong.getParseByteFromPrimitive());
        System.out.println("decode Byte"+" "+ " = " + primitiveToWrapperLong.getByteDecodeFromPrimitive());
        System.out.println("hashCode"+" "+ " = " + primitiveToWrapperLong.getByteHashCodeFromPrimitive());
        System.out.println("ToUnsignedInt"+" "+ " = " + primitiveToWrapperLong.getByteToUnsignedIntFromPrimitive());
        System.out.println("Byte value convert get back to string"+" "+ " = " + primitiveToWrapperLong.getByteToStringFromPrimitive());
        System.out.println("ByteToUnsignedLong"+" "+ " = " + primitiveToWrapperLong.getByteToUnsignedLongFromPrimitive());

        System.out.println("------------------------------------------Boolean-------------------------------------------------");
        System.out.println("valueOf"+" "+ " = " + primitiveToWrapperLong.getBooleanValueOfFromPrimitive());
        System.out.println("valueOf String"+" "+ " = " + primitiveToWrapperLong.getBooleanValueOfStringFromPrimitive());
        System.out.println("getBoolean"+" "+ " = " + primitiveToWrapperLong.getBooleanFromPrimitive());
        System.out.println("boolean value get back to string "+" "+ " = " + primitiveToWrapperLong.getBooleanValueToStringFromPrimitive());
        System.out.println("parseBoolean"+" "+ " = " + primitiveToWrapperLong.getParseBooleanFromPrimitive());


        System.out.println("------------------------------------------Character-------------------------------------------------");
        System.out.println("valueOf"+" "+ " = " + primitiveToWrapperLong.getCharValueOfFromPrimitive());
        System.out.println("charToLowerCase"+" "+ " = " + primitiveToWrapperLong.getCharToLowerCaseFromPrimitive());
        System.out.println("charToUpperCase"+" "+ " = " + primitiveToWrapperLong.getCharToUpperCaseFromPrimitive());
        System.out.println("charToTitleCase"+" "+ " = " + primitiveToWrapperLong.getCharToTitleCaseFromPrimitive());
        System.out.println("charReverseBytes"+" "+ " = " + primitiveToWrapperLong.getCharReverseBytesFromPrimitive());
        System.out.println("isSpaceChar"+" "+ " = " + primitiveToWrapperLong.getCharIsSpaceCharFromPrimitive());
        System.out.println("isDefined"+" "+ " = " + primitiveToWrapperLong.getCharIsDefinedFromPrimitive());
        System.out.println("isDigit"+" "+ " = " + primitiveToWrapperLong.getCharIsDigitFromPrimitive());
        System.out.println("isHighSurrogate"+" "+ " = " + primitiveToWrapperLong.getCharIsHighSurrogateFromPrimitive());
        System.out.println("isIdentifierIgnorable"+" "+ " = " + primitiveToWrapperLong.getCharIsIdentifierIgnorableFromPrimitive());
        System.out.println("isIdentifierIgnorable"+" "+ " = " + primitiveToWrapperLong.getCharIsISOControlFromPrimitive());
        System.out.println("javaIdentifierPart"+" "+ " = " + primitiveToWrapperLong.getIsJavaIdentifierPartFromPrimitive());
        System.out.println("isUnicodeIdentifierStart"+" "+ " = " + primitiveToWrapperLong.getIsUnicodeIdentifierStartFromPrimitive());
        System.out.println("isJavaIdentifierStart"+" "+ " = " + primitiveToWrapperLong.getIsJavaIdentifierStartFromPrimitive());
        System.out.println("isLetterOrDigit"+" "+ " = " + primitiveToWrapperLong.getIsLetterOrDigitFromPrimitive());
        System.out.println("isLowerCase"+" "+ " = " + primitiveToWrapperLong.getIsLowerCaseFromPrimitive());
        System.out.println("getNumericValueFromPrimitive"+" "+ " = " + primitiveToWrapperLong.getIsGetNumericValueFromPrimitive());
        System.out.println("getTypeValue"+" "+ " = " + primitiveToWrapperLong.getIsGetTypeValueFromPrimitive());
        System.out.println("getHashCode"+" "+ " = " + primitiveToWrapperLong.getIsGetHashCodeFromPrimitive());
    }


}
