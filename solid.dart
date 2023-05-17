
abstract class Shape {
  double getArea();
}

class Circle implements Shape {
  double radius;

  Circle(this.radius);

  @override
  double getArea() {
    return 3.14 * radius * radius;
  }
}

class Square implements Shape {
  double side;

  Square(this.side);

  @override
  double getArea() {
    return side * side;
  }
}

class AreaCalculator {
  double calculateArea(List<Shape> shapes) { 
    double totalArea = 0.0;
    for (Shape shape in shapes) {
      totalArea += shape.getArea();
    }
    return totalArea;
  }
}

// // abstract class for shapes
// abstract class Shape {
//   double area();
// }

// class Rectangle implements Shape {
//   double width;
//   double height;

//   Rectangle(this.width, this.height);

//   @override
//   double area() {
//     return width * height;
//   }
// }

// class Circle implements Shape {
//   double radius;

//   Circle(this.radius);

//   @override
//   double area() {
//     return 3.14 * radius * radius;
//   }
// }

// void main() {
//   Shape rectangle = Rectangle(5, 3);
//   Shape circle = Circle(4);

//   print(rectangle.area()); // output: 15.0
//   print(circle.area()); // output: 50.24
// }