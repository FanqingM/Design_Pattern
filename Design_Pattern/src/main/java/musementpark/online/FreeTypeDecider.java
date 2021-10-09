package online;

public class FreeTypeDecider extends TypeDecider{

    FreeTypeDecider(int ageThreshold) {
        super(Type.FREE,ageThreshold);
    }

    @Override
    public Boolean condition(int age) {
        if(age<_ageThreshold) {
            return true;
        }else{
            return false;
        }
    }
}
