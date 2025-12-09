class Animal {
void sound() {
System.out.println("Animal:Some generic sound");
}
}
class Dog extends Animal {
@Override
void sound() {
System.out.println("Dog:Bark, Bark");
}
}
class Cat extends Animal {
@Override
void sound() {
System.out.println("Cat:meow, meow");
}
}
