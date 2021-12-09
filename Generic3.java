class Generic3 {
    public <T> void display(T[] a) {
        for (T x : a) {
            System.out.println(x);
        }

    }
    public static void main(String[] args) {
        Character carr[] = {'a','b','c','d','e'};
        Integer iarr[] = {1,2,3,4,5,6};
        Generic3 obj =new Generic3();
        obj.display(carr);
        obj.display(iarr);

    }
}

/*
Output :

a
b
c
d
e
1
2
3
4
5
6
 */




