public class test1{
    public static void main(String[] args) {
        boolean w = true, x = true, y = false, z = false;
        System.out.println(w && x || y && z);
        System.out.println(w || y || x && z);
        System.out.println(w || x && y || z);
        System.out.println((w || y) && (x || z));
        System.out.println(6+5*4/2-2);
        System.out.println(100%12);
        System.out.println(8%3-5+12);
        System.out.println(27*87+3%12);
        System.out.println(8%3-5+12<27*87+3%12);
        //System.out.println(5>=(5<2)!=(5>=5)<2);
    }
}