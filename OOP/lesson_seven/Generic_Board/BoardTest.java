
public class BoardTest {
    public static void main(String[] args) {
        Board<String> b = new Board<String>(9, "May");
        b.setCordinats(4, 4, "Liad");
        System.out.println(b);
    }
}
