class Main {
    public static void main(String[] args) {
        // edge cases
        if(args[0].length() == 0 || args[1].length() == 0 || args[0].length() != args[1].length()) {
            System.out.println("false");
            return;
        }
        // two ascii value arrays, initialize to zero
        int map1[] = new int[256];
        int map2[] = new int[256];
        for(int i = 0; i < args[0].length(); i++) {
            // mapping already exists
            if(map2[args[1].charAt(i)] != 0) {
                int index = map2[args[1].charAt(i)] - 1;
                char ch = args[0].charAt(index);
                // check if mapping consistent
                System.out.println(map2[args[1].charAt(i)] == map1[ch]);
                return;
            }
            // mapping already exists, inconsistent
            if(map1[args[0].charAt(i)] != map2[args[1].charAt(i)]) {
                System.out.println("false");
                return;
            }
            // mapping does not exist yet, set to same value
            map1[args[0].charAt(i)] = i + 1;
            map2[args[1].charAt(i)] = i + 1;
        }
        System.out.println("true");
    }
}