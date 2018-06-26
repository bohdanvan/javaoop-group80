package com.bvan.oop.lesson7.generic.pair;

import com.bvan.oop.lesson5.format.oop.Formatter;
import com.bvan.oop.lesson7.generic.box.Cat;

/**
 * @author bvanchuhov
 */
public class PairWithRestriction<L extends Cat, R extends Formatter> {

    private final L left;
    private final R right;

    public PairWithRestriction(L left, R right) {
        this.left = left;
        this.right = right;
    }

    public L getLeft() {
        return left;
    }

    public R getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "PairWithRestriction{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
