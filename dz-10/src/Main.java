public class Main {
    public static void main(String[] args) {
        BankApplication bankApp = new BankApplication();

        try {
            // call the process method with the first set of parameters
            bankApp.process("accountId000", 50, "USD");
        } catch (exceptions.WrongAccountException e) {
            System.out.println("No such account exists");
        } catch (exceptions.WrongCurrencyException e) {
            System.out.println("The account has an account in another currency");
        } catch (exceptions.WrongOperationException e) {
            System.out.println("The account does not have enough funds");
        } catch (Exception e) {
            System.out.println("A processing error occurred, please try again");
        } finally {
            System.out.println("Thank you for using our service");
        }

        try {
            // call the process method with the second set of parameters
            bankApp.process("accountId003", 250, "HRV");
        } catch (exceptions.WrongAccountException e) {
            System.out.println("No such account exists");
        } catch (exceptions.WrongCurrencyException e) {
            System.out.println("The account has an account in another currency");
        } catch (exceptions.WrongOperationException e) {
            System.out.println("The account does not have enough funds");
        } catch (Exception e) {
            System.out.println("A processing error occurred, please try again");
        } finally {
            System.out.println("Thank you for using our service");
        }

        try {
            // call the process method with the third set of parameters
            bankApp.process("accountId001", 50, "EUR");
        } catch (exceptions.WrongAccountException e) {
            System.out.println("No such account exists");
        } catch (exceptions.WrongCurrencyException e) {
            System.out.println("The account has an account in another currency");
        } catch (exceptions.WrongOperationException e) {
            System.out.println("The account does not have enough funds");
        } catch (Exception e) {
            System.out.println("A processing error occurred, please try again");
        } finally {
            System.out.println("Thank you for using our service");
        }

        try {
            // call the process method with the fourth set of parameters
            bankApp.process("accountId001", 50, "USD");
        } catch (exceptions.WrongAccountException e) {
            System.out.println("No such account exists");
        } catch (exceptions.WrongCurrencyException e) {
            System.out.println("The account has an account in another currency");
        } catch (exceptions.WrongOperationException e) {
            System.out.println("The account does not have enough funds");
        } catch (Exception e) {
            System.out.println("A processing error occurred, please try again");
        } finally {
            System.out.println("Thank you for using our service");
        }

        try {
            // call the process method with the fifth set of parameters
            bankApp.process("accountId001", 50, "USD");
        } catch (exceptions.WrongAccountException e) {
            System.out.println("No such account exists");
        } catch (exceptions.WrongCurrencyException e) {
            System.out.println("The account has an account in another currency");
        } catch (exceptions.WrongOperationException e) {
            System.out.println("The account does not have enough funds");
        } catch (Exception e) {
            System.out.println("A processing error occurred, please try again");
        } finally {
            System.out.println("Thank you for using our service");
        }
    }
}

