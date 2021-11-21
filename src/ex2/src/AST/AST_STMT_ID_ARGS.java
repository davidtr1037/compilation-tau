package AST;

public class AST_STMT_ID_ARGS extends AST_STMT
{
    public String fieldName;
    public AST_EXP_LIST arg;

    /******************/
    /* CONSTRUCTOR(S) */
    /******************/
    public AST_STMT_ID_ARGS(String fieldName, AST_EXP_LIST arg){
        /******************************/
        /* SET A UNIQUE SERIAL NUMBER */
        /******************************/
        SerialNumber = AST_Node_Serial_Number.getFresh();

        /***************************************/
        /* PRINT CORRESPONDING DERIVATION RULE */
        /***************************************/
        System.out.print("====================== stmt -> ID(args);\n");

        /*******************************/
        /* COPY INPUT DATA NENBERS ... */
        /*******************************/

        this.fieldName = fieldName;
        this.arg = arg;
    }

    /****************************************************/
    /* The default message for an stmt ID ARGS AST node */
    /**************************************************/
    public void PrintMe()
    {
        /*****************************************/
        /* AST NODE TYPE = STMT ID ARGS AST NODE */
        /***************************************/
        System.out.print("AST NODE STMT ID ARGS\n");

        /**********************************************/
        /*  PRINT FIELD NAME, then RECURSIVELY PRINT EXP LIST ... */
        /**********************************************/
        System.out.format("FIELD NAME( %s )\n",fieldName);
        if (arg != null) arg.PrintMe();

        /***************************************/
        /* PRINT Node to AST GRAPHVIZ DOT file */
        /***************************************/
        AST_GRAPHVIZ.getInstance().logNode(
            SerialNumber,
            String.format("FIELD\nEXPLIST\n...->%s",fieldName));

        /****************************************/
        /* PRINT Edges to AST GRAPHVIZ DOT file */
        /****************************************/
        if (arg != null) AST_GRAPHVIZ.getInstance().logEdge(SerialNumber,arg.SerialNumber);
    }
}
