public class ConstructorDemo {
		String name;
	    int id;
	    static String company;

	    //Static Block (executes only once at beginning executes once)
	    static {
	        company = "TCS";
	        System.out.println(" Static Block :placed in" + company);
	    }

	    //Initialization Block (executes before constructor executes twice)
	    {
	        System.out.println("Instance Block: before constructorr called");
	    }

	    // Constructor
	    public  ConstructorDemo(String name, int id) {
	        this.name = name;
	        this.id = id;
	        System.out.println("Constructor: student details - " + name + ", ID: " + id);
	    }

	    public void show() {
	        System.out.println("student Details: " + name + " (" + id + "), Company: " + company);
	    }

	    public static void main(String[] args) {
	        System.out.println("Main Starts\n");

	        ConstructorDemo s1 = new  ConstructorDemo("Rama", 101);
	        s1.show();

	        System.out.println();

	        ConstructorDemo s2 = new  ConstructorDemo("Sita", 102);
	        s2.show();
	}

}
