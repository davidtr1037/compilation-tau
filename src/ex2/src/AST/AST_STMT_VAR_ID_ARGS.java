package AST;

public class AST_STMT_VAR_ID_ARGS extends AST_STMT
{
	public AST_VAR var;
	public String fieldName;
    public AST_EXP_LIST arg;

    /******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_STMT_VAR_ID_ARGS(AST_VAR var,String fieldName, AST_EXP_LIST arg)
	{
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		SerialNumber = AST_Node_Serial_Number.getFresh();

		/***************************************/
		/* PRINT CORRESPONDING DERIVATION RULE */
		/***************************************/
		System.out.format("====================== stmt -> var DOT ID( %s ) expList\n",fieldName);

		/*******************************/
		/* COPY INPUT DATA NENBERS ... */
		/*******************************/
		this.var = var;
		this.fieldName = fieldName;
        this.arg = arg;
	}

	/*************************************************/
	/* The printing message for a var ID AST node */
	/*************************************************/
	public void PrintMe()
	{
		/*********************************/
		/* AST NODE TYPE = AST STMT VAR ID */
		/*********************************/
		System.out.print("AST NODE STMT VAR ID ARGS\n");

		/**********************************************/
		/* RECURSIVELY PRINT VAR, then FIELD NAME THEN RECURSIVELY PRINT EXPLIST ... */
		/**********************************************/
		if (var != null) var.PrintMe();
		System.out.format("FIELD NAME( %s )\n",fieldName);
        if (arg != null) arg.PrintMe();

		/***************************************/
		/* PRINT Node to AST GRAPHVIZ DOT file */
		/***************************************/
		AST_GRAPHVIZ.getInstance().logNode(
			SerialNumber,
			String.format("VAR\nFIELD\nEXPIST\n...->%s",fieldName));
		
		/****************************************/
		/* PRINT Edges to AST GRAPHVIZ DOT file */
		/****************************************/
		if (var != null) AST_GRAPHVIZ.getInstance().logEdge(SerialNumber,var.SerialNumber);
        if (arg != null) AST_GRAPHVIZ.getInstance().logEdge(SerialNumber,arg.SerialNumber);
    }
}
