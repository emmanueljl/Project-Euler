class P15 {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java P15 [gridLength]");
            return;
        }
        int gridLength = Integer.parseInt(args[0]) + 1;

        long[][] routes = new long[gridLength][gridLength];
        for (int x = 0; x < gridLength; x++) {
            routes[x][gridLength - 1] = 1;
        }
        for (int y = 0; y < gridLength; y++) {
            routes[gridLength - 1][y] = 1;
        }

        for (int x = gridLength - 2; x >= 0; x--) {
            for (int y = gridLength - 2; y >= 0; y--) {
                routes[x][y] = routes[x + 1][y] + routes[x][y + 1];
            }
        }

        System.out.println(routes[0][0]);
    }

}