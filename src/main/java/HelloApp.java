public class HelloApp {
    public static void main(String[] args) {

        String names;

        if (args.length == 0) {
            names = "World";
        } else {
            StringBuilder sb = new StringBuilder();

            int count = 0;
            for (String name : args) {
                sb.append(name);
                count++;
                if (count < args.length) {
                    sb.append(", ");
                }
            }

            names = sb.toString();
        }

        System.out.println("Hello, " + names + "!");
    }
}