package Progression;

public class Progression {

    /*
    *private -> no one outside of class can access
    * public -> everyone outside of class can access
    * protected -> only children/subclasses can acess
    *
    * Max int is 2,147,483,647
    * Max long is 9,223,372,036,854,775,807
    * BigInteger -> as large as your memory can store (as String)
    */
    protected long current;

    public Progression() {
        this(0);
    }

    public Progression(long start) {
        this.current = start;
    }

    public void advance() {
        current++;
    }

    public long nextValue() {
        advance();
        return current;
    }

    public void printProgresssion(int n) {
        System.out.print(current);
        for(int i=1; i < n; i++){
            System.out.print(" " + nextValue());
        }
        System.out.println();
    }
}
