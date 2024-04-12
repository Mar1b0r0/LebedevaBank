package bank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Bank {

    private static final String ADMIN_LOGIN = "marlboro";
    private static final String ADMIN_PASSWORD = "7711";
    public void showInterface(){
        System.out.println("Выберете действие: ");
        System.out.println("1 - Создать новый лицевой счёт; ");
        System.out.println("2 - Воспользоваться банкоматом; ");
        checkChoice(enterDataFromKeyboard("Введите номер действия: "));
    }

    private void checkChoice(String choice) {
        switch (choice){
            case "1"-> askAdminData();
            case "2" -> ATM.start();
            default -> {
                System.out.println("Неверно введёный запрос. Попробуйте ещё раз. ");
                checkChoice(enterDataFromKeyboard("Введите номер действия:"));
                
            }
        }
    }


    private void askAdminData(){
        String login = enterDataFromKeyboard("Введите логин администратора: ");
        if ( login.equals(ADMIN_LOGIN)){
            String password = enterDataFromKeyboard ("Введите пороль администратора:");
            if (password.equals(ADMIN_PASSWORD)){
                createBankAccount();
            }
            else{
                System.out.println("Неверный пароль. Попробуйте ещё раз.");
                   askAdminData();
            }
        }
        else {
            System.out.println("Неверный логин. Попробуйте ещё раз.");
            askAdminData();
        }
    }

    private void createBankAccount() {
    }

    private String enterDataFromKeyboard(String messege) {
        System.out.println(messege);
        return new Scanner(System.in).nextLine();
    }
}
