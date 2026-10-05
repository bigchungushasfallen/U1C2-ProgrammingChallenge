public class t {
    public double adjustDigits(double userDouble) {
        int hundred = (int) Math.floor(userDouble % 100);
        int tens = (int) Math.floor(userDouble / 10);
        int ones = (int) (userDouble % 10);
        int tenths = (int) Math.floor(userDouble % 1 * 10);
        int hundreths = (int) (((userDouble % 1 * 10) - Math.floor(userDouble % 1 * 10)));
        System.out.printf("%d, %d, %d, %d, %d", hundred, tens, ones, tenths, hundreths);
        return userDouble;
    }
}
