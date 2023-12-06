public class ExceptionHandling {
    // Try with resources
    public static int add(String A, String B) throws UndefinedException
    {
        if(A==null){
            throw new IllegalArgumentException();
        }
        if(B==null){
            throw new UndefinedException();
        }
        return 0;
    }

    public static void main(String[] args) {
        try{
            add(null, "s");
//            return;
//            add("S", null);
        }
        catch (UndefinedException e){
            System.out.println(e);
        }
        catch (IllegalArgumentException d){
            System.out.println("Illegal arg");
        }
        finally {
            System.out.println("Something");
        }
    }
}

class B {
    void m() {

    }
}

class UndefinedException extends Exception{

}