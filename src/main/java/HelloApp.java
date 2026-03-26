public class HelloApp {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        if (args.length == 0) {
            sb.append("World");
        } else {
            int i = 0;
            for (String name : args) {
                sb.append(name);
                if (i < args.length - 1) {
                    sb.append(", ");
                }
                i++;
            }
        }

        System.out.println("Hello, " + sb.toString() + "!");
    }
}