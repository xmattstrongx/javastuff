package com.matt.binarysearchtree;

public class EmptyBST<D extends Comparable> implements Tree<D> {

    public EmptyBST() {

    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public int cardinality() {
        return 0;
    }

    @Override
    public boolean member(D element) {
        return false;
    }

    @Override
    public NonEmptyBST add(D elt) {
        return new NonEmptyBST<D>(elt);
    }
}
