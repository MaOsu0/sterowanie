public class IfTest {
    public static void main(String[] args) {
        int a = -23;

        boolean aPossitive = a > 0;
        boolean aEven = a % 2 == 0;

        if (aPossitive && aEven) {
            System.out.println("A jest liczbą parzystą i dodatnią");
        } else {
            if (aPossitive) {
                System.out.println("A jest liczbą dotatnią, ale nie parzystą");
            } else {
                if (aEven) {
                    System.out.println("A jest liczbą patrzystą, ale nie jest dodatnia");
                } else {
                    System.out.println("A nie jest liczbą ani parzystą ani dodatnią");
                }
            }
        }
    }
}
