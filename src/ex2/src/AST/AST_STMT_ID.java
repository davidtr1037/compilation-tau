package AST;
import

public class AST_STMT_ID extends AST_STMT
{
    public String fieldName;

    /******************/
    /* CONSTRUCTOR(S) */
    /******************/
    public AST_STMT_VAR_DEC(String fieldName){
        /******************************/
        /* SET A UNIQUE SERIAL NUMBER */
        /******************************/
        SerialNumber = AST_Node_Serial_Number.getFresh();

        /***************************************/
        /* PRINT CORRESPONDING DERIVATION RULE */
        /***************************************/
        System.out.print("====================== stmt -> ID();\n");

        /*******************************/
        /* COPY INPUT DATA NENBERS ... */
        /*******************************/

        this.fieldName = fieldName;
    }

    /****************************************************/
    /* The default message for an stmt ID AST node */
    /**************************************************/
    public void PrintMe()
    {
        /*****************************************/
        /* AST NODE TYPE = STMT ID AST NODE */
        /***************************************/
        System.out.print("AST NODE STMT ID\n");

        /********************************/
        /* PRINT FIELDNAME ... */
        /*******************************/
        System.out.format("FIELD NAME( %s )\n",fieldName);

        /***************************************/
        /* PRINT Node to AST GRAPHVIZ DOT file */
        /***************************************/
        AST_GRAPHVIZ.getInstance().logNode(
            SerialNumber,
            String.format("FIELD\n...->%s",fieldName));
    }
}
