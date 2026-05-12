package capstone0;

import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FileManager fileManager = new FileManager("src/main/resources/transactions.csv");

        ArrayList<Transaction> transactions = fileManager.loadTransactions();

        fileManager.saveTransactions(transactions);


    }
}
