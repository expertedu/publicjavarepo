/* Types of variable and Scope of variable, 
   instance varible, LocalVariable, default value of int is 0 */ 

class ScopeOfVariable {
    int i;  

    public static void main(String... args) {
        int j = 10; 
        ScopeOfVariable s = new ScopeOfVariable();
        System.out.println("j value is " + j);   
        System.out.println("i value is " + s.i); 
    }
}


