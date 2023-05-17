// abstract class Shape {
//   double get area;
// }

// class Circle implements Shape {
//   final double radius;

//   Circle(this.radius);

//   double get area => pi * pow(radius, 2);
// }

// class Rectangle implements Shape {
//   final double width;
//   final double height;

//   Rectangle(this.width, this.height);

//   double get area => width * height;
// }

// double calculateArea(Shape shape) {
//   return shape.area;
// }

// final circle = Circle(5.0);
// final rectangle = Rectangle(3.0, 4.0);

// print(calculateArea(circle)); // output: 78.53981633974483
// print(calculateArea(rectangle)); // output: 12.0

abstract class Bird {
  void fly();
}

abstract class Fish {
  void swim();
}

abstract class Penguin implements Bird, Fish {
  @override
  void fly() {
    // Implementation for fly method
  }

  @override
  void swim() {
    // Implementation for swim method
  }
}

class Eagle implements Bird {
  @override
  void fly() {
    // Implementation for fly method
  }
}

void main() {
  final penguin = Penguin();
  final eagle = Eagle();

//   penguin.fly(); 
//   penguin.swim(); 

//   eagle.fly(); 
// }

abstract class PaymentGateway {
  void processPayment(double amount);
}

class StripePaymentGateway implements PaymentGateway {
  @override
  void processPayment(double amount) {
    //implementaiton
  }
}

class PayPalPaymentGateway implements PaymentGateway {
  @override
  void processPayment(double amount) {
    // Implementation 
  }
}

class ShoppingCart {
  final PaymentGateway paymentGateway;

  ShoppingCart(this.paymentGateway);

  void checkout(double amount) {
    paymentGateway.processPayment(amount);
  }
}

void main() {
  final stripePaymentGateway = StripePaymentGateway();
  final payPalPaymentGateway = PayPalPaymentGateway();

  final shoppingCartWithStripe = ShoppingCart(stripePaymentGateway);
  final shoppingCartWithPayPal = ShoppingCart(payPalPaymentGateway);

  shoppingCartWithStripe.checkout(100.0); // Process payment using Stripe
  shoppingCartWithPayPal.checkout(200.0); // Process payment using PayPal
}

