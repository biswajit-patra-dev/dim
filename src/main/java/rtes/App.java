package rtes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        System.out.println("Hello World!");
        processUserInput("Hello World!");
    }

    /**
     * This function uses vulnerable dependencies in a way that could potentially
     * expose the application to security risks.
     */
    public static void processUserInput(String userInput) {
        logger.info("Processed user input: {}", userInput);
    }
}