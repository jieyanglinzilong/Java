package �˻ʺ�����;



import java.util.Random;

public class ququen {

    // �����ģ
    static int SIZE = 8;
    // �����������
    static Random rnd = new Random(SIZE);
    // ������
    static int[] queen = new int[SIZE];

    private static boolean check(int row) {
        for (int i = 0; i < queen.length && i != row; i++) {
            if (queen[i] == queen[row] || i - queen[i] == row - queen[row] || i + queen[i] == row + queen[row]) {
                return false;
            }
        }
        return true;
    }

    private static boolean queensLV() {
        int row = 0;
        int count = 1;
        while ((row < SIZE) && (count > 0)) {
            count = 0;
            int j = 0;
            for (int column = 0; column < SIZE; column++) {
                queen[row] = column;
                if (check(row)) {
                    if (rnd.nextInt(++count) == 0) {
                          j = column;
                        // break;//��break�����һ���ҵ����ʵ���place(k)���㣬��ô��ʱrandom��1��==0����������������break���Ͱѻʺ���������λ�á�������ַ��ûʺ�ķ��������У��´�ѭ������ִ��ͬ���ģ���һֱѭ�����������Ҳ�����������ʣ�µ����лʺ���ò��˵Ŀ���������
                        // û��break����һֱ��̽forѭ��������x[k]���������ѡ��ǰ���Է��õ�λ����forѭ�����һ��������С���ô�������n-1���ʺ���ò��˵Ŀ����Լ�С��
                    }
                }
            }
            if (count > 0) {
                queen[row++] = j;
            }
        }
        return (count > 0);
    }

    public static void nQueen() {
        while (!queensLV());
        System.out.println("-----�ⷨ--------");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (queen[i] == j) {
                    System.out.print(" Q ");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        nQueen();
    }
}

