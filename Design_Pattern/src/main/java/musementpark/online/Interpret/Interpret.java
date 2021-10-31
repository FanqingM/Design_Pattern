package musementpark.online.Interpret;

import musementpark.util.Print;
import musementpark.util.PrintInfo;

import java.util.Stack;
/**
 * author: PandaLYZ
 * description:该类为Intercept类，在该类中定义了不同操作符的优先级，定义了两个栈，一个操作数栈，一个操作符栈，并规定了运算的相关文法与
 * 规则，对输入的算术表达式进行逐步分析并得出最终的答案。由此，该类实现了解释器模式，同时支持包含小数的运算，应用于计算一批人买票计算总价的场景
 */
public class Interpret {
    /**
     * description: 该方法用于获取不同的操作符的优先级
     * @param op 传入相应的运算符
     * @return 返回该运算符对应的优先级
     */
    private int getOpsLevel(char op){
        if (op == '+' || op == '-')
            return 1;
        else if (op == '*' || op == '/')
            return 2;
        else
            return 0;
    }

    /**
     * description: 该方法进行一步的具体运算，在该方法中实现操作数、操作符入栈出栈的相关操作
     * @param num 操作数的栈
     * @param ops 操作符的栈
     */
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

    /**
     * description: 在该方法中定义了操作数的栈和操作符的栈，定义了相应的文法规则，实现了对输入的算数表达式逐位解析并计算的功能
     * @param expression 输入的算术表达式
     * @return Double类型的算术表达式的值
     */
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
        Print.print(new PrintInfo(
                "Interpret",
                String.valueOf(System.identityHashCode(this)),
                "calculate",
                expression+"的结果是: "+stackNum.peek().intercept().toString()
        ));
        return stackNum.peek().intercept();
    }
}
