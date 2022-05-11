public class Main {
    public static void main(String[] args) throws com.ug10.User{
        String username = System.console().readLine("username: ");
        char[] pass = System.console().readPassword("password:");
        String password = new String(pass);

        try{
            if(password.isEmpty()){
                throw .new com.ug10.PasswordException(1);
            }
            else{
                boolean flagKecil = false;
                boolean flagBesar = false;
                boolean flagAngka = false;
            }
        }
    }
}
