public class MaxValueMatrix {
    public static void main(String[] args) {
        Integer[][] list = new Integer[][]{{1,2,3},
            {4, 5, 6, 7}, {1, 2, 3}};

        System.out.println(max(list).toString());
    }

    public static <E extends Comparable<E>> E max(E[][] list) {
        E result = list[0][0];

        for(int i = 0; i < list.length; i++) {
            for(int j = 0; j < list[i].length - 1; j++) {
                if(result < list[i][j]) {
                    result = list[i][j];
                }
            }
        }

        return result;
    }
}
