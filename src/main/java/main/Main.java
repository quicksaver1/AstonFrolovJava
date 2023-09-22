package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        TextArea console = new TextArea();
        console.setEditable(false);


        // Алгоритм 1: если введенное число больше 7, то вывести “Привет”
        TextField numberInput = new TextField();
        numberInput.setPromptText("Введите число");
        Button checkNumberButton = new Button("Проверить число");
        checkNumberButton.setOnAction(e -> {
            try {
                int number = Integer.parseInt(numberInput.getText());
                if (number > 7) {
                    console.appendText("Привет\n");
                }
            } catch (NumberFormatException ex) {
                console.appendText("Ошибка: неверно введено число\n");
            }
        });
        root.getChildren().addAll(new Label("Алгоритм 1:"), numberInput, checkNumberButton);

        // Алгоритм 2: Вывести "Привет, Вячеслав" или "Нет такого имени"
        TextField nameInput = new TextField();
        nameInput.setPromptText("Введите имя");
        Button checkNameButton = new Button("Проверить имя");
        checkNameButton.setOnAction(e -> {
            String name = nameInput.getText();
            if (name.equalsIgnoreCase("вячеслав")) {
                console.appendText("Привет, Вячеслав\n");
            } else {
                console.appendText("Нет такого имени\n");
            }
        });
        root.getChildren().addAll(new Label("Алгоритм 2:"), nameInput, checkNameButton);

        // Задача 3: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
        TextField arrayInput = new TextField();
        arrayInput.setPromptText("Введите числовой массив через пробел");
        Button checkArrayButton = new Button("Вывести числа кратные трём");
        checkArrayButton.setOnAction(e -> {
            try {
                String[] numbers = arrayInput.getText().split(" ");
                for (String number : numbers) {
                    int n = Integer.parseInt(number);
                    if (n % 3 == 0) {
                        console.appendText(number + " ");
                    }
                }
            }
            catch (NumberFormatException ex) {
                console.appendText("Ошибка: неверно введено число");
            }
            finally{
                console.appendText("\n");
            }
        });

        root.getChildren().addAll(new Label("Алгоритм 3:"), arrayInput, checkArrayButton);
        root.getChildren().add(console);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);

        primaryStage.setTitle("Тестовое Задание");
        primaryStage.show();
        root.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}