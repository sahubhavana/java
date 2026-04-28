interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Square");
    }
}

class ShapeFactory {
    public Shape getShape(String type) {
        if (type.equals("circle")) return new Circle();
        else return new Square();
    }
}
