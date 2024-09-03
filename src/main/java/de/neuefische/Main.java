package de.neuefische;

public class Main {

    public static void main(String[] args) {
        LombokStudent lombokStudent = new LombokStudent("Max", "1", 52);
        RecordStudent recordStudent = new RecordStudent("Max", "1", 52);

        LombokStudent lombokStudent2 = LombokStudent.builder()
                .name("Max")
                .age(36)
                .id("1")
                .build();

        System.out.println(lombokStudent2);
    }
}