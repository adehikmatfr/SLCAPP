# Savings Loan Cooperative App

Java Swing-based desktop app to facilitate the usage of the Savings Loan Cooperative application.

## Getting Started

To get started with this project, follow the steps below:

1. Clone the repository to your local machine using the following command:
   ```
   git clone https://github.com/adehikmatfr/SLCAPP.git
   ```

2. Open the project in your preferred Java Integrated Development Environment (IDE).

3. Build the project to ensure all dependencies are resolved.

4. Run the main class `Main.java` to launch the Swing application.

## Project Structure
Here we use Clean code architecture and also MVC pattren to build the program.
The project structure is organized as follows:

```
├── src/                            # Source code directory
│   ├── app/                        # app directory classes
│   │   ├── controller/             # Directory for logic classes
│   │   ├── model/                  # Directory for data models mapper and DAO classes
│   │   └── view/                   # Directory for view classes
│   ├── config/                     # config directory
│   │   ├── file/                   # Directory for config file or etc
|   |   |   └── config.yaml.example # condif yaml example
│   │   ├── Config.java             # Config model 
│   │   └── DatabaseConfig.java     # Database config model
│   ├── storage/                    
│   │   ├── SQLExecuteResult.java   # Models Class for sql exec
│   │   └── SQLStorage.java         # Class for get connection api db
│   ├── util/                       # Directory for utility program
│   └── Main.java                   # Main class to start the application
├── test/                           # Directory for test file
└── README.md                       # Project README file
```

## Features

This Java Swing project demonstrates the following features:

Feel free to explore the source code and modify it according to your needs.

## Contributing

Contributions are welcome! If you find any issues or want to add new features, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make the necessary changes and commit your code.
4. Push your changes to your forked repository.
5. Submit a pull request to the main repository.

Please ensure that your code follows the project's coding conventions and includes appropriate documentation.

## License

This project is licensed under the [MIT License](LICENSE). Feel free to use, modify, and distribute the code for both commercial and non-commercial purposes.

## Acknowledgements

- [Oracle Swing Documentation](https://docs.oracle.com/javase/tutorial/uiswing/) - Official documentation for Java Swing.
- [Java Swing Tutorial](https://www.tutorialspoint.com/swing/index.htm) - Swing tutorial by TutorialsPoint.
