package com.company.day5.day3.collections;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class FileExample {
    public static void main(String[] args) throws FileNotFoundException {
/*
        int[] numbers = {1,2,3,4,5};
        String[] strings = {"string-1","string-2","string-3"};
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("array.dat"));){
            objectOutputStream.writeObject(numbers);
            objectOutputStream.writeObject(strings);
        }catch (Exception exception){}

  */
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("array.dat"));) {
            int[] numbers2 = (int[]) objectInputStream.readObject();
            String[] strings2 = (String[]) objectInputStream.readObject();
            for (int number : numbers2)
                System.out.println(number);
            for (String str : strings2)
                System.out.println(str);

        } catch (Exception exception) {
        }


       /* File file2 =
                new File("C:\\Users\\dev.chouhan_infobean\\IdeaProjects\\Java Project\\resources\\test2.txt");
        *//*try (PrintWriter printWriter = new PrintWriter(file2)) {
            printWriter.println("This is a code created file");
            printWriter.println("This is the second line");
        }*//*
        try (Scanner scanner = new Scanner(file2)) {
            while (scanner.hasNext()) {
                String expression = scanner.nextLine();
                String[] s = expression.split(" ");
                int a = Integer.parseInt(s[0]);
                int b = Integer.parseInt(s[2]);
                if (s[1].equals("+")) {
                    System.out.println(a + b);
                } else {
                    System.out.println(a - b);
                }
            }
        }*/
/*
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.data"));) {
            objectOutputStream.writeUTF("This is from object output stream");
            objectOutputStream.writeObject(new Date());
        }catch (Exception exception){exception.getMessage();}*/

    }
}
