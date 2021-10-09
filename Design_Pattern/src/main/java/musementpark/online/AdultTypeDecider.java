package online;

public class AdultTypeDecider extends  TypeDecider{
    AdultTypeDecider( int ageThreshold) {
        super(Type.ADULT, ageThreshold);
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
