package com.dream.db.Iterator.v7;

/**
 * 相比数组，这个容器不用考虑边界问题，可以动态扩展
 */

class ArrayList_<E> implements Collection_<E> {
    E[] objects = (E[]) new Object[10];
    // objects中 下一个空的位置在哪儿，或者说，目前容器有多少个元素
    private int index = 0;
    public void add(E o){
        if (index == objects.length) {
            E[] newobjects = (E[]) new Object[this.objects.length * 2];
            System.arraycopy(objects,0,newobjects,0,objects.length);
            objects = newobjects;
        }
        objects[index] = (E) o;
        index ++;
    }
    public int size(){
        return index;
    }

    @Override
    public Iterator_<E> iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator<E> implements Iterator_<E> {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            if (currentIndex >= index) return false;
            return true;
        }

/*        @Override
        public E next() {
            E o  = (E) objects[currentIndex];
            currentIndex ++;
            return o;
        }*/

        @Override
        public E next() {
            E o = (E) objects[currentIndex];
            currentIndex ++;
            return o;
        }

    }

}
