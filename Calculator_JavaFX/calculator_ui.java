@Override
    public void start(Stage primaryStage) {
        window = primaryStage;

        window.setTitle("Calculator");
        window.setWidth(500);
        window.setHeight(400);

        // Create input field
        inputField = new TextField();
        inputField.setPrefWidth(200);

        // Create number and operator buttons
        Button[] buttons = new Button[16];
        String[] buttonLabels = {
            "0", "1", "2", "3",
            "4", "5", "6", "7",
            "8", "9", "+", "-",
            "*", "/", "C", "="
        };

        for (int i = 0; i < 16; i++) {
            buttons[i] = new Button(buttonLabels[i]);
            buttons[i].setPrefSize(50, 50);
        }

        GridPane buttonGrid = new GridPane();
        buttonGrid.setHgap(10);
        buttonGrid.setVgap(10);

        int row = 0;
        int col = 0;
        for (Button button : buttons) {
            buttonGrid.add(button, col, row);
            col++;
            if (col > 3) {
                col = 0;
                row++;
            }
        }
        VBox mainLayout = new VBox(20);
        mainLayout.setPadding(new Insets(20));
        mainLayout.getChildren().addAll(inputField, buttonGrid);
        Scene scene = new Scene(mainLayout, 300, 400);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
