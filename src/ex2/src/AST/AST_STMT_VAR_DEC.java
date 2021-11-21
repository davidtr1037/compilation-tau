package AST;

public class AST_STMT_VAR_DEC extends AST_STMT
{
    public AST_VAR_DEC varDec;
    public AST_STMT_VAR_DEC(AST_VAR_DEC varDec){
        this.varDec = varDec;
    }
}