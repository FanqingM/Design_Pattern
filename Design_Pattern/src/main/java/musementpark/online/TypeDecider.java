package online;

public abstract class TypeDecider
{
    private TypeDecider _next;
    protected int _ageThreshold;
    protected Type _result;

    TypeDecider(Type result,int ageThreshold)
    {
        this._result=result;
        this._ageThreshold=ageThreshold;
    }

    public void setNext(TypeDecider next)
    {
        this._next=next;
    }

    //Duty Chain Method
    public Type getType(int age)
    {
        if(condition(age))    //Template Method
        {
            return _result;
        }else if(_next!=null){
            return _next.getType(age);
        }
        return null;
    }

    public abstract Boolean condition(int age);
}
