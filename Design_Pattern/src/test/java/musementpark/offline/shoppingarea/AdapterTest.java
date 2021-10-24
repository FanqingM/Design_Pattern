package musementpark.offline.shoppingarea;

import static org.junit.jupiter.api.Assertions.*;

class AdapterTest {
    public static void main(String[] args) {
        DC adapter = new PowerAdapter(new AC220());

        adapter.output5V();
    }

}