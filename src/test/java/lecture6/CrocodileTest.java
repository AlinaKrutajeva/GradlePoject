package lecture6;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CrocodileTest {

    @Test
    public void firstTest() {
        Crocodile crocodile = new Crocodile();
        crocodile.setColor("Green");
        crocodile.setName("Gena");
        crocodile.setLength(200);
        crocodile.setSize(2500);
        crocodile.setHungry(true);

        Assertions.assertThat(crocodile.getColor()).isEqualTo("Green");
        Assertions.assertThat(crocodile.getName()).isEqualTo("Gena");
        Assertions.assertThat(crocodile.getLength()).isEqualTo(200);
        Assertions.assertThat(crocodile.getSize()).isEqualTo(2500);
        Assertions.assertThat(crocodile.isHungry()).isEqualTo(true);
        Assertions.assertThat(crocodile.isHungry()).isTrue();

//        System.out.println(crocodile.getColor());
//        System.out.println(crocodile.getName());
//        System.out.println(crocodile.getLength());
//        System.out.println(crocodile.getSize());
//        System.out.println(crocodile.isHungry());
    }
}
