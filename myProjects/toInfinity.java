package myProjects;

class toInfinity {
    public static void main(String[] args) {

// Insert code here
        byte start = Byte.MAX_VALUE;
        for (byte i = start; i <= start + 1; i++) {
             /* This should be an infinite loop, but don't change anything here */
            System.out.println(i);
        }
    }
}