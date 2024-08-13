public class SwitchStatement {

    public static void main(String[] args) {

        //using java 8 features
        String day = "mon";
        String time = "";

        switch (day) {
            case "mon":
                time = "6am";
                break;
                case "Tue":
                    time = "7am";
                    break;
                    case "Wed":
                        time = "8am";
                        break;
            default:
                time = "9am";
        }
        System.out.println(time);

        //using java new feature using lambdas (->)
        String day1 = "mon";
        String time1 = "";

        time1 = switch (day1) {
            case "mon" -> time1 = "6am";
            case "Tue" -> time1 = "7am";
            case "Wed" -> time1 = "8am";
            default -> time1 = "9am";
        };
        System.out.println(time1);


        //using java new feature using yield
        String day2 = "mon";
        String time2 = "";

        time2 = switch (day2) {
            case "mon": yield time2 = "6am";
            case "Tue" : yield time2 = "7am";
            case "Wed" : yield time2 = "8am";
            default : yield  time2 = "9am";
        };
        System.out.println(time2);
    }
}
