public class mini_atm_menu {
    public static void main(String[] args) {
        /*
         * Display a menu:
         * 
         * 1 → Check Balance
         * 2 → Deposit
         * 3 → Withdraw
         * 4 → Exit
         * 
         */
        
        int menuNum = 3;
        switch(menuNum) {
            case 1:
                System.out.println("Check Balance");
                break;
            case 2:
                System.out.println("Deposit");
                break;
            case 3:
                System.out.println("Withdraw");
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
