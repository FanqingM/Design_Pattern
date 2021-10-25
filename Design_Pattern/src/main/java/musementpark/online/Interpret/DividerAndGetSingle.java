package musementpark.online.Interpret;

public class DividerAndGetSingle implements Expression{
    private String _content;
    private String _elderDiscount;
    private String _childDiscount;
    private String _fullPrice;

    public DividerAndGetSingle(String content){
        this._content=content;
        this._elderDiscount="";
        this._childDiscount="";
        this._fullPrice="";
    }

    @Override
    public void interpret() {
        int flag = 0;
        _fullPrice = getString(flag);
        flag += _fullPrice.length() + 1;

        _childDiscount = getString(flag);
        flag += _childDiscount.length() + 1;

        _elderDiscount = getString(flag);
    }

    public String getString(int index){
        String temp="";
        for(int i=index;i<_content.length();i++){
            if(_content.charAt(i)!='/') {
                temp += _content.charAt(i);
                continue;
            }
            break;
        }
        return temp;
    }

    public double getElderDiscount(){
        return Double.parseDouble(_elderDiscount);
    }
    public int getFullPrice(){
        return Integer.parseInt(_fullPrice);
    }
    public double getChildDiscount(){
        return Double.parseDouble(_childDiscount);
    }
}
