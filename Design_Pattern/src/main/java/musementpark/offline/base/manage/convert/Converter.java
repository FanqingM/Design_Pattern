package musementpark.offline.base.manage.convert;

public class Converter {
    public ClarkCard convertToCard(Clark clark){
        return new ClarkCard(
                clark.id,
                clark.name
        );
    }

    public Clark convertToClark(ClarkCard card, String office, String home)
    {
        return new Clark(
                card.name,
                card.id,
                office,
                home
        );
    }
}