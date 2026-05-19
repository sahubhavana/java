1.Single inheritance
class Animal{
   void sound() {
       System.out.print("Animal make sound");
   }
}
class Dog extends Animal{
       void bark(){
           System.out.print("Dog is barking");
       }
}
