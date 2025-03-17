Coffee Shop Simulator and Payment Gateway

Coffee Shop Simulator: A coffee shop ordering system with customizable drinks.

Payment Gateway: A payment processing system supporting multiple payment methods.

Brief Description
This repository contains two Java projects that demonstrate the use of design patterns:

Coffee Shop Simulator: Allows users to select different types of coffee and add ingredients. It uses the Factory Method and Decorator design patterns.

Payment Gateway: Supports multiple payment methods (credit card, PayPal, cryptocurrency). It uses the Factory Method and Adapter design patterns.

Key Features
Coffee Shop Simulator
Choose a base coffee type (espresso, cappuccino, latte, americano).

Add ingredients (milk, caramel syrup, whipped cream, chocolate syrup).

Calculate the total cost of the order.

Dynamically update the order description.

Payment Gateway
Support for multiple payment methods: credit card, PayPal, cryptocurrency.

Integration with external APIs (e.g., PayPal, credit card validation).

Process payments and display transaction status.

Installation and Setup
Requirements
Java Development Kit (JDK) version 8 or higher.

Git (for cloning the repository).

Installation
Clone the repository:
git clone https://github.com/your-repository/coffee-shop-and-payment-gateway.git
Navigate to the project folder:
cd coffee-shop-and-payment-gateway

Running the Projects
Coffee Shop Simulator
Navigate to the coffee-shop-simulator folder:

cd coffee-shop-simulator
Compile and run the project:

javac src/*.java
java -cp src CoffeeShopSimulator
Payment Gateway
Navigate to the payment-gateway folder:

cd payment-gateway
Compile and run the project:

javac src/*.java
java -cp src PaymentGatewayDemo
Developer Mode
For development and making changes:

Ensure you have an IDE installed (e.g., IntelliJ IDEA, Eclipse, or VS Code).

Import the project into your IDE.

Make the necessary changes to the code.

Test your changes using the commands described in the Running the Projects section.

User Mode
For using the applications:

Run the project by following the instructions above.

Follow the prompts in the console to select coffee or payment methods.

Enter the required details (e.g., ingredients or payment credentials).

Receive the result (order description or payment status).

Project Contributors
Renat: Developer and primary maintainer of the project.