package gangoffour.behavioral.interpreter;

/**
 * This interpreter just returns the OR condition of the data is same as the interpreter data.
 * And this is NON-TERMINAL expression.
 */
public class OrExpression implements Expression {

    Expression expressionOne;
    Expression expressionTwo;

    public OrExpression(Expression expressionOne, Expression expressionTwo) {
        this.expressionOne = expressionOne;
        this.expressionTwo = expressionTwo;
    }

    public boolean interpreter(String con) {
        return expressionOne.interpreter(con) || expressionTwo.interpreter(con);
    }

}