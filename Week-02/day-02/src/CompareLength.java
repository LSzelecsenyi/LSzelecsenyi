public class CompareLength {

    public static void main(String[] args) {

// - Create an array variable named `p1`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `p2`
//   with the following content: `[4, 5]`
// - Print if `p2` has more elements than `p1`

        int[] p1 = {1, 2, 3};
        int[] p2 = {4, 5};

        if(p1.length < p2.length) {
            System.out.println("p2 has more elemnts than p1.");
        } else if(p1.length > p2.length) {
            System.out.println("p1 has more elemnts than p2.");
        } else {
            System.out.println("p1 and p2 has the same ammount of elements.");
            }

    }

}
