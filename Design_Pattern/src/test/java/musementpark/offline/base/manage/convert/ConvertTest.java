package musementpark.offline.base.manage.convert;

import org.junit.jupiter.api.Test;

public class ConvertTest {
    @Test
    void testConvert() {
        Clark clark = new Clark(
                "游乐园人力资源经理——小明",
                "123",
                "游乐园人力资源部门",
                "上海市同济大学"
        );

        Converter converter = new Converter();

        ClarkCard card = converter.convertToCard(clark);
        Clark sameClark = converter.convertToClark(
                card,
                "游乐园人力资源部门",
                "上海市同济大学"
        );

        card.checkClarkCard();
        sameClark.checkClark();
    }
}
