public class TrainingCoda {
    public static void main(String[] args) {
        int a = 280;
        int b = 121;
        int sum = a + b;
        System.out.println(sum);
        int minyc = b - a;
        System.out.println(minyc);
        int multiplication = a * b;
        System.out.println("Умножение: " + multiplication);
        int division = b / a;
        System.out.println(division);
        int r = b % a;
        System.out.println(r);
        boolean c = a < b;
        System.out.println("a<b " + c);
        boolean d = a > b;
        System.out.println("a>b " + d);
        boolean q = true;
        boolean f = false;
        System.out.println("Оператор И: " + (q && f));
        System.out.println("Оператор ИЛИ: " + (q || f));
        System.out.println("Отрицание: " + (!q));
        int L = 5000;
        int H = 106666666;
        int N = 0;
        N = L * H * 1000000000 * 1000000000 * 1000000000;
        System.out.println("Переполнение:" + N);//

    }
}
