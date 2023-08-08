package algo01;

public class getMaxMin {

    public int getMax(int[] hairetsu) {
        int max = hairetsu[0];  // 배열의 첫 번째 값을 초기 최댓값으로 설정

        for (int i = 1; i < hairetsu.length; i++) {
            if (hairetsu[i] > max) {
                max = hairetsu[i];
            }
        }

        return max;
    }

    public int getMin(int[] hairetsu) {
        int min = hairetsu[0];  // 배열의 첫 번째 값을 초기 최댓값으로 설정

        for (int i = 1; i < hairetsu.length; i++) {
            if (hairetsu[i] < min) {
                min = hairetsu[i];
            }
        }

        return min;
    }

    public void sortArrayAscending(int[] hairetsu) {
        for (int i = 0; i < hairetsu.length - 1; i++) {
            for (int j = i + 1; j < hairetsu.length; j++) {
                if (hairetsu[i] > hairetsu[j]) {
                    int temp = hairetsu[i];
                    hairetsu[i] = hairetsu[j];
                    hairetsu[j] = temp;
                }
            }
        }
    }

    public void sortArrayDescending(int[] hairetsu) {
        for (int i = 0; i < hairetsu.length - 1; i++) {
            for (int j = i + 1; j < hairetsu.length; j++) {
                if (hairetsu[i] < hairetsu[j]) {
                    int temp = hairetsu[i];
                    hairetsu[i] = hairetsu[j];
                    hairetsu[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        getMaxMin gmm = new getMaxMin();
        int[] hairetsu = {0, 23, 4, 22, 5, 7, 8, 8, 234, 0, -5, 234, 1799};

        int max = gmm.getMax(hairetsu);
        int min = gmm.getMin(hairetsu);
        System.out.println("Result MAX: " + max);
        System.out.println("Result MIN: " + min);

        gmm.sortArrayAscending(hairetsu);
        System.out.print("Sorted Array: ");
        for (int num : hairetsu) {
            System.out.print(num + " ");
        }
        System.out.println();

        gmm.sortArrayDescending(hairetsu);
        System.out.print("Sorted Array: ");
        for (int num : hairetsu) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
