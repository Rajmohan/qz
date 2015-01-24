import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Optional;

public class DuckFoo {
     private static class Duck {
           public void quack() {
                System.out.println("QUACK");
           }
	 }
     
	 private static class Foo {
           public void doFoo() {
                System.out.println("FOO");
           }
     }
     
	 private static Duck duck = new Duck();
     private static Foo foo = new Foo();
     
	 public static void main(String[] args) {

            Optional<String> opt = Arrays.asList(args).
                        stream().findFirst();

            opt.ifPresent( (String s) -> foo.doFoo() );
            opt.orElseGet( () -> { duck.quack(); return "";} );

	 }

}	 	   
