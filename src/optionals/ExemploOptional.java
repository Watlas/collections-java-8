package optionals;

import java.util.Optional;
import java.util.OptionalDouble;

public class ExemploOptional {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Valor presente");

        System.out.println("Valor optional está presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("mão está presente"));

        System.out.println("Valor optinal não está presente");
        Optional<String> optionalNull = Optional.ofNullable("carla");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("Null = não esta present"));

        Optional<String>  optinalEmpty = Optional.empty();

        System.out.println("Valor optional que não está presente");
        optinalEmpty.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não está presente"));

        Optional<String>  optionalNullerro = Optional.of(null);

        System.out.println("Valor opptional que lanca erro nullPoiterException");
        optionalNullerro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = mão está presente"));



    }
}
