import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;

/*
 * @Author: batkiz 
 * @Date: 2018-08-09 19:08:39 
 * @Last Modified by: batkiz
 * @Last Modified time: 2018-08-09 19:11:38
 */

/**
 * Cat
 */
public class Cat {

    public static void main(String[] args) {
        Out out = new Out(args[args.length - 1]);
        for (int i = 0; i < args.length - 1; i++) {
            In in = new In(args[i]);
            String s = in.readAll();
            out.println(s);
            in.close();
        }
        out.close();
    }
}