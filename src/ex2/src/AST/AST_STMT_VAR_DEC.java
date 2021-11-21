package AST;

public class AST_STMT_VAR_DEC extends AST_STMT
{
    public AST_VAR_DEC varDec;

    /******************/
    /* CONSTRUCTOR(S) */
    /******************/
    public AST_STMT_VAR_DEC(AST_VAR_DEC varDec){
        /******************************/
        /* SET A UNIQUE SERIAL NUMBER */
        /******************************/
        SerialNumber = AST_Node_Serial_Number.getFresh();

        /***************************************/
        /* PRINT CORRESPONDING DERIVATION RULE */
        /***************************************/
        System.out.print("====================== stmt -> varDec\n");

        /*******************************/
        /* COPY INPUT DATA NENBERS ... */
        /*******************************/

        this.varDec = varDec;
    }

    /****************************************************/
    /* The default message for an stmt varDec AST node */
    /**************************************************/
    public void PrintMe()
    {
        /*****************************************/
        /* AST NODE TYPE = STMT VARDEC AST NODE */
        /***************************************/
        System.out.print("AST NODE STMT VARDEC\n");

        /********************************/
        /* RECURSIVELY PRINT varDec ... */
        /*******************************/
        if (varDec != null) varDec.PrintMe();

        /*********************************/
        /* Print to AST GRAPHIZ DOT file */
        /*********************************/
        AST_GRAPHVIZ.getInstance().logNode(
            SerialNumber,
            "STMT\nVARDEC");

        /****************************************/
        /* PRINT Edges to AST GRAPHVIZ DOT file */
        /****************************************/
        AST_GRAPHVIZ.getInstance().logEdge(SerialNumber,varDec.SerialNumber);

    }
}

}