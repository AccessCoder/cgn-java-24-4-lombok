package de.neuefische;

import lombok.*;

@Data //<- Getter/Setter/Equals&Hashcode/toString
@AllArgsConstructor //<- Konstruktor mit allen Werten!
@NoArgsConstructor //<- Konstruktor ohne Werte
//@RequiredArgsConstructor//<- Konstruktor der nur final Felder befüllt
@Builder//<-Ermöglicht Builder Pattern, also einen universal Konstruktor
public class LombokStudent {

    private String name;
    private String id;
    private int age;

}
