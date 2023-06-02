public class ArrayObjects {
    public static void main(String[] args) {
        
        ArrayFood[] refridgerator = new ArrayFood[3];

        ArrayFood food1 = new ArrayFood("pizza");
        ArrayFood food2 = new ArrayFood("hamburger");
        ArrayFood food3 = new ArrayFood("hotdog");

        // refridgerator[0] = food1;
        // refridgerator[1] = food2;
        // refridgerator[2] = food3;

        System.out.println(refridgerator[0].name);
        System.out.println(refridgerator[1].name);
        System.out.println(refridgerator[2].name);
    }
}
