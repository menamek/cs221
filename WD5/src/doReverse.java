/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mena
 */
public class doReverse {

    private int num;

    public doReverse(int num) {
        this.num = num;
    }

    public int reverse() {
        revisedPriorityQ q = new revisedPriorityQ(10);

        while (num > 0) {
            int r = num % 10;
            q.insert(r);
            num = num / 10;
        }

        int res = 0;
        int tmp;

        while (!q.isEmpty()) {
            tmp = (int) q.remove();
            res = res * 10 + tmp;
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(new doReverse(76431).reverse());

    }
}

run:
13467
BUILD SUCCESSFUL (total time: 0 seconds)
