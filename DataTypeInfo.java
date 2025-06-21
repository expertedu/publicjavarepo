public class DataTypeInfo {
    public static void main(String[] args) {
        System.out.println("Java Primitive Data Types: Size and Range");
        System.out.println("------------------------------------------");

        System.out.println("byte    : " + Byte.BYTES + " bytes (" + Byte.SIZE + " bits)");
        System.out.println("          Range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        
        System.out.println("short   : " + Short.BYTES + " bytes (" + Short.SIZE + " bits)");
        System.out.println("          Range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        
        System.out.println("int     : " + Integer.BYTES + " bytes (" + Integer.SIZE + " bits)");
        System.out.println("          Range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        
        System.out.println("long    : " + Long.BYTES + " bytes (" + Long.SIZE + " bits)");
        System.out.println("          Range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        
        System.out.println("float   : " + Float.BYTES + " bytes (" + Float.SIZE + " bits)");
        System.out.println("          Range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        
        System.out.println("double  : " + Double.BYTES + " bytes (" + Double.SIZE + " bits)");
        System.out.println("          Range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        
        System.out.println("char    : " + Character.BYTES + " bytes (" + Character.SIZE + " bits)");
        System.out.println("          Range: " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
        
        System.out.println("boolean : size not precisely defined (JVM dependent)");
        System.out.println("          Possible values: true or false");
    }
}
