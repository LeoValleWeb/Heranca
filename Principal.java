public class Principal {
    
    public static void main(String args[]) {
        Dog dog = new Dog("Yuri",6);
        Dog dog2 = new Dog("Mirante",4);

        Cat cat = new Cat("Bonito",1);
        Cat cat2 = new Cat("Rajado",4);

        System.out.println(dog.getNome());
        System.out.println(dog.getIdade());

        System.out.println(dog2.getNome());
        System.out.println(dog2.getIdade());

        System.out.println(cat.getNome());
        System.out.println(cat.getIdade());

        System.out.println(cat2.getNome());
        System.out.println(cat2.getIdade());


    }

}
