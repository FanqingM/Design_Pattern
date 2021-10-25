package musementpark.offline.shoppingarea;

import musementpark.offline.shoppingarea.adapter.AC220;
import musementpark.offline.shoppingarea.adapter.DC;
import musementpark.offline.shoppingarea.adapter.PowerAdapter;

class AdapterTest {
    public static void main(String[] args) {
        DC adapter = new PowerAdapter(new AC220());

        adapter.output5V();
    }

}