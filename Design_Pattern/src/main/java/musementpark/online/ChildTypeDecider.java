package online;

public class ChildTypeDecider extends TypeDecider{

    ChildTypeDecider( int ageThreshold) {
        super(Type.CHILD, ageThreshold);
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
