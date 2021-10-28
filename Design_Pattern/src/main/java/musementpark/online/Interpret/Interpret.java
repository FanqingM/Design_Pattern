package musementpark.online.Interpret;

import java.util.Stack;

public class Interpret {

    private int getOpsLevel(char op){
        if (op == '+' || op == '-')
            return 1;
        else if (op == '*' || op == '/')
            return 2;
        else
            return 0;
    }


    void cal(Stack<Expression> num, Stack<String> ops){
        Expression num2=num.peek();
        num.pop();
        Expression num1=num.peek();
        num.pop();
        char op=ops.peek().charAt(0);
        ops.pop();
        switch(op){
            case '+':
                num.push(new Add(num1,num2));
                break;
            case '-':
                num.push(new Sub(num1,num2));
                break;
            case '*':
                num.push(new Multi(num1,num2));
                break;
            case '/':
                num.push(new Div(num1, num2));
                break;
        }
    }

    public Double calculate(String expression)
    {

        Stack<Expression> stackNum=new Stack<>();
        Stack<String> stackOps=new Stack<>();   //Java中char不能作为容器内数据的类型
        String temp;
        stackOps.push("#");

        int sign=1;
        int n = expression.length();

        for(int i=0;i<n;i++){
            temp=String.valueOf(expression.charAt(i));
            if(temp==" "){
                continue;
            }
            else if(Character.isDigit(temp.charAt(0))){
                Double sum =Double.valueOf(temp.charAt(0)-'0') ;
                Double afterDot=0.0;
                if(i<n-1){
                    i+=1;
                    temp=String.valueOf(expression.charAt(i));
                    while(i<n && Character.isDigit((temp=String.valueOf(expression.charAt(i))).charAt(0))){
                        sum=sum*10+(int)(temp.charAt(0)-'0');
                        i++;
                    }
                    //如果该数有小数部分
                    if(i<n&&(temp=String.valueOf(expression.charAt(i))).charAt(0)=='.'){
                        i+=1;
                        temp=String.valueOf(expression.charAt(i));
                        afterDot=Double.valueOf(temp.charAt(0)-'0')*0.1;  //获取第一位小数
                        if(i<n-1) {
                            int count=2;
                            i+=1;
                            while (i < n && Character.isDigit((temp = String.valueOf(expression.charAt(i))).charAt(0))) {
                                afterDot = afterDot + ((int) (temp.charAt(0) - '0'))*Math.pow(0.1,count);
                                i++;
                                count++;
                            }
                        }
                        else{
                            sum+=afterDot;
                            stackNum.push(new Number(Double.valueOf(sum*sign)));
                            continue;
                        }
                    }
                    sum+=afterDot;
                    stackNum.push(new Number(Double.valueOf(sum*sign)));
                    i--;
                }
                else{
                    stackNum.push(new Number(Double.valueOf(sum*sign)));
                }
                sign=1;
            }
            else if(temp.charAt(0)=='('){
                stackOps.push(temp);
                i+=1;
                if(Character.isDigit((temp=String.valueOf(expression.charAt(i))).charAt(0))){
                    i-=1;
                    continue;
                }
                else{
                    temp=String.valueOf(expression.charAt(i));
                    if(temp.charAt(0)=='+')
                    {
                        continue;
                    }
                    if(temp.charAt(0)=='-'){
                        sign=-1;
                    }
                    if(temp.charAt(0)=='('||temp.charAt(0)==')'){
                        i--;
                    }
                }
            }
            else if(temp.charAt(0)==')'){
                while(stackOps.peek().charAt(0)!='('){
                    cal(stackNum,stackOps);
                }
                stackOps.pop();
            }
            else{
                if(getOpsLevel(temp.charAt(0))>getOpsLevel(stackOps.peek().charAt(0))){
                    stackOps.push(temp);
                }
                else{
                    cal(stackNum,stackOps);
                    i--;
                }
            }
        }
        while(stackOps.peek().charAt(0)!='#'){
            cal(stackNum,stackOps);
        }
        return stackNum.peek().intercept();
    }
}
