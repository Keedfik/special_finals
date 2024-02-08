import java.util.Scanner;

import Model.AddAnimal;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        AddAnimal animalRegistryService = new AddAnimal();
        boolean obs = true;
        while (obs) {

            System.out.println("\n==== Animal Registry ====");
            System.out.println("1. Add animal");
            System.out.println("2. Animal's skills");
            System.out.println("3. Add new skill");
            System.out.println("4. Animal list");
            System.out.println("5. Exit");
            System.out.print("Выберите пункт меню: ");

            String choice = console.nextLine();
            String name_animal = null;
            String birthday = null;
            String command = "walk";
            String type_animal = null;
            String new_skill = null;
            switch (choice) {
                case "1":
                    System.out.println("Name: ");
                    name_animal = console.nextLine();
                    try {
                        System.out.println("Date of birth (2024-02-08): ");
                        birthday = console.nextLine();
                        if (birthday.length() == 10) {                            
                            System.out.println("Animal type (Cat/Dog/Hamster/Horse/Donkey/Camel): ");
                            type_animal = console.nextLine();
                        } else {
                            System.out.println("Error");
                        }

                        animalRegistryService.getNewAnimal(name_animal, birthday, command, type_animal);
                    } catch (Exception e) {
                        System.out.println("Error");
                    }

                    break;
                
                case "2":
                    System.out.println("Name");
                    name_animal = console.nextLine();
                    try {
                        animalRegistryService.getCommand(name_animal);
                    } catch (Exception e){
                        System.out.println("No animal found");
                    }
                    break;
                
                case "3":
                    System.out.println("Name");
                    name_animal = console.nextLine();
                    System.out.println("Command");
                    new_skill = console.nextLine();
                    try {
                        animalRegistryService.learnCommand(name_animal, new_skill);
                    } catch (Exception e){
                        System.out.println("No animal found");
                    }
                    break;
                
                case "4":
                    animalRegistryService.showAnimalList(animalRegistryService.animalList());
                    break;
                case "5":
                    System.out.println("\n Bye");
                    obs = false;
                    break;
            }

        }

    }

}