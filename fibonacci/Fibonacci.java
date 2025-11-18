import java.math.BigInteger;
import java.util.ArrayList;

public class Fibonacci {
    private ArrayList<BigInteger> fibList;
    private int len;

    public Fibonacci(int len) {
        this.fibList = new ArrayList<BigInteger>();
        this.len = len;
    }

    public ArrayList<BigInteger> fib() {
        if (this.len < 0) {
            System.err.println("Sequence length cant be less than 0");
            System.exit(1);
        }

        if (this.len == 0) {
            this.fibList.add(BigInteger.valueOf(this.len));
            return this.fibList;
        }

        if (this.len == 1) {
            this.fibList.add(BigInteger.valueOf(this.len));
            return this.fibList;
        }

        this.fibList.add(BigInteger.valueOf(0));
        this.fibList.add(BigInteger.valueOf(1));
        for (int i = 2; i < this.len; i++) {
            this.fibList.add(this.fibList.get(i-2).add(this.fibList.get(i-1)));
        }
        return this.fibList;
    }

    public BigInteger getFib() {
        return fibList.get(fibList.size()-1);
    }

    public void printSeq() {
        System.out.print("Fib Seq: ");
        for (BigInteger num : fibList) {
            System.out.print(num + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci(1000);
        fib.fib();
        fib.printSeq();
        // System.out.println(fib.getFib());
    }
}
