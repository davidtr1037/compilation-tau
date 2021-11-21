package AST;

public class AST_EXP_PAREN extends AST_EXP
{
    public AST_EXP exp;

    /******************/
    /* CONSTRUCTOR(S) */
    /******************/
    public AST_EXP_PAREN(AST_EXP exp)
    {
        /******************************/
        /* SET A UNIQUE SERIAL NUMBER */
        /******************************/
        SerialNumber = AST_Node_Serial_Number.getFresh();

        /***************************************/
        /* PRINT CORRESPONDING DERIVATION RULE */
        /***************************************/
        System.out.print("====================== exp -> ( exp )\n");

        /*******************************/
        /* COPY INPUT DATA NENBERS ... */
        /*******************************/
        this.exp = exp;
    }

    /*************************************************/
    /* The printing message for a Parentheses exp AST node */
    /*************************************************/
    public void PrintMe()
    {
        /************************************/
        /* AST NODE TYPE = EXP PAREN AST NODE */
        /************************************/
        System.out.print("AST NODE EXP PAREN\n");

        /*****************************/
        /* RECURSIVELY PRINT exp ... */
        /*****************************/
        if (exp != null) exp.PrintMe();

        /*********************************/
        /* Print to AST GRAPHIZ DOT file */
        /*********************************/
        AST_GRAPHVIZ.getInstance().logNode(
                SerialNumber,
                "PAREN\n( EXP )");
    }
}