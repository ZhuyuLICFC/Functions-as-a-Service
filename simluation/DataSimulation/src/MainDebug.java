public class MainDebug {

    public static Object lock;

    public static void main(String[] args) {
        //System.out.println(DataLayerHelper.generateID('P'));
        //Integer x = 129;
        //Integer y = 129;
        //System.out.println((x == y) + "   " + x.equals(y));

        /*while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Gogogo");
            String name = sc.nextLine();
            int[] result = new int[name.length()];
            for (int i = 0; i < name.length(); i++) {
                result[i] = name.charAt(i)-'a'+1;
            }
            for (int i : result) {
                System.out.println(i);
            }
        }*/
        //init();


        /*RedisHelper redisHelper = new RedisHelper();
        ThreadActivity activities = new ThreadActivity();
        Thread userThread = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        activities.userActivity();
                    }
                }
        );

        Thread serverThread = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        activities.serverActivity();
                    }
                }
        );

        userThread.start();
        serverThread.start();*/

        final RedisHelper redisHelper = new RedisHelper(1);

        DriverDebugThread driverDebugThread = new DriverDebugThread(1,redisHelper);
        PassengerDebugThread passengerDebugThread = new PassengerDebugThread(1,redisHelper);
        //ThreadRoamingActivity threadRoamingActivity = new ThreadRoamingActivity(redisHelper);

        driverDebugThread.start();
        passengerDebugThread.start();
        //threadRoamingActivity.start();


    }

    private static void init(){
        Driver d = new Driver();
    }
}
