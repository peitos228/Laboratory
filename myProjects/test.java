package myProjects;


public class test {

    public static void main(String[] args) {
        //List<Integer> integers = new ArrayList<>();

        String str = "Hello1245ahs27hsh1.36uaus?!234";
        //String str = "t1b25vdv65frfs16r12.28";
        StringBuilder sb = new StringBuilder();
        char[] charArr = str.toCharArray();


        for (int i = 0; i < charArr.length; i++) {
            if (Character.isLetter(charArr[i])) {
                charArr[i] = ' ';
            }
        }
        String answer = String.valueOf(charArr);
        String[] ansArr = answer.split("[ ;!?]+");


        int[] intArr = new int[ansArr.length];
        int j = 0, changes = 0;
        for (int i = 0; i < ansArr.length; i++) {
            try {
                intArr[j] = Integer.parseInt(ansArr[i]);
                j++;
                changes++;
                //Return true if it works
            } catch (Exception e) {
                //If it doesn't work return false
            }
        }
        for (int i = 0; i < changes; i++) {
            sb.append(intArr[i]).append(" ");
        }
        System.out.println(sb.toString());

    }
}